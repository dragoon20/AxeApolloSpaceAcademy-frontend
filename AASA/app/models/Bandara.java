package models;

import helpers.BandaraComparator;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 9/30/13
 * Time: 9:54 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Bandara extends Model {

    @Id
    public Integer id;

    @Constraints.Required
    @Constraints.MaxLength(200)
    public String nama;

    @Constraints.Required
    @Constraints.MaxLength(10)
    public String kode;

    @Constraints.Required
    @Constraints.MaxLength(100)
    public String daerah;

    @Constraints.Required
    public Integer biaya;

    public static Finder<Long, Bandara> find = new Finder<Long, Bandara>(
        Long.class, Bandara.class
    );

    public static List<Bandara> all() {
        List<Bandara> result = find.all();
        Collections.sort(result, new BandaraComparator());
        return result;
    }
}
