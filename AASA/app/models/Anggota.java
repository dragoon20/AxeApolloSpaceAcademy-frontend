package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;
import helpers.PasswordValidator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

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

    public static Finder<Long, Anggota> find = new Finder<Long, Anggota>(
        Long.class, Anggota.class
    );

    public static Anggota authenticate(String email, String sandi) {
        return find.where().eq("email", email).eq("sandi", sandi).findUnique();
    }

    public static List<Anggota> all() {
        return new ArrayList<Anggota>();
    }

    public static void create(Anggota anggota) {
        anggota.save();
    }

    public static void delete(Integer id) {
    }
}
