
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
object payment extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Pemesanan,Form[Booking.Payment],Long,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pemesanan: Pemesanan, pembayaranForm: Form[Booking.Payment], totalHarga: Long, isLogin: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
implicit def /*3.2*/implicitField/*3.15*/ = {{ views.html.helper.FieldConstructor(templateFormInline.f) }};
Seq[Any](format.raw/*1.98*/("""

"""),format.raw/*3.79*/("""

"""),_display_(Seq[Any](/*5.2*/main("Axe Appolo Space Academy - Pembayaran", isLogin)/*5.56*/ {_display_(Seq[Any](format.raw/*5.58*/("""

    <div id="sidebar">
        <div id="paymentForm">
            <form action="http://localhost/dummy/" id="payment_form">
                <div class="form-title">Form Pembayaran</div>
                """),_display_(Seq[Any](/*11.18*/if(pembayaranForm.hasGlobalErrors())/*11.54*/ {_display_(Seq[Any](format.raw/*11.56*/("""
                    <div class="help-error">"""),_display_(Seq[Any](/*12.46*/pembayaranForm/*12.60*/.globalError().message())),format.raw/*12.84*/("""</div>
                """)))})),format.raw/*13.18*/("""

                """),_display_(Seq[Any](/*15.18*/helper/*15.24*/.inputText(pembayaranForm("nomor"), '_label -> "Nomor Kartu Kredit", '_showConstraints -> false, 'class -> "form-control"))),format.raw/*15.146*/("""
                """),_display_(Seq[Any](/*16.18*/helper/*16.24*/.inputText(pembayaranForm("nama"), '_label -> "Nama di Kartu Kredit", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*16.146*/("""
                """),_display_(Seq[Any](/*17.18*/helper/*17.24*/.inputText(pembayaranForm("cvv"), '_label -> "CVV 3 Digit", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*17.136*/("""
                """),_display_(Seq[Any](/*18.18*/helper/*18.24*/.inputText(pembayaranForm("valid_until"), '_label -> "Berlaku Hingga", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*18.147*/("""
                """),_display_(Seq[Any](/*19.18*/helper/*19.24*/.inputText(pembayaranForm("kota"), '_label -> "Kota", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*19.130*/("""
                """),_display_(Seq[Any](/*20.18*/helper/*20.24*/.inputText(pembayaranForm("alamat"), '_label -> "Alamat", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*20.134*/("""
                """),_display_(Seq[Any](/*21.18*/helper/*21.24*/.inputText(pembayaranForm("kode_pos"), '_label -> "Kode Pos", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*21.138*/("""
                """),_display_(Seq[Any](/*22.18*/helper/*22.24*/.inputText(pembayaranForm("telepon"), '_label -> "Telepon", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*22.136*/("""

                <button id="submit-payment" type="submit" class="btn btn-primary right">Bayar</button>
                <div class="clear"></div>
            </form>
        </div>
    </div>
    <div id="main-content">
        <div class="content-title">Detail Pembayaran</div>
        <div id="content-description">
            <div class="harga">
                <div class="label-harga">
                    Harga Tiket
                </div>
                <div class="value-harga">
                    Rp """),_display_(Seq[Any](/*37.25*/pemesanan/*37.34*/.penerbangan.harga)),format.raw/*37.52*/(""",00 x """),_display_(Seq[Any](/*37.59*/pemesanan/*37.68*/.penumpang.size())),format.raw/*37.85*/("""
                </div>
            </div>
            <br />
            <hr />
            <div class="harga">
                <div class="label-harga">
                    Total Harga
                </div>
                <div class="value-harga">
                    Rp """),_display_(Seq[Any](/*47.25*/totalHarga)),format.raw/*47.35*/(""",00
                </div>
            </div>
        </div>
    </div>
    <div class="clear"></div>
    <script type="text/javascript">
        $(function() """),format.raw/*54.22*/("""{"""),format.raw/*54.23*/("""
            $('#valid_until').datepicker( """),format.raw/*55.43*/("""{"""),format.raw/*55.44*/("""
                changeMonth: true,
                changeYear: true,
                showButtonPanel: true,
                dateFormat: 'MM yy',
                onClose: function(dateText, inst) """),format.raw/*60.51*/("""{"""),format.raw/*60.52*/("""
                    var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                    var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                    $(this).datepicker('setDate', new Date(year, month, 1));
                """),format.raw/*64.17*/("""}"""),format.raw/*64.18*/("""
            """),format.raw/*65.13*/("""}"""),format.raw/*65.14*/(""");
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/(""");
        $("#submit-payment").click(function(e) """),format.raw/*67.48*/("""{"""),format.raw/*67.49*/("""
            e.preventDefault();
            $.post("http://localhost/dummy/index.php", $("#payment_form").serialize(), function (data) """),format.raw/*69.104*/("""{"""),format.raw/*69.105*/("""
                data = JSON.parse(data);
                if (data["status"]=="success")
                """),format.raw/*72.17*/("""{"""),format.raw/*72.18*/("""
                    $.post("/payment", """),format.raw/*73.40*/("""{"""),format.raw/*73.41*/("""id: """),_display_(Seq[Any](/*73.46*/pemesanan/*73.55*/.id)),format.raw/*73.58*/("""}"""),format.raw/*73.59*/(""", function (data) """),format.raw/*73.77*/("""{"""),format.raw/*73.78*/("""
                        if (data["status"]=="success")
                        """),format.raw/*75.25*/("""{"""),format.raw/*75.26*/("""
                            alert("Pembayaran berhasil.");
                            window.location = "/";
                        """),format.raw/*78.25*/("""}"""),format.raw/*78.26*/("""
                        else
                        """),format.raw/*80.25*/("""{"""),format.raw/*80.26*/("""
                            alert("Pembayaran gagal.");
                        """),format.raw/*82.25*/("""}"""),format.raw/*82.26*/("""
                    """),format.raw/*83.21*/("""}"""),format.raw/*83.22*/(""");
                """),format.raw/*84.17*/("""}"""),format.raw/*84.18*/("""
                else
                """),format.raw/*86.17*/("""{"""),format.raw/*86.18*/("""
                    alert("Pembayaran gagal.");
                """),format.raw/*88.17*/("""}"""),format.raw/*88.18*/("""
            """),format.raw/*89.13*/("""}"""),format.raw/*89.14*/(""");
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/(""");
    </script>
""")))}/*92.2*/ {_display_(Seq[Any](format.raw/*92.4*/("""
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*93.50*/routes/*93.56*/.Assets.at("stylesheets/form.css"))),format.raw/*93.90*/("""">
    <style>
        #main-content
        """),format.raw/*96.9*/("""{"""),format.raw/*96.10*/("""
            float: left;
            width: 570px;
            padding: 10px;
            font-size: 20px;
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/("""
        #sidebar
        """),format.raw/*103.9*/("""{"""),format.raw/*103.10*/("""
            float: left;
            width: 380px;
            padding: 10px;
            margin-right: 20px;
            background-color: #DEDEDE;
        """),format.raw/*109.9*/("""}"""),format.raw/*109.10*/("""
        .label-harga
        """),format.raw/*111.9*/("""{"""),format.raw/*111.10*/("""
            float: left;
            width: 200px;
        """),format.raw/*114.9*/("""}"""),format.raw/*114.10*/("""
        .value-harga
        """),format.raw/*116.9*/("""{"""),format.raw/*116.10*/("""
            float: left;
            width: 200px;
        """),format.raw/*119.9*/("""}"""),format.raw/*119.10*/("""
        .harga
        """),format.raw/*121.9*/("""{"""),format.raw/*121.10*/("""
            clear: both;
        """),format.raw/*123.9*/("""}"""),format.raw/*123.10*/("""
        hr
        """),format.raw/*125.9*/("""{"""),format.raw/*125.10*/("""
            border-top: 1px solid #000000 !important;
        """),format.raw/*127.9*/("""}"""),format.raw/*127.10*/("""
        .ui-datepicker-calendar """),format.raw/*128.33*/("""{"""),format.raw/*128.34*/("""
            display: none;
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""
    </style>
""")))}/*132.2*/ {_display_(Seq[Any](format.raw/*132.4*/("""
""")))})))}
    }
    
    def render(pemesanan:Pemesanan,pembayaranForm:Form[Booking.Payment],totalHarga:Long,isLogin:String): play.api.templates.HtmlFormat.Appendable = apply(pemesanan,pembayaranForm,totalHarga,isLogin)
    
    def f:((Pemesanan,Form[Booking.Payment],Long,String) => play.api.templates.HtmlFormat.Appendable) = (pemesanan,pembayaranForm,totalHarga,isLogin) => apply(pemesanan,pembayaranForm,totalHarga,isLogin)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 15 20:29:44 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/payment.scala.html
                    HASH: 0c400cdf6cee67fce828fd7c4074615dfdb9acdb
                    MATRIX: 813->1|995->100|1016->113|1110->97|1139->177|1176->180|1238->234|1277->236|1518->441|1563->477|1603->479|1685->525|1708->539|1754->563|1810->587|1865->606|1880->612|2025->734|2079->752|2094->758|2239->880|2293->898|2308->904|2443->1016|2497->1034|2512->1040|2658->1163|2712->1181|2727->1187|2856->1293|2910->1311|2925->1317|3058->1427|3112->1445|3127->1451|3264->1565|3318->1583|3333->1589|3468->1701|4018->2215|4036->2224|4076->2242|4119->2249|4137->2258|4176->2275|4488->2551|4520->2561|4707->2720|4736->2721|4807->2764|4836->2765|5060->2961|5089->2962|5397->3242|5426->3243|5467->3256|5496->3257|5534->3268|5563->3269|5641->3319|5670->3320|5835->3456|5865->3457|5998->3562|6027->3563|6095->3603|6124->3604|6165->3609|6183->3618|6208->3621|6237->3622|6283->3640|6312->3641|6420->3721|6449->3722|6612->3857|6641->3858|6723->3912|6752->3913|6861->3994|6890->3995|6939->4016|6968->4017|7015->4036|7044->4037|7110->4075|7139->4076|7232->4141|7261->4142|7302->4155|7331->4156|7369->4167|7398->4168|7434->4186|7473->4188|7559->4238|7574->4244|7630->4278|7702->4323|7731->4324|7875->4440|7905->4441|7959->4467|7989->4468|8175->4626|8205->4627|8263->4657|8293->4658|8381->4718|8411->4719|8469->4749|8499->4750|8587->4810|8617->4811|8669->4835|8699->4836|8761->4870|8791->4871|8839->4891|8869->4892|8960->4955|8990->4956|9052->4989|9082->4990|9146->5026|9176->5027|9210->5042|9250->5044
                    LINES: 26->1|28->3|28->3|29->1|31->3|33->5|33->5|33->5|39->11|39->11|39->11|40->12|40->12|40->12|41->13|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|65->37|65->37|65->37|65->37|65->37|65->37|75->47|75->47|82->54|82->54|83->55|83->55|88->60|88->60|92->64|92->64|93->65|93->65|94->66|94->66|95->67|95->67|97->69|97->69|100->72|100->72|101->73|101->73|101->73|101->73|101->73|101->73|101->73|101->73|103->75|103->75|106->78|106->78|108->80|108->80|110->82|110->82|111->83|111->83|112->84|112->84|114->86|114->86|116->88|116->88|117->89|117->89|118->90|118->90|120->92|120->92|121->93|121->93|121->93|124->96|124->96|129->101|129->101|131->103|131->103|137->109|137->109|139->111|139->111|142->114|142->114|144->116|144->116|147->119|147->119|149->121|149->121|151->123|151->123|153->125|153->125|155->127|155->127|156->128|156->128|158->130|158->130|160->132|160->132
                    -- GENERATED --
                */
            