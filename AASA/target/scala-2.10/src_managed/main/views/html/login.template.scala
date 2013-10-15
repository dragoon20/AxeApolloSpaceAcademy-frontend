
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
implicit def /*3.2*/implicitField/*3.15*/ = {{ views.html.helper.FieldConstructor(templateFormInline.f) }};
Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*3.79*/("""

"""),_display_(Seq[Any](/*5.2*/main("Axe Appolo Space Academy")/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
    <div id="main-content">
        <div class="content-title">
            Hanya yang terbaik untuk anggota kami
        </div>
        <p>
            Menjadi Anggota Erlangga Airlines berarti bahwa yang perlu Anda lakukan cukup hanya
            menyimpan semua rincian Anda sekali dan itu akan dapat diakses dari mana pun Anda
            login. Dengan keanggotaan Erlangga Airlines, ini hanya sekadar login untuk membeli
            penerbangan Anda, buletin mingguan, atau keanggotaan maskapai lama yang biasa.
            Temukan sendiri dan lihat manfaat istimewa bagi anggota yang mengagumkan di bawah ini!
        </p>
        <!--<div id="benefits">
            Dapatkan keuntungan berupa:
        </div>-->
    </div>
    <div id="sidebar">
        <div id="loginForm">
            """),_display_(Seq[Any](/*23.14*/helper/*23.20*/.form(action = routes.Application.doLogin())/*23.64*/ {_display_(Seq[Any](format.raw/*23.66*/("""

                <div class="form-title">LOGIN ANGGOTA</div>
                """),_display_(Seq[Any](/*26.18*/if(loginForm.hasGlobalErrors())/*26.49*/ {_display_(Seq[Any](format.raw/*26.51*/("""
                    <div class="help-error">"""),_display_(Seq[Any](/*27.46*/loginForm/*27.55*/.globalError().message())),format.raw/*27.79*/("""</div>
                """)))})),format.raw/*28.18*/("""

                """),_display_(Seq[Any](/*30.18*/helper/*30.24*/.inputText(loginForm("email"), '_label -> "Alamat Email", '_showConstraints -> false, 'class -> "form-control"))),format.raw/*30.135*/("""
                """),_display_(Seq[Any](/*31.18*/helper/*31.24*/.inputPassword(loginForm("sandi"), '_label -> "Sandi", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*31.131*/("""
                <div id="forgot_link">
                    <a href="forgot_pass">Lupa Sandi?</a>
                </div>

                <button type="submit" class="btn btn-primary right">Login</button>
                <div class="clear"></div>
            """)))})),format.raw/*38.14*/("""
        </div>
        <div id="registerInfo">
            <div class="form-title">BELUM MENJADI ANGGOTA?</div>
            <p>
                Jadilah anggota sekarang dan rasakan pengalaman pembelian cepat dengan manfaat istimewa!
            </p>
            <a href="register" class="btn btn-primary right">Daftar</a>
            <div class="clear"></div>
        </div>
    </div>
    <div class="clear"></div>
""")))}/*50.2*/ {_display_(Seq[Any](format.raw/*50.4*/("""
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*51.46*/routes/*51.52*/.Assets.at("stylesheets/form.css"))),format.raw/*51.86*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*52.46*/routes/*52.52*/.Assets.at("stylesheets/login.css"))),format.raw/*52.87*/("""">
""")))}/*53.2*/ {_display_(Seq[Any](format.raw/*53.4*/("""
""")))})),format.raw/*54.2*/("""
"""))}
    }
    
    def render(loginForm:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(loginForm)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 14 00:15:53 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/login.scala.html
                    HASH: 757bfaac7e3d00af0e43cf0616ac4a4c2cdddb7d
                    MATRIX: 791->1|913->40|934->53|1028->37|1057->117|1094->120|1134->152|1173->154|2005->950|2020->956|2073->1000|2113->1002|2228->1081|2268->1112|2308->1114|2390->1160|2408->1169|2454->1193|2510->1217|2565->1236|2580->1242|2714->1353|2768->1371|2783->1377|2913->1484|3205->1744|3641->2162|3680->2164|3762->2210|3777->2216|3833->2250|3917->2298|3932->2304|3989->2339|4011->2343|4050->2345|4083->2347
                    LINES: 26->1|28->3|28->3|29->1|31->3|33->5|33->5|33->5|51->23|51->23|51->23|51->23|54->26|54->26|54->26|55->27|55->27|55->27|56->28|58->30|58->30|58->30|59->31|59->31|59->31|66->38|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|82->54
                    -- GENERATED --
                */
            