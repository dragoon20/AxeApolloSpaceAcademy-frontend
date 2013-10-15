
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
object bookingData extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[Form[Pemesan],Long,Pemesanan,Integer,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pemesanForm: Form[Pemesan], jumlahPenumpang: Long, pemesanan: Pemesanan, idPemesan: Integer, isLogin: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
implicit def /*3.2*/implicitField/*3.15*/ = {{ views.html.helper.FieldConstructor(templateFormInline.f) }};
Seq[Any](format.raw/*1.112*/("""

"""),format.raw/*3.79*/("""

"""),_display_(Seq[Any](/*5.2*/main("Axe Appolo Space Academy - Isi data penumpang", isLogin)/*5.64*/ {_display_(Seq[Any](format.raw/*5.66*/("""

    <div class="main-content">
        <div class="content-title">Pengisian data pemesan</div>
        """),_display_(Seq[Any](/*9.10*/helper/*9.16*/.form(action = routes.Booking.addOrderer(), 'id -> "pemesanForm")/*9.81*/ {_display_(Seq[Any](format.raw/*9.83*/("""
            <input name="pemesanan_id" type="hidden" value=""""),_display_(Seq[Any](/*10.62*/pemesanan/*10.71*/.id)),format.raw/*10.74*/("""" />
            <input name="id" type="hidden" value=""""),_display_(Seq[Any](/*11.52*/idPemesan)),format.raw/*11.61*/("""" />
            """),_display_(Seq[Any](/*12.14*/helper/*12.20*/.inputText(pemesanForm("nama"), '_label -> "Nama", '_showConstraints -> false, 'class -> "form-control"))),format.raw/*12.124*/("""
            """),_display_(Seq[Any](/*13.14*/helper/*13.20*/.inputText(pemesanForm("email"), '_label -> "Alamat Email", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*13.132*/("""
            """),_display_(Seq[Any](/*14.14*/helper/*14.20*/.inputText(pemesanForm("no_handphone"), '_label -> "No. Handphone", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*14.140*/("""

            <div class="right">
                <button id="submit-pemesan" type="submit" class="btn btn-primary">Lanjutkan</button>
            </div>
        """)))})),format.raw/*19.10*/("""

        <div class="clear"></div>
    </div>
    <script type="text/javascript">
        var jumlah = """),_display_(Seq[Any](/*24.23*/jumlahPenumpang)),format.raw/*24.38*/(""";
        var check = true;
        $(document).ready(function() """),format.raw/*26.38*/("""{"""),format.raw/*26.39*/("""
            var parent = $("#no_handphone").parent();
            parent.addClass("input-group");
            parent.prepend('<span class="input-group-addon">+62</span>');
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/(""");
        $("#submit-pemesan").click(function(e) """),format.raw/*31.48*/("""{"""),format.raw/*31.49*/("""
            e.preventDefault();
            if (check)
            """),format.raw/*34.13*/("""{"""),format.raw/*34.14*/("""
                $.post("ordererData", $("#pemesanForm").serialize(), function (data) """),format.raw/*35.86*/("""{"""),format.raw/*35.87*/("""
                    if (data["status"]=="success")
                    """),format.raw/*37.21*/("""{"""),format.raw/*37.22*/("""
                        var content = '';
                        content += '<div class="main-content">';
                            content += '<div class="content-title">Pengisian data penumpang</div>';
                            for (var i=0;i<jumlah;++i)
                            """),format.raw/*42.29*/("""{"""),format.raw/*42.30*/("""
                                content += '<form id="penumpangForm_'+i+'" action="/passengerData" method="POST" class="penumpangForm">';
                                    content += '<input name="pemesanan_id" type="hidden" value=""""),_display_(Seq[Any](/*44.98*/pemesanan/*44.107*/.id)),format.raw/*44.110*/("""" />';
                                    content += '<div class="form-group ">';
                                        content += '<label class="col-lg-4 control-label" for="titel_'+i+'">Titel</label>';
                                        content += '<div class="col-lg-8">';
                                            content += '<select id="titel_'+i+'" name="titel" class="form-control">';
                                                content += '<option value="Tuan">Tuan</option>';
                                                content += '<option value="Nyonya">Nyonya</option>';
                                                content += '<option value="Nona">Nona</option>';
                                            content += '</select>';
                                            content += '<span class="help-inline"></span>';
                                        content += '</div>';
                                    content += '<div class="clear"></div>';
                                        content += '</div>';
                                    content += '<div class="form-group ">';
                                        content += '<label class="col-lg-4 control-label" for="nama'+i+'">Nama Lengkap Penumpang</label>';
                                        content += '<div class="col-lg-8">';
                                            content += '<input id="nama'+i+'" type="text" name="nama" value="" class="form-control">';
                                            content += '<span class="help-inline"></span>';
                                        content += '</div>';
                                        content += '<div class="clear"></div>';
                                    content += '</div>';
                                content += '</form>';
                            """),format.raw/*66.29*/("""}"""),format.raw/*66.30*/("""
                            content += '<div class="right">';
                                content += '<button id="submit-penumpang" type="submit" class="btn btn-primary">Pesan</button>';
                            content += '</div>';
                            content += '<div class="clear"></div>';
                        content += '</div>';

                        $(".main-content").after(content);
                        $("#submit-pemesan").hide();
                        $("#submit-penumpang").click(function(e) """),format.raw/*75.66*/("""{"""),format.raw/*75.67*/("""
                            e.preventDefault();
                            $.post("ordererData", $("#pemesanForm").serialize());
                            for (var i=0;i<jumlah;++i)
                            """),format.raw/*79.29*/("""{"""),format.raw/*79.30*/("""
                                $.post("passengerData", $("#penumpangForm_"+i).serialize());
                            """),format.raw/*81.29*/("""}"""),format.raw/*81.30*/("""
                            setTimeout(function() """),format.raw/*82.51*/("""{"""),format.raw/*82.52*/("""
                                window.location = "/payment?id="""),_display_(Seq[Any](/*83.65*/pemesanan/*83.74*/.id)),format.raw/*83.77*/("""";
                            """),format.raw/*84.29*/("""}"""),format.raw/*84.30*/(""", 300);
                        """),format.raw/*85.25*/("""}"""),format.raw/*85.26*/(""");
                        check = false;
                    """),format.raw/*87.21*/("""}"""),format.raw/*87.22*/("""
                    else
                    """),format.raw/*89.21*/("""{"""),format.raw/*89.22*/("""
                        alert("Pemesanan gagal, silahkan coba lagi.");
                        location.reload();
                    """),format.raw/*92.21*/("""}"""),format.raw/*92.22*/("""
                """),format.raw/*93.17*/("""}"""),format.raw/*93.18*/(""");
            """),format.raw/*94.13*/("""}"""),format.raw/*94.14*/("""
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/(""");
    </script>
""")))}/*97.2*/ {_display_(Seq[Any](format.raw/*97.4*/("""
    <style>
        .main-content
        """),format.raw/*100.9*/("""{"""),format.raw/*100.10*/("""
            background-color: #DEDEDE;
            padding: 10px;
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""
        .main-content:nth-child(even)
        """),format.raw/*105.9*/("""{"""),format.raw/*105.10*/("""
            margin-top: 15px;
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/("""
    </style>
""")))}/*109.2*/ {_display_(Seq[Any](format.raw/*109.4*/("""
""")))})))}
    }
    
    def render(pemesanForm:Form[Pemesan],jumlahPenumpang:Long,pemesanan:Pemesanan,idPemesan:Integer,isLogin:String): play.api.templates.HtmlFormat.Appendable = apply(pemesanForm,jumlahPenumpang,pemesanan,idPemesan,isLogin)
    
    def f:((Form[Pemesan],Long,Pemesanan,Integer,String) => play.api.templates.HtmlFormat.Appendable) = (pemesanForm,jumlahPenumpang,pemesanan,idPemesan,isLogin) => apply(pemesanForm,jumlahPenumpang,pemesanan,idPemesan,isLogin)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 13 20:00:25 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/bookingData.scala.html
                    HASH: 561f1ea7958ca60bbd7fc12f41b9c9faaa140add
                    MATRIX: 817->1|1013->114|1034->127|1129->111|1158->191|1195->194|1265->256|1304->258|1445->364|1459->370|1532->435|1571->437|1669->499|1687->508|1712->511|1804->567|1835->576|1889->594|1904->600|2031->704|2081->718|2096->724|2231->836|2281->850|2296->856|2439->976|2634->1139|2775->1244|2812->1259|2905->1324|2934->1325|3142->1506|3171->1507|3249->1557|3278->1558|3374->1626|3403->1627|3517->1713|3546->1714|3646->1786|3675->1787|3994->2078|4023->2079|4295->2315|4314->2324|4340->2327|6222->4181|6251->4182|6811->4714|6840->4715|7082->4929|7111->4930|7261->5052|7290->5053|7369->5104|7398->5105|7499->5170|7517->5179|7542->5182|7601->5213|7630->5214|7690->5246|7719->5247|7809->5309|7838->5310|7912->5356|7941->5357|8104->5492|8133->5493|8178->5510|8207->5511|8250->5526|8279->5527|8315->5536|8344->5537|8380->5555|8419->5557|8490->5600|8520->5601|8623->5676|8653->5677|8728->5724|8758->5725|8825->5764|8855->5765|8889->5780|8929->5782
                    LINES: 26->1|28->3|28->3|29->1|31->3|33->5|33->5|33->5|37->9|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|47->19|52->24|52->24|54->26|54->26|58->30|58->30|59->31|59->31|62->34|62->34|63->35|63->35|65->37|65->37|70->42|70->42|72->44|72->44|72->44|94->66|94->66|103->75|103->75|107->79|107->79|109->81|109->81|110->82|110->82|111->83|111->83|111->83|112->84|112->84|113->85|113->85|115->87|115->87|117->89|117->89|120->92|120->92|121->93|121->93|122->94|122->94|123->95|123->95|125->97|125->97|128->100|128->100|131->103|131->103|133->105|133->105|135->107|135->107|137->109|137->109
                    -- GENERATED --
                */
            