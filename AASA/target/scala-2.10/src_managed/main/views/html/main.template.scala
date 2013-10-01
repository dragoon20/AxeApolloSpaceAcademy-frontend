
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, isLogin: String = null)(content: Html)(extraCSS: Html)(extraJS: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.87*/("""

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>"""),_display_(Seq[Any](/*8.17*/title)),format.raw/*8.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.ico"))),format.raw/*9.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css"))),format.raw/*10.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/jquery-ui.min.css"))),format.raw/*11.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*12.103*/("""">
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/jquery.js"))),format.raw/*13.64*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/jquery-ui.min.js"))),format.raw/*14.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*15.71*/("""" type="text/javascript"></script>
        <!--<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.58*/routes/*16.64*/.Assets.at("stylesheets/foundation.css"))),format.raw/*16.104*/("""">-->
        <!--<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.58*/routes/*17.64*/.Assets.at("stylesheets/style.css"))),format.raw/*17.99*/("""">-->
        <!--<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*18.58*/routes/*18.64*/.Assets.at("stylesheets/datepicker.css"))),format.raw/*18.104*/("""">-->
        <!--<script src=""""),_display_(Seq[Any](/*19.27*/routes/*19.33*/.Assets.at("javascripts/foundation.min.js"))),format.raw/*19.76*/("""" type="text/javascript"></script>-->
        <!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*20.50*/routes/*20.56*/.Assets.at("javascripts/bootstrap-datepicker.js"))),format.raw/*20.105*/(""""></script>-->
        """),_display_(Seq[Any](/*21.10*/extraCSS)),format.raw/*21.18*/("""
        """),_display_(Seq[Any](/*22.10*/extraJS)),format.raw/*22.17*/("""
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <div id="logo">
                    <a href="/"><img src=""""),_display_(Seq[Any](/*28.44*/routes/*28.50*/.Assets.at("images/logo.png"))),format.raw/*28.79*/("""" /></a>
                </div>
                <div id="login">
                    """),_display_(Seq[Any](/*31.22*/if(isLogin==null)/*31.39*/ {_display_(Seq[Any](format.raw/*31.41*/("""
                        <a href="/login">Login</a> / <a href="/register">Daftar</a>
                    """)))}/*33.23*/else/*33.28*/{_display_(Seq[Any](format.raw/*33.29*/("""
                        <a href="/logout">Logout</a>
                    """)))})),format.raw/*35.22*/("""
                </div>
                <div id="title-area">
                    <div id="title">
                        <a href="/">ERLANGGA AIRLINES</a>
                    </div>
                    <div id="subtitle">
                        Let your dream to fly come true...
                    </div>
                </div>
                <div class="clear"></div>
            </div>
            <div id="content">
                """),_display_(Seq[Any](/*48.18*/content)),format.raw/*48.25*/("""
            </div>
            <div id="footer">

            </div>
        </div>

    </body>
</html>
"""))}
    }
    
    def render(title:String,isLogin:String,content:Html,extraCSS:Html,extraJS:Html): play.api.templates.HtmlFormat.Appendable = apply(title,isLogin)(content)(extraCSS)(extraJS)
    
    def f:((String,String) => (Html) => (Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,isLogin) => (content) => (extraCSS) => (extraJS) => apply(title,isLogin)(content)(extraCSS)(extraJS)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 01 00:51:47 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/main.scala.html
                    HASH: 70c43fffa02268481a965ce2e03d206623f1f0d4
                    MATRIX: 795->1|974->86|1138->215|1164->220|1266->287|1280->293|1333->325|1425->381|1440->387|1496->421|1588->477|1603->483|1669->526|1761->582|1776->588|1842->631|1903->656|1918->662|1975->697|2068->754|2083->760|2147->802|2240->859|2255->865|2319->907|2447->999|2462->1005|2525->1045|2624->1108|2639->1114|2696->1149|2795->1212|2810->1218|2873->1258|2941->1290|2956->1296|3021->1339|3144->1426|3159->1432|3231->1481|3291->1505|3321->1513|3367->1523|3396->1530|3588->1686|3603->1692|3654->1721|3776->1807|3802->1824|3842->1826|3967->1933|3980->1938|4019->1939|4126->2014|4604->2456|4633->2463
                    LINES: 26->1|29->1|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|50->22|50->22|56->28|56->28|56->28|59->31|59->31|59->31|61->33|61->33|61->33|63->35|76->48|76->48
                    -- GENERATED --
                */
            