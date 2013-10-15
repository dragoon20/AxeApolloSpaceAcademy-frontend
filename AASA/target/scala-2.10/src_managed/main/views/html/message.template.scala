
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
object message extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, message: String, isLogin: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""

"""),_display_(Seq[Any](/*3.2*/main("Axe Appolo Space Academy "+title, isLogin)/*3.50*/ {_display_(Seq[Any](format.raw/*3.52*/("""

    <div id="main-content">
        <div class="content-title">"""),_display_(Seq[Any](/*6.37*/title)),format.raw/*6.42*/("""</div>
        <div id="content-description">
            """),_display_(Seq[Any](/*8.14*/message)),format.raw/*8.21*/("""
        </div>
    </div>

""")))}/*12.2*/ {_display_(Seq[Any](format.raw/*12.4*/("""
""")))}/*13.2*/ {_display_(Seq[Any](format.raw/*13.4*/("""
""")))})))}
    }
    
    def render(title:String,message:String,isLogin:String): play.api.templates.HtmlFormat.Appendable = apply(title,message,isLogin)
    
    def f:((String,String,String) => play.api.templates.HtmlFormat.Appendable) = (title,message,isLogin) => apply(title,message,isLogin)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 13 19:11:41 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/message.scala.html
                    HASH: 70ff988e349fba664778f9476f29af8c48885e08
                    MATRIX: 790->1|933->50|970->53|1026->101|1065->103|1166->169|1192->174|1286->233|1314->240|1361->269|1400->271|1420->273|1459->275
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|36->8|36->8|40->12|40->12|41->13|41->13
                    -- GENERATED --
                */
            