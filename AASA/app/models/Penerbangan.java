package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 10/1/13
 * Time: 9:02 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Penerbangan extends Model{

    @Id
    public Integer id;

    @Constraints.Required
    @Constraints.MaxLength(100)
    public String kode_penerbangan;

    @Constraints.Required
    @Constraints.MaxLength(100)
    public String jam_berangkat;

    @Constraints.Required
    @Constraints.MaxLength(100)
    public String jam_tiba;

    @Constraints.Required
    @Constraints.MaxLength(100)
    public String tanggal;

    @Constraints.Required
    public Integer harga;

    @ManyToOne
    public Bandara bandara_asal;

    @ManyToOne
    public Bandara bandara_tujuan;

    @ManyToOne
    public Pesawat pesawat;

    public static Finder<Long, Penerbangan> find = new Finder<Long, Penerbangan>(Long.class, Penerbangan.class);

    public static List<Penerbangan> search(String asal, String tujuan, String tanggal)
    {
        List<Penerbangan> result = find.fetch("bandara_asal").fetch("bandara_tujuan").where().
                eq("bandara_asal.kode", asal).
                eq("bandara_tujuan.kode", tujuan).
                eq("tanggal", tanggal).
                findList();
        return result;
    }

}
