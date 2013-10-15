
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
object notFound extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(isLogin: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Axe Appolo Space Academy", isLogin)/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""

    <div id="content">
        <div class="content-title">Error 404</div>
        <div id="content-description">
            Halaman yang anda cari tidak dapat ditemukan. <br />
            <a href="/">Kembali ke halaman utama.</a>
        </div>
    </div>

""")))}/*13.2*/ {_display_(Seq[Any](format.raw/*13.4*/("""
""")))}/*14.2*/ {_display_(Seq[Any](format.raw/*14.4*/("""
""")))})))}
    }
    
    def render(isLogin:String): play.api.templates.HtmlFormat.Appendable = apply(isLogin)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (isLogin) => apply(isLogin)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 13 16:36:38 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/notFound.scala.html
                    HASH: bb0d539df78d0edb39cdde65327a181c628b5253
                    MATRIX: 777->1|888->18|925->21|974->62|1013->64|1293->326|1332->328|1352->330|1391->332
                    LINES: 26->1|29->1|31->3|31->3|31->3|41->13|41->13|42->14|42->14
                    -- GENERATED --
                */
            