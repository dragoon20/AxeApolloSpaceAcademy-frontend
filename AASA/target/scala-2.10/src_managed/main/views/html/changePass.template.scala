
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
object changePass extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Application.ChangePass],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(changeForm: Form[Application.ChangePass], code: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
implicit def /*3.2*/implicitField/*3.15*/ = {{ views.html.helper.FieldConstructor(templateFormInline.f) }};
Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.79*/("""

"""),_display_(Seq[Any](/*5.2*/main("Axe Appolo Space Academy - Ganti Sandi")/*5.48*/ {_display_(Seq[Any](format.raw/*5.50*/("""

    <div id="main-content">
        <div class="content-title">Ganti Sandi</div>
        <div id="changeForm">
            """),_display_(Seq[Any](/*10.14*/helper/*10.20*/.form(action = routes.Application.doChangePass())/*10.69*/ {_display_(Seq[Any](format.raw/*10.71*/("""

                <input type="hidden" name="code" value=""""),_display_(Seq[Any](/*12.58*/code)),format.raw/*12.62*/("""" />
                """),_display_(Seq[Any](/*13.18*/if(changeForm.hasGlobalErrors())/*13.50*/ {_display_(Seq[Any](format.raw/*13.52*/("""
                    <div class="help-error">"""),_display_(Seq[Any](/*14.46*/changeForm/*14.56*/.globalError().message())),format.raw/*14.80*/("""</div>
                """)))})),format.raw/*15.18*/("""

                """),_display_(Seq[Any](/*17.18*/helper/*17.24*/.inputPassword(changeForm("sandi"), '_label -> "Sandi", '_showConstraints -> false, 'class -> "form-control"))),format.raw/*17.133*/("""
                """),_display_(Seq[Any](/*18.18*/helper/*18.24*/.inputPassword(changeForm("konfirmasi_sandi"), '_label -> "Konfirmasi Sandi", '_showConstraints -> false, 'class -> "form-control"))),format.raw/*18.155*/("""

                <button type="submit" class="btn btn-primary right">Ganti</button>
                <div class="clear"></div>
            """)))})),format.raw/*22.14*/("""
        </div>
    </div>

""")))}/*26.2*/ {_display_(Seq[Any](format.raw/*26.4*/("""
    <style>
        #changeForm
        """),format.raw/*29.9*/("""{"""),format.raw/*29.10*/("""
            margin-top: 20px;
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
    </style>
""")))}/*33.2*/ {_display_(Seq[Any](format.raw/*33.4*/("""
""")))})))}
    }
    
    def render(changeForm:Form[Application.ChangePass],code:String): play.api.templates.HtmlFormat.Appendable = apply(changeForm,code)
    
    def f:((Form[Application.ChangePass],String) => play.api.templates.HtmlFormat.Appendable) = (changeForm,code) => apply(changeForm,code)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 13 16:36:38 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/changePass.scala.html
                    HASH: 30466e0a72489fbc7aeb298df43260f575a9823f
                    MATRIX: 808->1|950->60|971->73|1065->57|1094->137|1131->140|1185->186|1224->188|1386->314|1401->320|1459->369|1499->371|1594->430|1620->434|1678->456|1719->488|1759->490|1841->536|1860->546|1906->570|1962->594|2017->613|2032->619|2164->728|2218->746|2233->752|2387->883|2559->1023|2606->1052|2645->1054|2713->1095|2742->1096|2808->1135|2837->1136|2870->1151|2909->1153
                    LINES: 26->1|28->3|28->3|29->1|31->3|33->5|33->5|33->5|38->10|38->10|38->10|38->10|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|45->17|45->17|45->17|46->18|46->18|46->18|50->22|54->26|54->26|57->29|57->29|59->31|59->31|61->33|61->33
                    -- GENERATED --
                */
            