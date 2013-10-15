package models;

import controllers.Application;
import helpers.DuplicateEmailValidator;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.CharSet;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import helpers.PasswordValidator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 9/24/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Anggota extends Model {

    @Id
    public Integer id;

    @Constraints.Required
    @Constraints.MaxLength(200)
    @Constraints.Email
    @Constraints.ValidateWith(DuplicateEmailValidator.class)
    public String email;

    @Constraints.Required
    @Constraints.MaxLength(200)
    @Constraints.ValidateWith(PasswordValidator.class)
    public String sandi;

    @Transient
    @Constraints.ValidateWith(PasswordValidator.class)
    public String konfirmasi_sandi;

    @Constraints.Required
    @Constraints.MaxLength(200)
    public String nama;

    @Constraints.Required
    @Constraints.MaxLength(200)
    public String no_handphone;

    @Constraints.Required
    public String alamat;

    public String activation_code;

    public Integer is_activated;

    public List<Pemesan> getPemesan()
    {
        return Pemesan.findByAnggotaId((long)id);
    }

    public static Finder<Long, Anggota> find = new Finder<Long, Anggota>(
        Long.class, Anggota.class
    );

    public static Anggota authenticate(String email, String sandi) {
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.reset();
            md.update(sandi.getBytes("UTF-8"));
            byte[] mdbytes = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < mdbytes.length; i++) {
                sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            sandi = sb.toString();

        } catch (NoSuchAlgorithmException ex)
        {
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex)
        {
            ex.printStackTrace();
        }
        return find.where().eq("email", email).eq("sandi", sandi).eq("is_activated", 1).findUnique();
    }

    public static List<Anggota> all() {
        return new ArrayList<Anggota>();
    }

    public static Anggota create(Anggota anggota) {
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.reset();
            md.update(anggota.sandi.getBytes("UTF-8"));
            byte[] mdbytes = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < mdbytes.length; i++) {
                sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            anggota.sandi = sb.toString();

        } catch (NoSuchAlgorithmException ex)
        {
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex)
        {
            ex.printStackTrace();
        }

        anggota.no_handphone = "+62" + anggota.no_handphone;
        anggota.activation_code = String.valueOf(UUID.randomUUID());
        anggota.is_activated = 0;
        anggota.save();
        return anggota;
    }

    public Anggota update(Application.DataAnggota anggota) {
        this.nama = anggota.nama;
        this.email = anggota.email;
        this.no_handphone =  "+62" + anggota.no_handphone;
        this.alamat = anggota.alamat;

        update();
        return this;
    }

    public static Anggota findById(Long id)
    {
        return find.byId(id);
    }

    public static Anggota findByEmail(String email)
    {
        return find.where().eq("email", email).findUnique();
    }

    public static boolean checkEmail(String email)
    {
        return (find.where().eq("email", email).findUnique()==null);
    }

    public static void changePass(String code, String newPass)
    {
        Anggota anggota = find.where().eq("activation_code", code).findUnique();
        anggota.sandi = newPass;

        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.reset();
            md.update(anggota.sandi.getBytes("UTF-8"));
            byte[] mdbytes = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < mdbytes.length; i++) {
                sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            anggota.sandi = sb.toString();

        } catch (NoSuchAlgorithmException ex)
        {
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex)
        {
            ex.printStackTrace();
        }

        anggota.save();
    }

    public static boolean activate(String activation_code) {
        Anggota anggota = find.where().eq("activation_code", activation_code).eq("is_activated", 0).findUnique();
        if (anggota==null)
        {
            return false;
        }
        else
        {
            anggota.is_activated = 1;
            anggota.save();
            return true;
        }
    }

    public static boolean checkCode(String code) {
        Anggota anggota = find.where().eq("activation_code", code).findUnique();
        if (anggota==null)
        {
            return false;
        }
        else
        {
            anggota.is_activated = 1;
            anggota.save();
            return true;
        }
    }

    public static String generateActivationCode(String email)
    {
        Anggota anggota = find.where().eq("email", email).findUnique();
        anggota.activation_code = String.valueOf(UUID.randomUUID());
        anggota.save();

        return anggota.activation_code;
    }

    public static void delete(Integer id) {
    }
}
