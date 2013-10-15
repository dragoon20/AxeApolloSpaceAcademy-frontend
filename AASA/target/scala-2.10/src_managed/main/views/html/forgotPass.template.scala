
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
object forgotPass extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Forgot],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(forgotForm: Form[Application.Forgot]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
implicit def /*3.2*/implicitField/*3.15*/ = {{ views.html.helper.FieldConstructor(templateFormInline.f) }};
Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*3.79*/("""

"""),_display_(Seq[Any](/*5.2*/main("Axe Appolo Space Academy - Lupa Sandi")/*5.47*/ {_display_(Seq[Any](format.raw/*5.49*/("""

    <div id="main-content">
        <div id="content-title">Lupa Sandi Anda?</div>
        <div id="content-description">
            Kita semua pernah mengalaminya. Cukup masukkan info Anda di bawah ini dan kami akan mengirim email berupa rincian untuk mereset kata sandi Anda.
        </div>
        <div id="forgotForm">
            """),_display_(Seq[Any](/*13.14*/helper/*13.20*/.form(action = routes.Application.sendChangePass())/*13.71*/ {_display_(Seq[Any](format.raw/*13.73*/("""

                """),_display_(Seq[Any](/*15.18*/if(forgotForm.hasGlobalErrors())/*15.50*/ {_display_(Seq[Any](format.raw/*15.52*/("""
                    <div class="help-error">"""),_display_(Seq[Any](/*16.46*/forgotForm/*16.56*/.globalError().message())),format.raw/*16.80*/("""</div>
                """)))})),format.raw/*17.18*/("""

                """),_display_(Seq[Any](/*19.18*/helper/*19.24*/.inputText(forgotForm("email"), '_label -> "Alamat Email", '_showConstraints -> false, 'class -> "form-control"))),format.raw/*19.136*/("""

                <button type="submit" class="btn btn-primary right">Kirim</button>
                <div class="clear"></div>
            """)))})),format.raw/*23.14*/("""
        </div>
    </div>

""")))}/*27.2*/ {_display_(Seq[Any](format.raw/*27.4*/("""
    <style>
        #forgotForm
        """),format.raw/*30.9*/("""{"""),format.raw/*30.10*/("""
            margin-top: 20px;
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""
    </style>
""")))}/*34.2*/ {_display_(Seq[Any](format.raw/*34.4*/("""
""")))})))}
    }
    
    def render(forgotForm:Form[Application.Forgot]): play.api.templates.HtmlFormat.Appendable = apply(forgotForm)
    
    def f:((Form[Application.Forgot]) => play.api.templates.HtmlFormat.Appendable) = (forgotForm) => apply(forgotForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 13 16:36:38 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/forgotPass.scala.html
                    HASH: cc3b97dd4ef0c8f2e39400623dce639eb3e22e63
                    MATRIX: 797->1|921->42|942->55|1036->39|1065->119|1102->122|1155->167|1194->169|1569->508|1584->514|1644->565|1684->567|1739->586|1780->618|1820->620|1902->666|1921->676|1967->700|2023->724|2078->743|2093->749|2228->861|2400->1001|2447->1030|2486->1032|2554->1073|2583->1074|2649->1113|2678->1114|2711->1129|2750->1131
                    LINES: 26->1|28->3|28->3|29->1|31->3|33->5|33->5|33->5|41->13|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|45->17|47->19|47->19|47->19|51->23|55->27|55->27|58->30|58->30|60->32|60->32|62->34|62->34
                    -- GENERATED --
                */
            