package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 10/1/13
 * Time: 9:06 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Pesawat extends Model{

    @Id
    public Integer id;

    @Constraints.Required
    @Constraints.MaxLength(300)
    public String nama;

    @Constraints.Required
    public Integer total_kursi;

}
