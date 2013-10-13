package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 10/1/13
 * Time: 9:02 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Pemesanan extends Model{

    public Pemesanan(Penerbangan penerbangan)
    {
        this.penerbangan = penerbangan;
    }

    @Id
    public Integer id;

    @Constraints.Required
    @Constraints.MaxLength(100)
    public String kode_booking;

    @ManyToOne
    public Penerbangan penerbangan;

    @OneToMany
    public List<Penumpang> penumpang;

    public static Finder<Long, Pemesanan> find = new Finder<Long, Pemesanan>(Long.class, Pemesanan.class);

    public static Pemesanan findById(Long id)
    {
        return find.byId(id);
    }

    public static Pemesanan create(Pemesanan pemesanan) {
        Random generator = new Random();
        generator.setSeed(System.currentTimeMillis());

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<6;++i)
        {
            int x = generator.nextInt(36);
            if (x <10)
            {
                sb.append(x);
            }
            else
            {
                x -= 10;
                sb.append((char)(x + 65));
            }
        }
        pemesanan.kode_booking = sb.toString();
        pemesanan.save();
        return pemesanan;
    }
}
