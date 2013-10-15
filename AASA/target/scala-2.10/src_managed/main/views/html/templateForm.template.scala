
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
object templateForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[views.html.helper.FieldElements,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(elements: views.html.helper.FieldElements):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper.twitterBootstrap._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
<div class="form-group """),_display_(Seq[Any](/*5.25*/if(elements.hasErrors)/*5.47*/ {_display_(Seq[Any](format.raw/*5.49*/("""error""")))})),format.raw/*5.55*/("""">
    <label for=""""),_display_(Seq[Any](/*6.18*/elements/*6.26*/.id)),format.raw/*6.29*/("""">"""),_display_(Seq[Any](/*6.32*/elements/*6.40*/.label)),format.raw/*6.46*/("""</label>
    <div>
        """),_display_(Seq[Any](/*8.10*/elements/*8.18*/.input)),format.raw/*8.24*/("""
        """),_display_(Seq[Any](/*9.10*/if(elements.hasErrors)/*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
        <span class="help-inline">"""),_display_(Seq[Any](/*10.36*/elements/*10.44*/.errors.mkString(", "))),format.raw/*10.66*/("""</span>
        """)))}/*11.11*/else/*11.16*/{_display_(Seq[Any](format.raw/*11.17*/("""
        <span class="help-inline">"""),_display_(Seq[Any](/*12.36*/elements/*12.44*/.infos.mkString(", "))),format.raw/*12.65*/("""</span>
        """)))})),format.raw/*13.10*/("""
    </div>
</div>"""))}
    }
    
    def render(elements:views.html.helper.FieldElements): play.api.templates.HtmlFormat.Appendable = apply(elements)
    
    def f:((views.html.helper.FieldElements) => play.api.templates.HtmlFormat.Appendable) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 13 16:36:39 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/templateForm.scala.html
                    HASH: 9364a938a02cf3b2bafb24800850d59d3a7b9621
                    MATRIX: 806->1|976->44|1004->80|1064->105|1094->127|1133->129|1170->135|1225->155|1241->163|1265->166|1303->169|1319->177|1346->183|1409->211|1425->219|1452->225|1497->235|1527->257|1566->259|1638->295|1655->303|1699->325|1735->343|1748->348|1787->349|1859->385|1876->393|1919->414|1968->431
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|33->5|34->6|34->6|34->6|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13
                    -- GENERATED --
                */
            