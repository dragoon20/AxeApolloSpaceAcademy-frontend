
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
object templateFormInline extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[views.html.helper.FieldElements,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(elements: views.html.helper.FieldElements):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper.twitterBootstrap._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
<div class="form-group """),_display_(Seq[Any](/*5.25*/if(elements.hasErrors)/*5.47*/ {_display_(Seq[Any](format.raw/*5.49*/("""error""")))})),format.raw/*5.55*/("""">
    <label class="col-lg-4 control-label" for=""""),_display_(Seq[Any](/*6.49*/elements/*6.57*/.id)),format.raw/*6.60*/("""">"""),_display_(Seq[Any](/*6.63*/elements/*6.71*/.label)),format.raw/*6.77*/("""</label>
    <div class="col-lg-8">
        """),_display_(Seq[Any](/*8.10*/elements/*8.18*/.input)),format.raw/*8.24*/("""
        """),_display_(Seq[Any](/*9.10*/if(elements.hasErrors)/*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
            <span class="help-inline">"""),_display_(Seq[Any](/*10.40*/elements/*10.48*/.errors.mkString(", "))),format.raw/*10.70*/("""</span>
        """)))}/*11.11*/else/*11.16*/{_display_(Seq[Any](format.raw/*11.17*/("""
            <span class="help-inline">"""),_display_(Seq[Any](/*12.40*/elements/*12.48*/.infos.mkString(", "))),format.raw/*12.69*/("""</span>
        """)))})),format.raw/*13.10*/("""
    </div>
    <div class="clear"></div>
</div>"""))}
    }
    
    def render(elements:views.html.helper.FieldElements): play.api.templates.HtmlFormat.Appendable = apply(elements)
    
    def f:((views.html.helper.FieldElements) => play.api.templates.HtmlFormat.Appendable) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 13 16:36:39 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/templateFormInline.scala.html
                    HASH: 08c08dc051a460e34495761fa38f5a2bc3f7300a
                    MATRIX: 812->1|982->44|1010->80|1070->105|1100->127|1139->129|1176->135|1262->186|1278->194|1302->197|1340->200|1356->208|1383->214|1463->259|1479->267|1506->273|1551->283|1581->305|1620->307|1696->347|1713->355|1757->377|1793->395|1806->400|1845->401|1921->441|1938->449|1981->470|2030->487
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|33->5|34->6|34->6|34->6|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13
                    -- GENERATED --
                */
            