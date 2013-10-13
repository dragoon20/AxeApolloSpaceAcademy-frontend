package models;

import helpers.BandaraComparator;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 9/30/13
 * Time: 9:54 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Refund extends Model {

    @Id
    public Integer id;

    @Constraints.Required
    public Long pemesanan_id;

    public static Finder<Long, Refund> find = new Finder<Long, Refund>(
        Long.class, Refund.class
    );

    public static Refund save(Refund refund) {
        refund.save();
        return refund;
    }
}
