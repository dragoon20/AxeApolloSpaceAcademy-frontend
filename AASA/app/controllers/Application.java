package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.typesafe.plugin.MailerAPI;
import com.typesafe.plugin.MailerPlugin;
import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.validation.Constraints;
import play.db.ebean.Transactional;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application extends Controller {

    public static class Login {

        public String email;
        public String sandi;

        public String validate() {
            Anggota anggota = Anggota.authenticate(email, sandi);
            if (anggota == null)
            {
                return "Alamat email atau sandi salah.";
            }
            else
            {
                Log_Login logLogin = new Log_Login(anggota);
                logLogin.timestamp = new Date().toString();
                Log_Login.save(logLogin);  // logging
                return null;
            }
        }
    }

    public static class Forgot {

        public String email;

        public String validate() {
            if (Anggota.checkEmail(email))
            {
                return "Alamat email tidak terdaftar.";
            }
            else
            {
                return null;
            }
        }
    }

    public static class ChangePass {

        public String code;
        public String sandi;
        public String konfirmasi_sandi;

        public String validate() {
            if (!sandi.equals(konfirmasi_sandi))
            {
                return "Sandi dan konfirmasi tidak sama.";
            }
            else
            {
                return null;
            }
        }
    }

    public static class DataAnggota {

        @Constraints.Required
        public String nama;

        @Constraints.Required
        public String email;

        @Constraints.Required
        public String no_handphone;

        @Constraints.Required
        public String alamat;

        public String validate() {
            return null;
        }
    }

    public static Result index() {
        return ok(index.render(Bandara.all(), Form.form(Log_Pencarian.class), session("email")));
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

    public static Result profile() {
        if (session("email")==null)
        {
            return redirect("/login");
        }
        else
        {
            Form<Anggota> form = Form.form(Anggota.class);
            Anggota anggota = Anggota.findByEmail(session("email"));
            anggota.no_handphone = anggota.no_handphone.substring(3);
            form = form.fill(anggota);

            List<Pemesan> pemesan = new ArrayList<Pemesan>();
            if (anggota.getPemesan()!=null)
            {
                pemesan.addAll(anggota.getPemesan());
            }

            return ok(profile.render(form, pemesan, session("email")));
        }
    }

    public static Result changeAnggotaData() {
        Form<DataAnggota> filledForm = Form.form(DataAnggota.class).bindFromRequest();

        if (filledForm.hasErrors())
        {
            return redirect("/profile");
        }
        else
        {
            DataAnggota anggota = filledForm.get();
            Anggota anggota_logged = Anggota.findByEmail(session("email"));
            anggota_logged.update(anggota);
            anggota_logged.no_handphone = anggota_logged.no_handphone.substring(3);

            return redirect("/profile");
        }
    }

    public static Result search() {
        Form<Log_Pencarian> pencarianForm = Form.form(Log_Pencarian.class).bindFromRequest();
        Log_Pencarian logPencarian = pencarianForm.get();
        logPencarian.timestamp = new Date().toString();
        Log_Pencarian.save(logPencarian);  // logging

        String kode_bandara_asal = logPencarian.asal.substring(logPencarian.asal.indexOf('(')+1, logPencarian.asal.indexOf(')'));
        String kode_bandara_tujuan = logPencarian.tujuan.substring(logPencarian.tujuan.indexOf('(')+1, logPencarian.tujuan.indexOf(')'));
        List<Penerbangan> searchResult = Penerbangan.search(kode_bandara_asal, kode_bandara_tujuan, logPencarian.tanggal_berangkat, logPencarian.jumlah_penumpang);
        if (logPencarian.sekali_jalan == 1)
        {
            return TODO;
        }
        else
        {
            return ok(search.render(Bandara.all(), pencarianForm, searchResult, logPencarian.jumlah_penumpang, session("email")));
        }
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

    public static Result newAnggota() {
        Form<Anggota> filledForm = Form.form(Anggota.class).bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                register.render(filledForm)
            );
        } else {
            Anggota anggota = Anggota.create(filledForm.get());

            MailerAPI mail = play.Play.application().plugin(MailerPlugin.class).email();
            mail.setSubject("Aktivasi Anggota Erlangga Airlines");
            mail.setRecipient(anggota.email);
            mail.setFrom("no-reply-erlangga-airlines <no.reply.erlangga@gmail.com>");
            mail.sendHtml("<html><body>"+
                    "Terima kasih telah mendaftar menjadi anggota Erlangga Airlines.<br />"+
                    "Aktifkan keanggotaan anda dengan mengklik link berikut:<br />"+
                    "<a href='http://"+request().host()+"/activate?activation_code="+anggota.activation_code+"'>http://"+request().host()+"/activate?activation_code="+anggota.activation_code+"</a>"+
                    "</body></html>");

            return ok(message.render("Registrasi berhasil",
                    "Terima kasih telah mendaftar menjadi anggota Erlangga Airlines. " +
                            "Sebuah email telah dikirimkan kepada anda untuk melakukan aktivasi akun. " +
                            "Silahkan menuju link pada email tersebut untuk mengaktivasikan keanggotaan anda.",
                    session("email")));
        }
    }

    public static Result activateAnggota(String activation_code) {
        if (Anggota.activate(activation_code)) {
            return ok(message.render("Aktivasi berhasil",
                    "Akun anda telah berhasil diverifikasi dan telah diaktifkan, sekarang anda dapat login "+
                    "untuk menerima manfaat-manfaat dari menjadi anggota Erlangga Airlines.",
                    session("email")));
        }
        else
        {
            return notFound(notFound.render(session("email")));
        }
    }

    public static Result forgotPass() {
        if (session("email")!=null)
        {
            return redirect("/");
        }
        else
        {
            return ok(forgotPass.render(Form.form(Forgot.class)));
        }
    }

    public static Result sendChangePass() {
        Form<Forgot> forgotForm = Form.form(Forgot.class).bindFromRequest();
        if (forgotForm.hasErrors())
        {
            return badRequest(forgotPass.render(forgotForm));
        }
        else
        {
            Forgot forgot = forgotForm.get();

            String code = Anggota.generateActivationCode(forgot.email);

            MailerAPI mail = play.Play.application().plugin(MailerPlugin.class).email();
            mail.setSubject("Ganti Sandi Anggota");
            mail.setRecipient(forgot.email);
            mail.setFrom("no-reply-erlangga-airlines <no.reply.erlangga@gmail.com>");
            mail.sendHtml("<html><body>"+
                    "Anda dapat mengganti sandi anda dengan mengklik link berikut:<br />"+
                    "<a href='http://"+request().host()+"/change_pass?code="+code+"'>http://"+request().host()+"/change_pass?code="+code+"</a>"+
                    "</body></html>");

            return redirect("/");
        }
    }

    public static Result changePass(String code) {
        if (Anggota.checkCode(code))
        {
            return ok(changePass.render(Form.form(ChangePass.class), code));
        }
        else
        {
            return notFound(notFound.render(session("email")));
        }
    }

    public static Result doChangePass() {
        Form<ChangePass> changeForm = Form.form(ChangePass.class).bindFromRequest();
        if (changeForm.hasErrors())
        {
            return badRequest(changePass.render(changeForm, changeForm.get().code));
        }
        else
        {
            ChangePass changePass = changeForm.get();
            Anggota.changePass(changePass.code, changePass.sandi);

            return ok(message.render("Sandi telah berhasil diganti",
                    "Sandi anda telah berhasil diganti. " +
                            "Silahkan login kembali.",
                    session("email")));
        }
    }

    public static Result askRefund()
    {
        DynamicForm form = DynamicForm.form().bindFromRequest();
        Refund refund = new Refund();
        refund.pemesanan_id = Long.valueOf(form.get("pemesanan_id"));
        Refund.save(refund);

        ObjectNode result = Json.newObject();

        result.put("status", "success");
        return ok(result);
    }
}
