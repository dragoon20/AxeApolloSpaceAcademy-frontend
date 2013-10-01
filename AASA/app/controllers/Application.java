package controllers;

import models.Anggota;
import models.Bandara;
import models.Pencarian;
import models.Penerbangan;
import play.api.i18n.Lang;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Transactional;
import play.mvc.*;

import views.html.index;
import views.html.login;
import views.html.register;
import views.html.search;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Application extends Controller {

    public static class Login {

        public String email;
        public String sandi;

        public String validate() {
            if (Anggota.authenticate(email, sandi) == null)
            {
                return "Invalid user or password";
            }
            return null;
        }
    }

    public static Result index() {
        return ok(index.render(Bandara.all(), Form.form(Pencarian.class), session("email")));
    }

    public static Result register() {
        if (session("email")!=null)
        {
            return redirect("/");
        }
        else
        {
            return ok(register.render(Form.form(Anggota.class)));
        }
    }

    public static Result login() {
        if (session("email")!=null)
        {
            return redirect("/");
        }
        else
        {
            return ok(login.render(Form.form(Login.class)));
        }
    }

    public static Result logout() {
        session().clear();
        return redirect("/");
    }

    public static Result search() {
        Form<Pencarian> pencarianForm = Form.form(Pencarian.class).bindFromRequest();
        Pencarian pencarian = pencarianForm.get();
        pencarian.timestamp = new Date().toString();
        Pencarian.save(pencarian);  // logging

        String kode_bandara_asal = pencarian.asal.substring(pencarian.asal.indexOf('(')+1, pencarian.asal.indexOf(')'));
        String kode_bandara_tujuan = pencarian.tujuan.substring(pencarian.tujuan.indexOf('(')+1, pencarian.tujuan.indexOf(')'));
        List<Penerbangan> searchResult = Penerbangan.search(kode_bandara_asal, kode_bandara_tujuan, pencarian.tanggal_berangkat);

        return ok(search.render(searchResult, session("email")));
    }

    public static Result doLogin() {
        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
        if (loginForm.hasErrors())
        {
            return badRequest(login.render(loginForm));
        }
        else
        {
            session("email", loginForm.get().email);
            return redirect("/");
        }
    }

    @Transactional
    public static Result newAnggota() {
        Form<Anggota> filledForm = Form.form(Anggota.class).bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                register.render(filledForm)
            );
        } else {
            Anggota.create(filledForm.get());
            return redirect("/");
        }
    }

}
