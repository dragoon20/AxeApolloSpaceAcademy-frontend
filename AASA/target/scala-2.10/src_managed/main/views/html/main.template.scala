
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
        <div id="comets">
        </div>
        <div id="wrapper">
            <div id="header">
                <div id="logo">
                    <a href="/"><img src=""""),_display_(Seq[Any](/*30.44*/routes/*30.50*/.Assets.at("images/logo.png"))),format.raw/*30.79*/("""" /></a>
                </div>
                <div id="login">
                    """),_display_(Seq[Any](/*33.22*/if(isLogin==null)/*33.39*/ {_display_(Seq[Any](format.raw/*33.41*/("""
                        <a href="/login">Login</a> / <a href="/register">Daftar</a>
                    """)))}/*35.23*/else/*35.28*/{_display_(Seq[Any](format.raw/*35.29*/("""
                        <a href="/profile">Profil</a> / <a href="/logout">Logout</a>
                    """)))})),format.raw/*37.22*/("""
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
                """),_display_(Seq[Any](/*50.18*/content)),format.raw/*50.25*/("""
            </div>
            <div id="footer">
                <div class="right">&copy;Copyright Badut 2013</div>
                <div class="clear"></div>
            </div>
        </div>
        <script type="text/javascript">
            $(document).ready(function()
            """),format.raw/*59.13*/("""{"""),format.raw/*59.14*/("""
                var id = 0;
                var ids = [];
                var speeds = [];
                var x = [];
                var y = [];
                var sizes = [];
                var total = 0;
                var lock = false;

                setInterval(function() """),format.raw/*69.40*/("""{"""),format.raw/*69.41*/("""
                    var width = $( window ).width()*1.5;
                    var height = $( window ).height();
                    for (var i=0;i<total;++i)
                    """),format.raw/*73.21*/("""{"""),format.raw/*73.22*/("""
                        if ((x[i] <= -1*sizes[i]) || (y[i] >= height))
                        """),format.raw/*75.25*/("""{"""),format.raw/*75.26*/("""
                            x.splice(i, 1);
                            y.splice(i, 1);
                            speeds.splice(i, 1);
                            sizes.splice(i, 1);
                            $("#comet_"+ids[i]).remove();
                            ids.splice(i, 1);
                            i--;
                            total--;
                        """),format.raw/*84.25*/("""}"""),format.raw/*84.26*/("""
                    """),format.raw/*85.21*/("""}"""),format.raw/*85.22*/("""
                    var temp = Math.floor((Math.random()*100)+1);
                    if (temp%15==0)
                    """),format.raw/*88.21*/("""{"""),format.raw/*88.22*/("""
                        if (id==1000)
                        """),format.raw/*90.25*/("""{"""),format.raw/*90.26*/("""
                            id = 0;
                        """),format.raw/*92.25*/("""}"""),format.raw/*92.26*/("""
                        ids.push(id);
                        id++;
                        x.push(Math.floor((Math.random()*width)+1));
                        speeds.push(2 + Math.floor((Math.random()*6)+1));
                        $("#comets").append("<img id='comet_"+ids[total]+"' src='"""),_display_(Seq[Any](/*97.83*/routes/*97.89*/.Assets.at("images/comet.png"))),format.raw/*97.119*/("""' class='comet' />");
                        sizes.push(50 + Math.floor((Math.random()*150)+1));
                        y.push(-1*sizes[total]);
                        $("#comet_"+ids[total]).css("width", sizes[total]+"px");
                        $("#comet_"+ids[total]).css("height", sizes[total]+"px");
                        total++;
                    """),format.raw/*103.21*/("""}"""),format.raw/*103.22*/("""
                    for (var i=0;i<total;++i)
                    """),format.raw/*105.21*/("""{"""),format.raw/*105.22*/("""
                        x[i] -= speeds[i];
                        y[i] += speeds[i];
                        $("#comet_"+ids[i]).css("left", x[i]+"px");
                        $("#comet_"+ids[i]).css("top", y[i]+"px");
                    """),format.raw/*110.21*/("""}"""),format.raw/*110.22*/("""
                """),format.raw/*111.17*/("""}"""),format.raw/*111.18*/(""", 50);
            """),format.raw/*112.13*/("""}"""),format.raw/*112.14*/(""");
        </script>
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
                    DATE: Mon Oct 14 00:14:42 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/main.scala.html
                    HASH: 660d8c975995bd7a47120755518e7024f1b4c0c6
                    MATRIX: 795->1|974->86|1138->215|1164->220|1266->287|1280->293|1333->325|1425->381|1440->387|1496->421|1588->477|1603->483|1669->526|1761->582|1776->588|1842->631|1903->656|1918->662|1975->697|2068->754|2083->760|2147->802|2240->859|2255->865|2319->907|2447->999|2462->1005|2525->1045|2624->1108|2639->1114|2696->1149|2795->1212|2810->1218|2873->1258|2941->1290|2956->1296|3021->1339|3144->1426|3159->1432|3231->1481|3291->1505|3321->1513|3367->1523|3396->1530|3629->1727|3644->1733|3695->1762|3817->1848|3843->1865|3883->1867|4008->1974|4021->1979|4060->1980|4199->2087|4677->2529|4706->2536|5021->2823|5050->2824|5363->3109|5392->3110|5599->3289|5628->3290|5752->3386|5781->3387|6193->3771|6222->3772|6271->3793|6300->3794|6451->3917|6480->3918|6571->3981|6600->3982|6689->4043|6718->4044|7048->4338|7063->4344|7116->4374|7508->4737|7538->4738|7634->4805|7664->4806|7935->5048|7965->5049|8011->5066|8041->5067|8089->5086|8119->5087
                    LINES: 26->1|29->1|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|50->22|50->22|58->30|58->30|58->30|61->33|61->33|61->33|63->35|63->35|63->35|65->37|78->50|78->50|87->59|87->59|97->69|97->69|101->73|101->73|103->75|103->75|112->84|112->84|113->85|113->85|116->88|116->88|118->90|118->90|120->92|120->92|125->97|125->97|125->97|131->103|131->103|133->105|133->105|138->110|138->110|139->111|139->111|140->112|140->112
                    -- GENERATED --
                */
            