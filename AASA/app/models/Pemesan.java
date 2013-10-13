package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 10/1/13
 * Time: 9:02 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Pemesan extends Model{

    @Id
    public Integer id;

    @Constraints.Required
    @Constraints.MaxLength(200)
    public String nama;

    @Constraints.Required
    @Constraints.MaxLength(200)
    @Constraints.Email
    public String email;

    @Constraints.Required
    @Constraints.MaxLength(200)
    public String no_handphone;

    public Integer anggota_id;

    public Integer pemesanan_id;

    public Pemesanan getPemesanan()
    {
        return Pemesanan.findById((long)pemesanan_id);
    }

    public static Finder<Long, Pemesan> find = new Finder<Long, Pemesan>(Long.class, Pemesan.class);

    public static List<Pemesan> findByAnggotaId(Long id) {
        return find.where().eq("anggota_id", id).findList();
    }

    public static Pemesan create(Pemesan pemesan) {
        pemesan.no_handphone = "+62" + pemesan.no_handphone;
        pemesan.save();
        return pemesan;
    }

    public static void update(Pemesan pemesan) {
        pemesan.update();
    }
}
