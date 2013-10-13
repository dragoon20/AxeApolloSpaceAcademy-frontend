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
public class Penumpang extends Model{

    @Id
    public Integer id;

    @ManyToOne
    public Pemesanan pemesanan;

    @Constraints.Required
    @Constraints.MaxLength(100)
    public String titel;

    @Constraints.Required
    @Constraints.MaxLength(200)
    public String nama;

    @Constraints.MaxLength(20)
    public String no_kursi;

    public Integer is_checkin;

    @Transient
    public Integer pemesanan_id;

    public static Finder<Long, Penumpang> find = new Finder<Long, Penumpang>(Long.class, Penumpang.class);

    public static Penumpang create(Penumpang penumpang) {
        penumpang.no_kursi = "";
        penumpang.is_checkin = 0;
        penumpang.pemesanan = Pemesanan.findById((long)penumpang.pemesanan_id);
        penumpang.save();
        return penumpang;
    }

}
