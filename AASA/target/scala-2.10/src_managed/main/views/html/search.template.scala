
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
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[List[Bandara],Form[Log_Pencarian],List[Penerbangan],Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(bandaras: List[Bandara], pencarianForm: Form[Log_Pencarian], penerbangans: List[Penerbangan], jumlahPenumpang: Integer, isLogin: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
implicit def /*3.2*/implicitField/*3.15*/ = {{ views.html.helper.FieldConstructor(templateForm.f) }};
Seq[Any](format.raw/*1.139*/("""

"""),format.raw/*3.73*/("""

"""),_display_(Seq[Any](/*5.2*/main("Axe Appolo Space Academy", isLogin)/*5.43*/ {_display_(Seq[Any](format.raw/*5.45*/("""
    <div id="sidebar">
        """),_display_(Seq[Any](/*7.10*/helper/*7.16*/.form(action = routes.Application.search(), 'id -> "searchForm")/*7.80*/ {_display_(Seq[Any](format.raw/*7.82*/("""

        <!--<div class="choice">
            <input name="sekali_jalan" type="radio" id="sekali_jalan" value="0" checked="true">
            <label for="sekali_jalan">Sekali jalan</label>
        </div>
        <div class="choice">
            <input name="sekali_jalan" type="radio" id="pulang_pergi" value="1">
            <label for="pulang_pergi">Pulang pergi</label>
        </div>
        <div class="clear"></div>-->

        """),_display_(Seq[Any](/*19.10*/helper/*19.16*/.inputText(pencarianForm("asal"), '_label -> "Asal", '_showConstraints -> false, 'class -> "form-control"))),format.raw/*19.122*/("""
        """),_display_(Seq[Any](/*20.10*/helper/*20.16*/.inputText(pencarianForm("tujuan"), '_label -> "Tujuan", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*20.125*/("""
        """),_display_(Seq[Any](/*21.10*/helper/*21.16*/.inputText(pencarianForm("tanggal_berangkat"), '_label -> "Tanggal Berangkat", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*21.147*/("""
        """),_display_(Seq[Any](/*22.10*/helper/*22.16*/.inputText(pencarianForm("tanggal_kembali"), '_label -> "Tanggal Kembali", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*22.143*/("""
        """),_display_(Seq[Any](/*23.10*/helper/*23.16*/.select(field = pencarianForm("jumlah_penumpang"), options = Seq("1"->"1", "2"->"2", "3"->"3", "4"->"4", "5"->"5", "6"->"6", "7"->"7"), '_label -> "Jumlah Penumpang", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*23.235*/("""

        <div class="right">
            <button type="submit" class="btn btn-primary">Cari</button>
        </div>
        <div class="clear"></div>
        """)))})),format.raw/*29.10*/("""
    </div>
    <div id="main-content">
        <div class="content-title">Hasil Pencarian</div>
        """),_display_(Seq[Any](/*33.10*/for(penerbangan <- penerbangans) yield /*33.42*/ {_display_(Seq[Any](format.raw/*33.44*/("""
            <div class="penerbangan">
                <div class="nama-penerbangan">
                    """),_display_(Seq[Any](/*36.22*/penerbangan/*36.33*/.kode_penerbangan)),format.raw/*36.50*/("""
                </div>
                <div class="status-penerbangan">
                    <div class="status-berangkat">
                        """),_display_(Seq[Any](/*40.26*/penerbangan/*40.37*/.jam_berangkat)),format.raw/*40.51*/(""" <br />
                        """),_display_(Seq[Any](/*41.26*/penerbangan/*41.37*/.bandara_asal.nama)),format.raw/*41.55*/("""
                    </div>
                    <div class="status-tiba">
                        """),_display_(Seq[Any](/*44.26*/penerbangan/*44.37*/.jam_tiba)),format.raw/*44.46*/(""" <br />
                        """),_display_(Seq[Any](/*45.26*/penerbangan/*45.37*/.bandara_tujuan.nama)),format.raw/*45.57*/("""
                    </div>
                </div>
                <div class="harga-penerbangan">
                    Rp """),_display_(Seq[Any](/*49.25*/penerbangan/*49.36*/.harga)),format.raw/*49.42*/(""",00
                </div>
                <a class="order-penerbangan btn btn-primary" href="/order?id="""),_display_(Seq[Any](/*51.79*/penerbangan/*51.90*/.id)),format.raw/*51.93*/("""&jumlah="""),_display_(Seq[Any](/*51.102*/jumlahPenumpang)),format.raw/*51.117*/("""">Pesan</a>
                <div class="clear"></div>
            </div>
        """)))})),format.raw/*54.10*/("""
        """),_display_(Seq[Any](/*55.10*/if(penerbangans.isEmpty())/*55.36*/ {_display_(Seq[Any](format.raw/*55.38*/("""
            Maaf penerbangan yang anda cari tidak dapat ditemukan.
        """)))})),format.raw/*57.10*/("""
    </div>
    <div class="clear"></div>
    <script>
        $.widget( "custom.catcomplete", $.ui.autocomplete, """),format.raw/*61.60*/("""{"""),format.raw/*61.61*/("""
        _renderMenu: function( ul, items ) """),format.raw/*62.44*/("""{"""),format.raw/*62.45*/("""
        var that = this;
        currentCategory = "";
        var count = 0;
        for (var i=0;i<items.length;++i)
        """),format.raw/*67.9*/("""{"""),format.raw/*67.10*/("""
        var item = items[i];
        if ( item.category != currentCategory ) """),format.raw/*69.49*/("""{"""),format.raw/*69.50*/("""
        ul.append( "<li class='ui-autocomplete-category'>" + item.category + "</li>" );
        currentCategory = item.category;
        count++;
        """),format.raw/*73.9*/("""}"""),format.raw/*73.10*/("""
        that._renderItemData( ul, item );
        count++;
        if (count > 7)
        """),format.raw/*77.9*/("""{"""),format.raw/*77.10*/("""
        count = 0;
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/("""
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/("""
        """),format.raw/*81.9*/("""}"""),format.raw/*81.10*/(""",
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/(""");
        $(function() """),format.raw/*83.22*/("""{"""),format.raw/*83.23*/("""
        $('#tanggal_kembali').parent().parent().hide();

        var data = [
        """),_display_(Seq[Any](/*87.10*/for(bandara <- bandaras) yield /*87.34*/ {_display_(Seq[Any](format.raw/*87.36*/("""
        """),format.raw/*88.9*/("""{"""),format.raw/*88.10*/(""" label: """"),_display_(Seq[Any](/*88.20*/bandara/*88.27*/.nama)),format.raw/*88.32*/(""" ("""),_display_(Seq[Any](/*88.35*/bandara/*88.42*/.kode)),format.raw/*88.47*/(""")", category: """"),_display_(Seq[Any](/*88.63*/bandara/*88.70*/.daerah)),format.raw/*88.77*/("""""""),format.raw/*88.78*/("""}"""),format.raw/*88.79*/(""",
        """)))})),format.raw/*89.10*/("""
        ];
        $("#asal").catcomplete("""),format.raw/*91.32*/("""{"""),format.raw/*91.33*/("""
        minLength: 1,
        delay: 0,
        autoFocus: true,
        source: data,
        select: function(event, ui)
        """),format.raw/*97.9*/("""{"""),format.raw/*97.10*/("""
        $("#tujuan").focus();
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/("""
        """),format.raw/*100.9*/("""}"""),format.raw/*100.10*/(""");
        $("#tujuan").catcomplete("""),format.raw/*101.34*/("""{"""),format.raw/*101.35*/("""
        minLength: 1,
        delay: 0,
        autoFocus: true,
        source: data,
        select: function(event, ui)
        """),format.raw/*107.9*/("""{"""),format.raw/*107.10*/("""
        $("#tanggal_berangkat").focus();
        """),format.raw/*109.9*/("""}"""),format.raw/*109.10*/("""
        """),format.raw/*110.9*/("""}"""),format.raw/*110.10*/(""");

        $("#asal").focus(function () """),format.raw/*112.38*/("""{"""),format.raw/*112.39*/("""
        $("#asal").catcomplete("search", "");
        """),format.raw/*114.9*/("""}"""),format.raw/*114.10*/(""");

        $("#tujuan").focus(function () """),format.raw/*116.40*/("""{"""),format.raw/*116.41*/("""
        $("#tujuan").catcomplete("search", "");
        """),format.raw/*118.9*/("""}"""),format.raw/*118.10*/(""");

        var now = new Date();
        var maxDate = new Date();
        maxDate.setYear(now.getFullYear() + 1);

        $("#tanggal_berangkat").datepicker("""),format.raw/*124.44*/("""{"""),format.raw/*124.45*/("""
        minDate: now,
        maxDate: maxDate,
        numberOfMonths: 2,
        showButtonPanel: true,
        onSelect: function(dateText, inst)
        """),format.raw/*130.9*/("""{"""),format.raw/*130.10*/("""
        $("#tanggal_kembali").datepicker("option", "minDate", new Date(dateText));
        setTimeout(function()
        """),format.raw/*133.9*/("""{"""),format.raw/*133.10*/("""
        $("#tanggal_kembali").focus();
        """),format.raw/*135.9*/("""}"""),format.raw/*135.10*/(""", 100);
        """),format.raw/*136.9*/("""}"""),format.raw/*136.10*/("""
        """),format.raw/*137.9*/("""}"""),format.raw/*137.10*/(""");
        $("#tanggal_kembali").datepicker("""),format.raw/*138.42*/("""{"""),format.raw/*138.43*/("""
        minDate: now,
        maxDate: maxDate,
        numberOfMonths: 2,
        showButtonPanel: true
        """),format.raw/*143.9*/("""}"""),format.raw/*143.10*/(""");
        /*$("input[name=sekali_jalan]:radio").change(function() """),format.raw/*144.65*/("""{"""),format.raw/*144.66*/("""
        if ($(this).val()==0) """),format.raw/*145.31*/("""{"""),format.raw/*145.32*/("""
        $('#tanggal_kembali').parent().parent().hide();
        """),format.raw/*147.9*/("""}"""),format.raw/*147.10*/("""
        else """),format.raw/*148.14*/("""{"""),format.raw/*148.15*/("""
        $('#tanggal_kembali').parent().parent().show();
        """),format.raw/*150.9*/("""}"""),format.raw/*150.10*/("""
        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""");*/
        """),format.raw/*152.9*/("""}"""),format.raw/*152.10*/(""");
    </script>
""")))}/*154.2*/ {_display_(Seq[Any](format.raw/*154.4*/("""
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*155.50*/routes/*155.56*/.Assets.at("stylesheets/search.css"))),format.raw/*155.92*/("""">
""")))}/*156.2*/ {_display_(Seq[Any](format.raw/*156.4*/("""
""")))})),format.raw/*157.2*/("""
"""))}
    }
    
    def render(bandaras:List[Bandara],pencarianForm:Form[Log_Pencarian],penerbangans:List[Penerbangan],jumlahPenumpang:Integer,isLogin:String): play.api.templates.HtmlFormat.Appendable = apply(bandaras,pencarianForm,penerbangans,jumlahPenumpang,isLogin)
    
    def f:((List[Bandara],Form[Log_Pencarian],List[Penerbangan],Integer,String) => play.api.templates.HtmlFormat.Appendable) = (bandaras,pencarianForm,penerbangans,jumlahPenumpang,isLogin) => apply(bandaras,pencarianForm,penerbangans,jumlahPenumpang,isLogin)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 13 19:54:16 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/search.scala.html
                    HASH: 127c68ab829fae34d1b0c4cb187ea10b1b8fa983
                    MATRIX: 835->1|1058->141|1079->154|1168->138|1197->212|1234->215|1283->256|1322->258|1390->291|1404->297|1476->361|1515->363|1987->799|2002->805|2131->911|2177->921|2192->927|2324->1036|2370->1046|2385->1052|2539->1183|2585->1193|2600->1199|2750->1326|2796->1336|2811->1342|3053->1561|3245->1721|3387->1827|3435->1859|3475->1861|3618->1968|3638->1979|3677->1996|3862->2145|3882->2156|3918->2170|3987->2203|4007->2214|4047->2232|4182->2331|4202->2342|4233->2351|4302->2384|4322->2395|4364->2415|4523->2538|4543->2549|4571->2555|4712->2660|4732->2671|4757->2674|4803->2683|4841->2698|4955->2780|5001->2790|5036->2816|5076->2818|5185->2895|5327->3009|5356->3010|5428->3054|5457->3055|5612->3183|5641->3184|5747->3262|5776->3263|5958->3418|5987->3419|6105->3510|6134->3511|6189->3539|6218->3540|6254->3549|6283->3550|6319->3559|6348->3560|6385->3570|6414->3571|6466->3595|6495->3596|6619->3684|6659->3708|6699->3710|6735->3719|6764->3720|6810->3730|6826->3737|6853->3742|6892->3745|6908->3752|6935->3757|6987->3773|7003->3780|7032->3787|7061->3788|7090->3789|7133->3800|7204->3843|7233->3844|7392->3976|7421->3977|7487->4016|7516->4017|7553->4026|7583->4027|7648->4063|7678->4064|7838->4196|7868->4197|7946->4247|7976->4248|8013->4257|8043->4258|8113->4299|8143->4300|8226->4355|8256->4356|8328->4399|8358->4400|8443->4457|8473->4458|8662->4618|8692->4619|8878->4777|8908->4778|9058->4900|9088->4901|9164->4949|9194->4950|9238->4966|9268->4967|9305->4976|9335->4977|9408->5021|9438->5022|9580->5136|9610->5137|9706->5204|9736->5205|9796->5236|9826->5237|9919->5302|9949->5303|9992->5317|10022->5318|10115->5383|10145->5384|10182->5393|10212->5394|10253->5407|10283->5408|10320->5426|10360->5428|10447->5478|10463->5484|10522->5520|10545->5524|10585->5526|10619->5528
                    LINES: 26->1|28->3|28->3|29->1|31->3|33->5|33->5|33->5|35->7|35->7|35->7|35->7|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|57->29|61->33|61->33|61->33|64->36|64->36|64->36|68->40|68->40|68->40|69->41|69->41|69->41|72->44|72->44|72->44|73->45|73->45|73->45|77->49|77->49|77->49|79->51|79->51|79->51|79->51|79->51|82->54|83->55|83->55|83->55|85->57|89->61|89->61|90->62|90->62|95->67|95->67|97->69|97->69|101->73|101->73|105->77|105->77|107->79|107->79|108->80|108->80|109->81|109->81|110->82|110->82|111->83|111->83|115->87|115->87|115->87|116->88|116->88|116->88|116->88|116->88|116->88|116->88|116->88|116->88|116->88|116->88|116->88|116->88|117->89|119->91|119->91|125->97|125->97|127->99|127->99|128->100|128->100|129->101|129->101|135->107|135->107|137->109|137->109|138->110|138->110|140->112|140->112|142->114|142->114|144->116|144->116|146->118|146->118|152->124|152->124|158->130|158->130|161->133|161->133|163->135|163->135|164->136|164->136|165->137|165->137|166->138|166->138|171->143|171->143|172->144|172->144|173->145|173->145|175->147|175->147|176->148|176->148|178->150|178->150|179->151|179->151|180->152|180->152|182->154|182->154|183->155|183->155|183->155|184->156|184->156|185->157
                    -- GENERATED --
                */
            