
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Bandara],Form[Log_Pencarian],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(bandaras: List[Bandara], pencarianForm: Form[Log_Pencarian], isLogin: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
implicit def /*3.2*/implicitField/*3.15*/ = {{ views.html.helper.FieldConstructor(templateForm.f) }};
Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*3.73*/("""

"""),_display_(Seq[Any](/*5.2*/main("Axe Appolo Space Academy", isLogin)/*5.43*/ {_display_(Seq[Any](format.raw/*5.45*/("""
    <div id="sidebar">
        """),_display_(Seq[Any](/*7.10*/helper/*7.16*/.form(action = routes.Application.search(), 'id -> "searchForm")/*7.80*/ {_display_(Seq[Any](format.raw/*7.82*/("""

           <!-- <div class="choice">
                <input name="sekali_jalan" type="radio" id="sekali_jalan" value="0" checked="true">
                <label for="sekali_jalan">Sekali jalan</label>
            </div>
            <div class="choice">
                <input name="sekali_jalan" type="radio" id="pulang_pergi" value="1">
                <label for="pulang_pergi">Pulang pergi</label>
            </div>
            <div class="clear"></div>-->

            """),_display_(Seq[Any](/*19.14*/helper/*19.20*/.inputText(pencarianForm("asal"), '_label -> "Asal", '_showConstraints -> false, 'class -> "form-control"))),format.raw/*19.126*/("""
            """),_display_(Seq[Any](/*20.14*/helper/*20.20*/.inputText(pencarianForm("tujuan"), '_label -> "Tujuan", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*20.129*/("""
            """),_display_(Seq[Any](/*21.14*/helper/*21.20*/.inputText(pencarianForm("tanggal_berangkat"), '_label -> "Tanggal Berangkat", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*21.151*/("""
            """),_display_(Seq[Any](/*22.14*/helper/*22.20*/.inputText(pencarianForm("tanggal_kembali"), '_label -> "Tanggal Kembali", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*22.147*/("""
            """),_display_(Seq[Any](/*23.14*/helper/*23.20*/.select(field = pencarianForm("jumlah_penumpang"), options = Seq("1"->"1", "2"->"2", "3"->"3", "4"->"4", "5"->"5", "6"->"6", "7"->"7"), '_label -> "Jumlah Penumpang", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*23.239*/("""

            <div class="right">
                <button type="submit" class="btn btn-primary">Cari</button>
            </div>
            <div class="clear"></div>
        """)))})),format.raw/*29.10*/("""
    </div>
    <div id="content-main">
        <section>
            <div id="content_wrap" class="wrap">
                <div id="slide_left">
                </div>
                <div id="content_wrap_inner">
                    <img class="slide_item" src=""""),_display_(Seq[Any](/*37.51*/routes/*37.57*/.Assets.at("images/1.png"))),format.raw/*37.83*/("""" alt="gambar 1" />
                    <img class="slide_item" src=""""),_display_(Seq[Any](/*38.51*/routes/*38.57*/.Assets.at("images/2.png"))),format.raw/*38.83*/("""" alt="gambar 2" />
                    <img class="slide_item" src=""""),_display_(Seq[Any](/*39.51*/routes/*39.57*/.Assets.at("images/3.png"))),format.raw/*39.83*/("""" alt="gambar 3" />
                </div>
                <div id="slide_right">
                </div>
                <div class="clear"></div>
                <div id="slide_bullet">
                    <div class="bullet_slide active" onclick="go_to_image(1);"> </div>
                    <div class="bullet_slide" onclick="go_to_image(2);"> </div>
                    <div class="bullet_slide" onclick="go_to_image(3);"> </div>
                </div>
            </div>
        </section>
    </div>
    <div class="clear"></div>
    <script>
        $.widget( "custom.catcomplete", $.ui.autocomplete, """),format.raw/*54.60*/("""{"""),format.raw/*54.61*/("""
            _renderMenu: function( ul, items ) """),format.raw/*55.48*/("""{"""),format.raw/*55.49*/("""
                var that = this;
                currentCategory = "";
                var count = 0;
                for (var i=0;i<items.length;++i)
                """),format.raw/*60.17*/("""{"""),format.raw/*60.18*/("""
                    var item = items[i];
                    if ( item.category != currentCategory ) """),format.raw/*62.61*/("""{"""),format.raw/*62.62*/("""
                        ul.append( "<li class='ui-autocomplete-category'>" + item.category + "</li>" );
                        currentCategory = item.category;
                        count++;
                    """),format.raw/*66.21*/("""}"""),format.raw/*66.22*/("""
                    that._renderItemData( ul, item );
                    count++;
                    if (count > 7)
                    """),format.raw/*70.21*/("""{"""),format.raw/*70.22*/("""
                        count = 0;
                    """),format.raw/*72.21*/("""}"""),format.raw/*72.22*/("""
                """),format.raw/*73.17*/("""}"""),format.raw/*73.18*/("""
            """),format.raw/*74.13*/("""}"""),format.raw/*74.14*/(""",
        """),format.raw/*75.9*/("""}"""),format.raw/*75.10*/(""");
        $(function() """),format.raw/*76.22*/("""{"""),format.raw/*76.23*/("""
            //$("#sekali_jalan").prop("checked", true);
            //$("#pulang_pergi").prop("checked", false);
            $("#asal").val("");
            $("#tujuan").val("");
            $("#tanggal_berangkat").val("");
            $("#tanggal_kembali").val("");
            $('#tanggal_kembali').parent().parent().hide();

            var data = [
                """),_display_(Seq[Any](/*86.18*/for(bandara <- bandaras) yield /*86.42*/ {_display_(Seq[Any](format.raw/*86.44*/("""
                    """),format.raw/*87.21*/("""{"""),format.raw/*87.22*/(""" label: """"),_display_(Seq[Any](/*87.32*/bandara/*87.39*/.nama)),format.raw/*87.44*/(""" ("""),_display_(Seq[Any](/*87.47*/bandara/*87.54*/.kode)),format.raw/*87.59*/(""")", category: """"),_display_(Seq[Any](/*87.75*/bandara/*87.82*/.daerah)),format.raw/*87.89*/("""""""),format.raw/*87.90*/("""}"""),format.raw/*87.91*/(""",
                """)))})),format.raw/*88.18*/("""
            ];
            $("#asal").catcomplete("""),format.raw/*90.36*/("""{"""),format.raw/*90.37*/("""
                minLength: 1,
                delay: 0,
                autoFocus: true,
                source: data,
                select: function(event, ui)
                """),format.raw/*96.17*/("""{"""),format.raw/*96.18*/("""
                    $("#tujuan").focus();
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/("""
            """),format.raw/*99.13*/("""}"""),format.raw/*99.14*/(""");
            $("#tujuan").catcomplete("""),format.raw/*100.38*/("""{"""),format.raw/*100.39*/("""
                minLength: 1,
                delay: 0,
                autoFocus: true,
                source: data,
                select: function(event, ui)
                """),format.raw/*106.17*/("""{"""),format.raw/*106.18*/("""
                    $("#tanggal_berangkat").focus();
                """),format.raw/*108.17*/("""}"""),format.raw/*108.18*/("""
            """),format.raw/*109.13*/("""}"""),format.raw/*109.14*/(""");

            $("#asal").focus(function () """),format.raw/*111.42*/("""{"""),format.raw/*111.43*/("""
                $("#asal").catcomplete("search", "");
            """),format.raw/*113.13*/("""}"""),format.raw/*113.14*/(""");

            $("#tujuan").focus(function () """),format.raw/*115.44*/("""{"""),format.raw/*115.45*/("""
                $("#tujuan").catcomplete("search", "");
            """),format.raw/*117.13*/("""}"""),format.raw/*117.14*/(""");

            var now = new Date();
            var maxDate = new Date();
            maxDate.setYear(now.getFullYear() + 1);

            $("#tanggal_berangkat").datepicker("""),format.raw/*123.48*/("""{"""),format.raw/*123.49*/("""
                minDate: now,
                maxDate: maxDate,
                numberOfMonths: 2,
                showButtonPanel: true,
                onSelect: function(dateText, inst)
                """),format.raw/*129.17*/("""{"""),format.raw/*129.18*/("""
                    $("#tanggal_kembali").datepicker("option", "minDate", new Date(dateText));
                    setTimeout(function()
                    """),format.raw/*132.21*/("""{"""),format.raw/*132.22*/("""
                        $("#tanggal_kembali").focus();
                    """),format.raw/*134.21*/("""}"""),format.raw/*134.22*/(""", 100);
                """),format.raw/*135.17*/("""}"""),format.raw/*135.18*/("""
            """),format.raw/*136.13*/("""}"""),format.raw/*136.14*/(""");
            $("#tanggal_kembali").datepicker("""),format.raw/*137.46*/("""{"""),format.raw/*137.47*/("""
                minDate: now,
                maxDate: maxDate,
                numberOfMonths: 2,
                showButtonPanel: true
            """),format.raw/*142.13*/("""}"""),format.raw/*142.14*/(""");
            /*$("input[name=sekali_jalan]:radio").change(function() """),format.raw/*143.69*/("""{"""),format.raw/*143.70*/("""
                if ($(this).val()==0) """),format.raw/*144.39*/("""{"""),format.raw/*144.40*/("""
                    $('#tanggal_kembali').parent().parent().hide();
                """),format.raw/*146.17*/("""}"""),format.raw/*146.18*/("""
                else """),format.raw/*147.22*/("""{"""),format.raw/*147.23*/("""
                    $('#tanggal_kembali').parent().parent().show();
                """),format.raw/*149.17*/("""}"""),format.raw/*149.18*/("""
            """),format.raw/*150.13*/("""}"""),format.raw/*150.14*/(""");*/
        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""");

        var content_wrap = document.getElementById("content_wrap");
        content_wrap.onmouseover = function()
        """),format.raw/*155.9*/("""{"""),format.raw/*155.10*/("""
            document.getElementById("slide_left").style.opacity = "1";
            document.getElementById("slide_right").style.opacity = "1";
        """),format.raw/*158.9*/("""}"""),format.raw/*158.10*/("""

        content_wrap.onmouseout = function()
        """),format.raw/*161.9*/("""{"""),format.raw/*161.10*/("""
            document.getElementById("slide_left").style.opacity = "0";
            document.getElementById("slide_right").style.opacity = "0";
        """),format.raw/*164.9*/("""}"""),format.raw/*164.10*/("""

        var current_image = 1;
        var max_image = 3;
        var width = 696;
        function go_to_bullet(index)
        """),format.raw/*170.9*/("""{"""),format.raw/*170.10*/("""
            var bullets = document.getElementById("slide_bullet").childNodes;
            var i = 1;
            for (var j=0;j<bullets.length;++j)
            """),format.raw/*174.13*/("""{"""),format.raw/*174.14*/("""
                if (bullets[j].nodeName!="#text")
                """),format.raw/*176.17*/("""{"""),format.raw/*176.18*/("""
                    if (i==index)
                        bullets[j].className = "bullet_slide active";
                    else
                        bullets[j].className = "bullet_slide";
                        i++;
                """),format.raw/*182.17*/("""}"""),format.raw/*182.18*/("""
            """),format.raw/*183.13*/("""}"""),format.raw/*183.14*/("""
        """),format.raw/*184.9*/("""}"""),format.raw/*184.10*/("""
        function next_image()
        """),format.raw/*186.9*/("""{"""),format.raw/*186.10*/("""
            current_image++;
            if (current_image > max_image)
                current_image = 1;
            document.getElementById("content_wrap_inner").style.left = (-1*width*(current_image-1))+"px";
            go_to_bullet(current_image);
        """),format.raw/*192.9*/("""}"""),format.raw/*192.10*/("""
        function prev_image()
        """),format.raw/*194.9*/("""{"""),format.raw/*194.10*/("""
            current_image--;
            if (current_image < 1)
                current_image = max_image;
            document.getElementById("content_wrap_inner").style.left = (-1*width*(current_image-1))+"px";
            go_to_bullet(current_image);
        """),format.raw/*200.9*/("""}"""),format.raw/*200.10*/("""
        document.onkeydown = function(event)
        """),format.raw/*202.9*/("""{"""),format.raw/*202.10*/("""
            if (event.keyCode=="37")
                prev_image();
            else if (event.keyCode=="39")
                next_image();
        """),format.raw/*207.9*/("""}"""),format.raw/*207.10*/("""
        function go_to_image(index)
        """),format.raw/*209.9*/("""{"""),format.raw/*209.10*/("""
            current_image = index;
            document.getElementById("content_wrap_inner").style.left = (-1*width*(current_image-1))+"px";
            go_to_bullet(current_image);
        """),format.raw/*213.9*/("""}"""),format.raw/*213.10*/("""
        document.getElementById("slide_left").onclick = function() """),format.raw/*214.68*/("""{"""),format.raw/*214.69*/("""prev_image()"""),format.raw/*214.81*/("""}"""),format.raw/*214.82*/(""";
        document.getElementById("slide_right").onclick = function() """),format.raw/*215.69*/("""{"""),format.raw/*215.70*/("""next_image()"""),format.raw/*215.82*/("""}"""),format.raw/*215.83*/(""";

        window.onload = function()
        """),format.raw/*218.9*/("""{"""),format.raw/*218.10*/("""
            setInterval(function()"""),format.raw/*219.35*/("""{"""),format.raw/*219.36*/("""next_image();"""),format.raw/*219.49*/("""}"""),format.raw/*219.50*/(""", 5500);
        """),format.raw/*220.9*/("""}"""),format.raw/*220.10*/("""
    </script>
""")))}/*222.2*/ {_display_(Seq[Any](format.raw/*222.4*/("""
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*223.50*/routes/*223.56*/.Assets.at("stylesheets/index.css"))),format.raw/*223.91*/("""">
    <style>
        .ui-autocomplete-category """),format.raw/*225.35*/("""{"""),format.raw/*225.36*/("""
            font-weight: bold;
            padding: .2em .2em;
            margin: 0;
            line-height: 1.5;
            color: #1AB2D4;
            background-color: #DEDEDE;
        """),format.raw/*232.9*/("""}"""),format.raw/*232.10*/("""
        .ui-autocomplete """),format.raw/*233.26*/("""{"""),format.raw/*233.27*/("""
            max-height: 300px;
            overflow-y: auto;
            /* prevent horizontal scrollbar */
            overflow-x: hidden;
        """),format.raw/*238.9*/("""}"""),format.raw/*238.10*/("""
    </style>
""")))}/*240.2*/ {_display_(Seq[Any](format.raw/*240.4*/("""
""")))})),format.raw/*241.2*/("""
"""))}
    }
    
    def render(bandaras:List[Bandara],pencarianForm:Form[Log_Pencarian],isLogin:String): play.api.templates.HtmlFormat.Appendable = apply(bandaras,pencarianForm,isLogin)
    
    def f:((List[Bandara],Form[Log_Pencarian],String) => play.api.templates.HtmlFormat.Appendable) = (bandaras,pencarianForm,isLogin) => apply(bandaras,pencarianForm,isLogin)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 14 00:35:08 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/index.scala.html
                    HASH: 75c79c7a3606e38afe1d1959407962e14e8f4826
                    MATRIX: 808->1|972->82|993->95|1081->79|1110->153|1147->156|1196->197|1235->199|1303->232|1317->238|1389->302|1428->304|1940->780|1955->786|2084->892|2134->906|2149->912|2281->1021|2331->1035|2346->1041|2500->1172|2550->1186|2565->1192|2715->1319|2765->1333|2780->1339|3022->1558|3230->1734|3530->1998|3545->2004|3593->2030|3699->2100|3714->2106|3762->2132|3868->2202|3883->2208|3931->2234|4567->2842|4596->2843|4672->2891|4701->2892|4897->3060|4926->3061|5056->3163|5085->3164|5328->3379|5357->3380|5524->3519|5553->3520|5637->3576|5666->3577|5711->3594|5740->3595|5781->3608|5810->3609|5847->3619|5876->3620|5928->3644|5957->3645|6364->4016|6404->4040|6444->4042|6493->4063|6522->4064|6568->4074|6584->4081|6611->4086|6650->4089|6666->4096|6693->4101|6745->4117|6761->4124|6790->4131|6819->4132|6848->4133|6899->4152|6978->4203|7007->4204|7215->4384|7244->4385|7331->4444|7360->4445|7401->4458|7430->4459|7499->4499|7529->4500|7738->4680|7768->4681|7867->4751|7897->4752|7939->4765|7969->4766|8043->4811|8073->4812|8169->4879|8199->4880|8275->4927|8305->4928|8403->4997|8433->4998|8638->5174|8668->5175|8903->5381|8933->5382|9120->5540|9150->5541|9255->5617|9285->5618|9338->5642|9368->5643|9410->5656|9440->5657|9517->5705|9547->5706|9726->5856|9756->5857|9856->5928|9886->5929|9954->5968|9984->5969|10098->6054|10128->6055|10179->6077|10209->6078|10323->6163|10353->6164|10395->6177|10425->6178|10466->6191|10496->6192|10650->6318|10680->6319|10860->6471|10890->6472|10973->6527|11003->6528|11183->6680|11213->6681|11371->6811|11401->6812|11591->6973|11621->6974|11717->7041|11747->7042|12014->7280|12044->7281|12086->7294|12116->7295|12153->7304|12183->7305|12250->7344|12280->7345|12571->7608|12601->7609|12668->7648|12698->7649|12989->7912|13019->7913|13101->7967|13131->7968|13307->8116|13337->8117|13410->8162|13440->8163|13659->8354|13689->8355|13786->8423|13816->8424|13857->8436|13887->8437|13986->8507|14016->8508|14057->8520|14087->8521|14161->8567|14191->8568|14255->8603|14285->8604|14327->8617|14357->8618|14402->8635|14432->8636|14467->8652|14507->8654|14594->8704|14610->8710|14668->8745|14746->8794|14776->8795|14996->8987|15026->8988|15081->9014|15111->9015|15288->9164|15318->9165|15352->9180|15392->9182|15426->9184
                    LINES: 26->1|28->3|28->3|29->1|31->3|33->5|33->5|33->5|35->7|35->7|35->7|35->7|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|57->29|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|82->54|82->54|83->55|83->55|88->60|88->60|90->62|90->62|94->66|94->66|98->70|98->70|100->72|100->72|101->73|101->73|102->74|102->74|103->75|103->75|104->76|104->76|114->86|114->86|114->86|115->87|115->87|115->87|115->87|115->87|115->87|115->87|115->87|115->87|115->87|115->87|115->87|115->87|116->88|118->90|118->90|124->96|124->96|126->98|126->98|127->99|127->99|128->100|128->100|134->106|134->106|136->108|136->108|137->109|137->109|139->111|139->111|141->113|141->113|143->115|143->115|145->117|145->117|151->123|151->123|157->129|157->129|160->132|160->132|162->134|162->134|163->135|163->135|164->136|164->136|165->137|165->137|170->142|170->142|171->143|171->143|172->144|172->144|174->146|174->146|175->147|175->147|177->149|177->149|178->150|178->150|179->151|179->151|183->155|183->155|186->158|186->158|189->161|189->161|192->164|192->164|198->170|198->170|202->174|202->174|204->176|204->176|210->182|210->182|211->183|211->183|212->184|212->184|214->186|214->186|220->192|220->192|222->194|222->194|228->200|228->200|230->202|230->202|235->207|235->207|237->209|237->209|241->213|241->213|242->214|242->214|242->214|242->214|243->215|243->215|243->215|243->215|246->218|246->218|247->219|247->219|247->219|247->219|248->220|248->220|250->222|250->222|251->223|251->223|251->223|253->225|253->225|260->232|260->232|261->233|261->233|266->238|266->238|268->240|268->240|269->241
                    -- GENERATED --
                */
            