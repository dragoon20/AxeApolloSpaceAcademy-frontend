
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Bandara],Form[Pencarian],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(bandaras: List[Bandara], pencarianForm: Form[Pencarian], isLogin: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
implicit def /*3.2*/implicitField/*3.15*/ = {{ views.html.helper.FieldConstructor(templateForm.f) }};
Seq[Any](format.raw/*1.76*/("""

"""),format.raw/*3.73*/("""

"""),_display_(Seq[Any](/*5.2*/main("Axe Appolo Space Academy", isLogin)/*5.43*/ {_display_(Seq[Any](format.raw/*5.45*/("""
    <div id="sidebar">
        """),_display_(Seq[Any](/*7.10*/helper/*7.16*/.form(action = routes.Application.search())/*7.59*/ {_display_(Seq[Any](format.raw/*7.61*/("""

            <div class="choice">
                <input name="sekali_jalan" type="radio" id="pulang_pergi" value="1">
                <label for="pulang_pergi">Pulang pergi</label>
            </div>
            <div class="choice">
                <input name="sekali_jalan" type="radio" id="sekali_jalan" value="0">
                <label for="sekali_jalan">Sekali jalan</label>
            </div>
            <div class="clear"></div>

            """),_display_(Seq[Any](/*19.14*/helper/*19.20*/.inputText(pencarianForm("asal"), '_label -> "Asal", '_showConstraints -> false, 'class -> "form-control"))),format.raw/*19.126*/("""
            """),_display_(Seq[Any](/*20.14*/helper/*20.20*/.inputText(pencarianForm("tujuan"), '_label -> "Tujuan", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*20.129*/("""
            """),_display_(Seq[Any](/*21.14*/helper/*21.20*/.inputText(pencarianForm("tanggal_berangkat"), '_label -> "Tanggal Berangkat", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*21.151*/("""
            """),_display_(Seq[Any](/*22.14*/helper/*22.20*/.inputText(pencarianForm("tanggal_kembali"), '_label -> "Tanggal Kembali", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*22.147*/("""

            <div class="right">
                <button type="submit" class="btn btn-primary">Cari</button>
            </div>
            <div class="clear"></div>
        """)))})),format.raw/*28.10*/("""
    </div>
    <script>
        $.widget( "custom.catcomplete", $.ui.autocomplete, """),format.raw/*31.60*/("""{"""),format.raw/*31.61*/("""
            _renderMenu: function( ul, items ) """),format.raw/*32.48*/("""{"""),format.raw/*32.49*/("""
                var that = this;
                currentCategory = "";
                var count = 0;
                for (var i=0;i<items.length;++i)
                """),format.raw/*37.17*/("""{"""),format.raw/*37.18*/("""
                    var item = items[i];
                    if ( item.category != currentCategory ) """),format.raw/*39.61*/("""{"""),format.raw/*39.62*/("""
                        ul.append( "<li class='ui-autocomplete-category'>" + item.category + "</li>" );
                        currentCategory = item.category;
                        count++;
                    """),format.raw/*43.21*/("""}"""),format.raw/*43.22*/("""
                    that._renderItemData( ul, item );
                    count++;
                    if (count > 7)
                    """),format.raw/*47.21*/("""{"""),format.raw/*47.22*/("""
                        count = 0;
                    """),format.raw/*49.21*/("""}"""),format.raw/*49.22*/("""
                """),format.raw/*50.17*/("""}"""),format.raw/*50.18*/("""
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/(""",
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/(""");
        $(document).ready(function() """),format.raw/*53.38*/("""{"""),format.raw/*53.39*/("""
            if ($("input[name=sekali_jalan]:radio").val()==0) """),format.raw/*54.63*/("""{"""),format.raw/*54.64*/("""
                $('#tanggal_kembali').parent().parent().hide();
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""
            else """),format.raw/*57.18*/("""{"""),format.raw/*57.19*/("""
                $('#tanggal_kembali').parent().parent().show();
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/("""
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/(""");
        $(function() """),format.raw/*61.22*/("""{"""),format.raw/*61.23*/("""

            var data = [
                """),_display_(Seq[Any](/*64.18*/for(bandara <- bandaras) yield /*64.42*/ {_display_(Seq[Any](format.raw/*64.44*/("""
                    """),format.raw/*65.21*/("""{"""),format.raw/*65.22*/(""" label: """"),_display_(Seq[Any](/*65.32*/bandara/*65.39*/.nama)),format.raw/*65.44*/(""" ("""),_display_(Seq[Any](/*65.47*/bandara/*65.54*/.kode)),format.raw/*65.59*/(""")", category: """"),_display_(Seq[Any](/*65.75*/bandara/*65.82*/.daerah)),format.raw/*65.89*/("""""""),format.raw/*65.90*/("""}"""),format.raw/*65.91*/(""",
                """)))})),format.raw/*66.18*/("""
            ];
            $("#asal").catcomplete("""),format.raw/*68.36*/("""{"""),format.raw/*68.37*/("""
                minLength: 1,
                delay: 0,
                autoFocus: true,
                source: data,
                select: function(event, ui)
                """),format.raw/*74.17*/("""{"""),format.raw/*74.18*/("""
                    $("#tujuan").focus();
                """),format.raw/*76.17*/("""}"""),format.raw/*76.18*/("""
            """),format.raw/*77.13*/("""}"""),format.raw/*77.14*/(""");
            $("#tujuan").catcomplete("""),format.raw/*78.38*/("""{"""),format.raw/*78.39*/("""
                minLength: 1,
                delay: 0,
                autoFocus: true,
                source: data,
                select: function(event, ui)
                """),format.raw/*84.17*/("""{"""),format.raw/*84.18*/("""
                    $("#tanggal_berangkat").focus();
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/("""
            """),format.raw/*87.13*/("""}"""),format.raw/*87.14*/(""");

            $("#asal").focus(function () """),format.raw/*89.42*/("""{"""),format.raw/*89.43*/("""
                $("#asal").catcomplete("search", "");
            """),format.raw/*91.13*/("""}"""),format.raw/*91.14*/(""");

            $("#tujuan").focus(function () """),format.raw/*93.44*/("""{"""),format.raw/*93.45*/("""
                $("#tujuan").catcomplete("search", "");
            """),format.raw/*95.13*/("""}"""),format.raw/*95.14*/(""");

            var now = new Date();
            var maxDate = new Date();
            maxDate.setYear(now.getFullYear() + 1);

            $("#tanggal_berangkat").datepicker("""),format.raw/*101.48*/("""{"""),format.raw/*101.49*/("""
                minDate: now,
                maxDate: maxDate,
                numberOfMonths: 2,
                showButtonPanel: true,
                onSelect: function(dateText, inst)
                """),format.raw/*107.17*/("""{"""),format.raw/*107.18*/("""
                    $("#tanggal_kembali").datepicker("option", "minDate", new Date(dateText));
                    setTimeout(function()
                    """),format.raw/*110.21*/("""{"""),format.raw/*110.22*/("""
                        $("#tanggal_kembali").focus();
                    """),format.raw/*112.21*/("""}"""),format.raw/*112.22*/(""", 100);
                """),format.raw/*113.17*/("""}"""),format.raw/*113.18*/("""
            """),format.raw/*114.13*/("""}"""),format.raw/*114.14*/(""");
            $("#tanggal_kembali").datepicker("""),format.raw/*115.46*/("""{"""),format.raw/*115.47*/("""
                minDate: now,
                maxDate: maxDate,
                numberOfMonths: 2,
                showButtonPanel: true
            """),format.raw/*120.13*/("""}"""),format.raw/*120.14*/(""");
            $("input[name=sekali_jalan]:radio").change(function() """),format.raw/*121.67*/("""{"""),format.raw/*121.68*/("""
                if ($(this).val()==0) """),format.raw/*122.39*/("""{"""),format.raw/*122.40*/("""
                    $('#tanggal_kembali').parent().parent().hide();
                """),format.raw/*124.17*/("""}"""),format.raw/*124.18*/("""
                else """),format.raw/*125.22*/("""{"""),format.raw/*125.23*/("""
                    $('#tanggal_kembali').parent().parent().show();
                """),format.raw/*127.17*/("""}"""),format.raw/*127.18*/("""
            """),format.raw/*128.13*/("""}"""),format.raw/*128.14*/(""");
        """),format.raw/*129.9*/("""}"""),format.raw/*129.10*/(""");
    </script>
""")))}/*131.2*/ {_display_(Seq[Any](format.raw/*131.4*/("""
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*132.50*/routes/*132.56*/.Assets.at("stylesheets/index.css"))),format.raw/*132.91*/("""">
    <style>
        .ui-autocomplete-category """),format.raw/*134.35*/("""{"""),format.raw/*134.36*/("""
            font-weight: bold;
            padding: .2em .2em;
            margin: 0;
            line-height: 1.5;
            color: #1AB2D4;
            background-color: #DEDEDE;
        """),format.raw/*141.9*/("""}"""),format.raw/*141.10*/("""
        .ui-autocomplete """),format.raw/*142.26*/("""{"""),format.raw/*142.27*/("""
            max-height: 300px;
            overflow-y: auto;
            /* prevent horizontal scrollbar */
            overflow-x: hidden;
        """),format.raw/*147.9*/("""}"""),format.raw/*147.10*/("""
    </style>
""")))}/*149.2*/ {_display_(Seq[Any](format.raw/*149.4*/("""
""")))})),format.raw/*150.2*/("""
"""))}
    }
    
    def render(bandaras:List[Bandara],pencarianForm:Form[Pencarian],isLogin:String): play.api.templates.HtmlFormat.Appendable = apply(bandaras,pencarianForm,isLogin)
    
    def f:((List[Bandara],Form[Pencarian],String) => play.api.templates.HtmlFormat.Appendable) = (bandaras,pencarianForm,isLogin) => apply(bandaras,pencarianForm,isLogin)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 01 16:41:35 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/index.scala.html
                    HASH: 6203c9199256fb3012d619e11f8647456c2bcf12
                    MATRIX: 804->1|964->78|985->91|1073->75|1102->149|1139->152|1188->193|1227->195|1295->228|1309->234|1360->277|1399->279|1889->733|1904->739|2033->845|2083->859|2098->865|2230->974|2280->988|2295->994|2449->1125|2499->1139|2514->1145|2664->1272|2872->1448|2984->1532|3013->1533|3089->1581|3118->1582|3314->1750|3343->1751|3473->1853|3502->1854|3745->2069|3774->2070|3941->2209|3970->2210|4054->2266|4083->2267|4128->2284|4157->2285|4198->2298|4227->2299|4264->2309|4293->2310|4361->2350|4390->2351|4481->2414|4510->2415|4615->2492|4644->2493|4690->2511|4719->2512|4824->2589|4853->2590|4889->2599|4918->2600|4970->2624|4999->2625|5079->2669|5119->2693|5159->2695|5208->2716|5237->2717|5283->2727|5299->2734|5326->2739|5365->2742|5381->2749|5408->2754|5460->2770|5476->2777|5505->2784|5534->2785|5563->2786|5614->2805|5693->2856|5722->2857|5930->3037|5959->3038|6046->3097|6075->3098|6116->3111|6145->3112|6213->3152|6242->3153|6450->3333|6479->3334|6577->3404|6606->3405|6647->3418|6676->3419|6749->3464|6778->3465|6873->3532|6902->3533|6977->3580|7006->3581|7103->3650|7132->3651|7337->3827|7367->3828|7602->4034|7632->4035|7819->4193|7849->4194|7954->4270|7984->4271|8037->4295|8067->4296|8109->4309|8139->4310|8216->4358|8246->4359|8425->4509|8455->4510|8553->4579|8583->4580|8651->4619|8681->4620|8795->4705|8825->4706|8876->4728|8906->4729|9020->4814|9050->4815|9092->4828|9122->4829|9161->4840|9191->4841|9228->4859|9268->4861|9355->4911|9371->4917|9429->4952|9507->5001|9537->5002|9757->5194|9787->5195|9842->5221|9872->5222|10049->5371|10079->5372|10113->5387|10153->5389|10187->5391
                    LINES: 26->1|28->3|28->3|29->1|31->3|33->5|33->5|33->5|35->7|35->7|35->7|35->7|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|56->28|59->31|59->31|60->32|60->32|65->37|65->37|67->39|67->39|71->43|71->43|75->47|75->47|77->49|77->49|78->50|78->50|79->51|79->51|80->52|80->52|81->53|81->53|82->54|82->54|84->56|84->56|85->57|85->57|87->59|87->59|88->60|88->60|89->61|89->61|92->64|92->64|92->64|93->65|93->65|93->65|93->65|93->65|93->65|93->65|93->65|93->65|93->65|93->65|93->65|93->65|94->66|96->68|96->68|102->74|102->74|104->76|104->76|105->77|105->77|106->78|106->78|112->84|112->84|114->86|114->86|115->87|115->87|117->89|117->89|119->91|119->91|121->93|121->93|123->95|123->95|129->101|129->101|135->107|135->107|138->110|138->110|140->112|140->112|141->113|141->113|142->114|142->114|143->115|143->115|148->120|148->120|149->121|149->121|150->122|150->122|152->124|152->124|153->125|153->125|155->127|155->127|156->128|156->128|157->129|157->129|159->131|159->131|160->132|160->132|160->132|162->134|162->134|169->141|169->141|170->142|170->142|175->147|175->147|177->149|177->149|178->150
                    -- GENERATED --
                */
            