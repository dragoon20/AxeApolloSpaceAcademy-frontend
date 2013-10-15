package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import play.api.libs.json.JsPath;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Transactional;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 10/13/13
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Booking extends Controller {

    public static class Payment {

        public String nomor;
        public String nama;
        public String cvv;
        public String valid_until;
        public String kota;
        public String alamat;
        public String kode_pos;
        public String telepon;

        public String validate() {
            return null;
        }
    }

    public static Result order(Long id, Long jumlah_penumpang) {
        Pemesanan pemesanan = Pemesanan.create(new Pemesanan(Penerbangan.findById(id)));
        Pemesan pemesan = new Pemesan();
        if (session("email")!=null)
        {
            Anggota anggota = Anggota.findByEmail(session("email"));
            pemesan.anggota_id = anggota.id;
        }
        else
        {
            pemesan.anggota_id = 0;
        }
        pemesan.pemesanan_id = pemesanan.id;
        pemesan.nama = "a";
        pemesan.email = "test@test.com";
        pemesan.no_handphone ="12312";
        pemesan = Pemesan.create(pemesan);

        return ok(bookingData.render(Form.form(Pemesan.class), jumlah_penumpang, pemesanan, pemesan.id, session("email")));
    }

    public static Result addOrderer() {
        ObjectNode result = Json.newObject();

        Form<Pemesan> filledForm = Form.form(Pemesan.class).bindFromRequest();
        if (filledForm.hasErrors())
        {
            result.put("status", "fail");
        }
        else
        {
            Pemesan pemesan = filledForm.get();
            Pemesan.update(pemesan);
            result.put("status", "success");
        }
        return ok(result);
    }

    public static Result addPassenger() {
        ObjectNode result = Json.newObject();
        Form<Penumpang> filledForm = Form.form(Penumpang.class).bindFromRequest();

        if (filledForm.hasErrors())
        {
            result.put("status", "fail");
        }
        else
        {
            Penumpang penumpang = filledForm.get();
            Penumpang.create(penumpang);
            result.put("status", "success");
        }
        return ok(result);
    }

    public static Result payment(Long id) {
        Pemesanan pemesanan = Pemesanan.findById(id);
        return ok(payment.render(pemesanan, Form.form(Payment.class), (long)(pemesanan.penerbangan.harga*pemesanan.penumpang.size()), session("email")));
    }

    public static Result sendBooking() {
        DynamicForm form = DynamicForm.form().bindFromRequest();
        Long id = Long.parseLong(form.get("id"));
        Pemesanan.makePaid(id);

        ObjectNode result = Json.newObject();
        result.put("status", "success");
        return ok(result);
    }
}
