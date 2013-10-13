package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 10/1/13
 * Time: 9:02 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Pegawai extends Model{

    @Id
    public Integer id;

    public String nama;

    public String kode_job;

    public static Finder<Long, Pegawai> find = new Finder<Long, Pegawai>(Long.class, Pegawai.class);

    public static Pegawai create(Pegawai pemesan) {
        pemesan.save();
        return pemesan;
    }
}
