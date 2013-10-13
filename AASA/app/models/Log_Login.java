package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 9/30/13
 * Time: 8:16 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Log_Login extends Model {

    public Log_Login(Anggota anggota)
    {
        this.anggota = anggota;
    }

    @Id
    public Integer id;

    @OneToOne
    public Anggota anggota;

    @Constraints.MaxLength(100)
    public String timestamp;

    public static void save(Log_Login logLogin) {
        logLogin.save();
    }
}
