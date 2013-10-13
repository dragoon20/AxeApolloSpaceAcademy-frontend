package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 9/30/13
 * Time: 8:16 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Log_Pencarian extends Model {

    @Id
    public Integer id;

    @Constraints.Required
    @Constraints.MaxLength(100)
    public String asal;

    @Constraints.Required
    @Constraints.MaxLength(100)
    public String tujuan;

    @Constraints.Required
    @Constraints.MaxLength(100)
    public String tanggal_berangkat;

    @Constraints.MaxLength(100)
    public String tanggal_kembali;

    @Constraints.Required
    public Integer jumlah_penumpang;

    @Constraints.MaxLength(100)
    public String timestamp;

    public Integer sekali_jalan;

    public static void save(Log_Pencarian logPencarian) {
        logPencarian.sekali_jalan = 0;
        logPencarian.save();
    }
}
