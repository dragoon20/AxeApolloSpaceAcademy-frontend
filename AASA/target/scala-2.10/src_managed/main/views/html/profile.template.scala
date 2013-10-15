
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Anggota],List[Pemesan],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(anggotaForm: Form[Anggota], pemesanList: List[Pemesan], isLogin: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
implicit def /*3.2*/implicitField/*3.15*/ = {{ views.html.helper.FieldConstructor(templateFormInline.f) }};
Seq[Any](format.raw/*1.75*/("""

"""),format.raw/*3.79*/("""

"""),_display_(Seq[Any](/*5.2*/main("Axe Appolo Space Academy - profile", isLogin)/*5.53*/ {_display_(Seq[Any](format.raw/*5.55*/("""

    <div id="main-content">
        <div id="tabs">
            <ul>
                <li><a href="#tabs-1">Ubah Profil</a></li>
                <li><a href="#tabs-2">Pemesanan Saya</a></li>
            </ul>
            <div id="tabs-1">
                <div class="content-title">Ubah Profil</div>

                """),_display_(Seq[Any](/*16.18*/helper/*16.24*/.form(action = routes.Application.changeAnggotaData(), 'id -> "anggota-form", 'class->"form-horizontal")/*16.128*/ {_display_(Seq[Any](format.raw/*16.130*/("""

                    """),_display_(Seq[Any](/*18.22*/helper/*18.28*/.inputText(anggotaForm("nama"), '_label -> "Nama", '_showConstraints -> false, 'class -> "form-control"))),format.raw/*18.132*/("""
                    """),_display_(Seq[Any](/*19.22*/helper/*19.28*/.inputText(anggotaForm("email"), '_label -> "Alamat Email", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*19.140*/("""

                    """),_display_(Seq[Any](/*21.22*/helper/*21.28*/.inputText(anggotaForm("no_handphone"), '_label -> "Nomor Handphone", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*21.150*/("""
                    """),_display_(Seq[Any](/*22.22*/helper/*22.28*/.textarea(anggotaForm("alamat"), '_label -> "Alamat", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*22.134*/("""

                    <div class="form-group">
                        <div class="submit">
                            <button type="submit" class="btn btn-primary">Ubah Data</button>
                        </div>
                    </div>
                """)))})),format.raw/*29.18*/("""
            </div>
            <div id="tabs-2">
                <div class="content-title">Pemesanan Saya</div>
                """),_display_(Seq[Any](/*33.18*/for(pemesan <- pemesanList) yield /*33.45*/ {_display_(Seq[Any](format.raw/*33.47*/("""
                    <div class="pemesanan">
                        <div class="pemesanan-kode left">
                            """),_display_(Seq[Any](/*36.30*/pemesan/*36.37*/.getPemesanan().penerbangan.kode_penerbangan)),format.raw/*36.81*/("""
                        </div>
                        <div class="pemesanan-tanggal left">
                            """),_display_(Seq[Any](/*39.30*/pemesan/*39.37*/.getPemesanan().penerbangan.tanggal)),format.raw/*39.72*/("""
                        </div>
                        <div class="pemesanan-darike left">
                            """),_display_(Seq[Any](/*42.30*/pemesan/*42.37*/.getPemesanan().penerbangan.bandara_asal.nama)),format.raw/*42.82*/(""" - """),_display_(Seq[Any](/*42.86*/pemesan/*42.93*/.getPemesanan().penerbangan.bandara_tujuan.nama)),format.raw/*42.140*/("""
                        </div>
                        <div class="pemesanan-harga left">
                            Rp """),_display_(Seq[Any](/*45.33*/pemesan/*45.40*/.getPemesanan().penerbangan.harga)),format.raw/*45.73*/(""",00
                        </div>
                        <a class="cancel_pemesanan btn btn-primary" href="javascript:void(0)" data-pemesanan-id=""""),_display_(Seq[Any](/*47.115*/pemesan/*47.122*/.getPemesanan().id)),format.raw/*47.140*/("""">Refund</a>
                        <div class="clear"></div>
                    </div>
                """)))})),format.raw/*50.18*/("""
                """),_display_(Seq[Any](/*51.18*/if(pemesanList.isEmpty())/*51.43*/ {_display_(Seq[Any](format.raw/*51.45*/("""
                    Anda belum pernah memesan tiket pada website Erlangga Airlines.
                """)))})),format.raw/*53.18*/("""
            </div>
        </div>
    </div>

""")))}/*58.2*/ {_display_(Seq[Any](format.raw/*58.4*/("""
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*59.50*/routes/*59.56*/.Assets.at("stylesheets/form.css"))),format.raw/*59.90*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*60.50*/routes/*60.56*/.Assets.at("stylesheets/register.css"))),format.raw/*60.94*/("""">
    <style>
        .ui-tabs-vertical """),format.raw/*62.27*/("""{"""),format.raw/*62.28*/(""" width: 100%; border: 0px; """),format.raw/*62.55*/("""}"""),format.raw/*62.56*/("""
        .ui-tabs-vertical .ui-tabs-nav """),format.raw/*63.40*/("""{"""),format.raw/*63.41*/(""" padding: .2em .1em .2em .2em; float: left; width: 12em; """),format.raw/*63.98*/("""}"""),format.raw/*63.99*/("""
        .ui-tabs-vertical .ui-tabs-nav li """),format.raw/*64.43*/("""{"""),format.raw/*64.44*/(""" clear: left; width: 100%; border-bottom-width: 1px !important; border-right-width: 0 !important; margin: 0 -1px .2em 0; """),format.raw/*64.165*/("""}"""),format.raw/*64.166*/("""
        .ui-tabs-vertical .ui-tabs-nav li a """),format.raw/*65.45*/("""{"""),format.raw/*65.46*/(""" display:block; width: 100%;"""),format.raw/*65.74*/("""}"""),format.raw/*65.75*/("""
        .ui-tabs-vertical .ui-tabs-nav li.ui-tabs-active """),format.raw/*66.58*/("""{"""),format.raw/*66.59*/(""" padding-bottom: 0; padding-right: .1em; border-right-width: 1px; border-right-width: 1px; """),format.raw/*66.150*/("""}"""),format.raw/*66.151*/("""
        .ui-tabs-vertical .ui-tabs-panel """),format.raw/*67.42*/("""{"""),format.raw/*67.43*/(""" padding: 1em; float: left; width: 780px;"""),format.raw/*67.84*/("""}"""),format.raw/*67.85*/("""

        .pemesanan
        """),format.raw/*70.9*/("""{"""),format.raw/*70.10*/("""
            padding: 20px;
            margin-bottom: 20px;
            background-color: #E9E16C;
            text-align: center;
            line-height: 30px;
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/("""
        .pemesanan:hover
        """),format.raw/*78.9*/("""{"""),format.raw/*78.10*/("""
            background-color: #FEF554;
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/("""
        .pemesanan-kode
        """),format.raw/*82.9*/("""{"""),format.raw/*82.10*/("""
            color: #6B95E9;
            font-weight: bold;
            width: 100px;
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""
        .pemesanan-tanggal
        """),format.raw/*88.9*/("""{"""),format.raw/*88.10*/("""
            width: 100px;
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""
        .pemesanan-darike
        """),format.raw/*92.9*/("""{"""),format.raw/*92.10*/("""
            width: 200px;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""
        .pemesanan-harga
        """),format.raw/*96.9*/("""{"""),format.raw/*96.10*/("""
            width: 100px;
        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/("""
    </style>
""")))}/*100.2*/ {_display_(Seq[Any](format.raw/*100.4*/("""
    <script type="text/javascript">
        $(document).ready(function() """),format.raw/*102.38*/("""{"""),format.raw/*102.39*/("""
            var parent = $("#no_handphone").parent();
            parent.addClass("input-group");
            parent.prepend('<span class="input-group-addon">+62</span>');

            $(".cancel_pemesanan").click(function(e) """),format.raw/*107.54*/("""{"""),format.raw/*107.55*/("""
                e.preventDefault();
                var that = $(this);
                $.post("/askRefund", """),format.raw/*110.38*/("""{"""),format.raw/*110.39*/(""""pemesanan_id": that.attr("data-pemesanan-id")"""),format.raw/*110.85*/("""}"""),format.raw/*110.86*/(""", function (data) """),format.raw/*110.104*/("""{"""),format.raw/*110.105*/("""
                    if (data["status"]=="success")
                    """),format.raw/*112.21*/("""{"""),format.raw/*112.22*/("""
                        alert("Refund akan segera diproses oleh tim Erlangga Airlines.");
                    """),format.raw/*114.21*/("""}"""),format.raw/*114.22*/("""
                    else
                    """),format.raw/*116.21*/("""{"""),format.raw/*116.22*/("""
                        alert("Server sedang mengalami masalah, refund gagal.");
                    """),format.raw/*118.21*/("""}"""),format.raw/*118.22*/("""
                """),format.raw/*119.17*/("""}"""),format.raw/*119.18*/(""");
            """),format.raw/*120.13*/("""}"""),format.raw/*120.14*/(""");
        """),format.raw/*121.9*/("""}"""),format.raw/*121.10*/(""");
        $(function() """),format.raw/*122.22*/("""{"""),format.raw/*122.23*/("""
            $( "#tabs" ).tabs().addClass( "ui-tabs-vertical ui-helper-clearfix" );
            $( "#tabs li" ).removeClass( "ui-corner-top" ).addClass( "ui-corner-left" );
        """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/(""");
    </script>
""")))})),format.raw/*127.2*/("""

"""))}
    }
    
    def render(anggotaForm:Form[Anggota],pemesanList:List[Pemesan],isLogin:String): play.api.templates.HtmlFormat.Appendable = apply(anggotaForm,pemesanList,isLogin)
    
    def f:((Form[Anggota],List[Pemesan],String) => play.api.templates.HtmlFormat.Appendable) = (anggotaForm,pemesanList,isLogin) => apply(anggotaForm,pemesanList,isLogin)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 14 00:40:27 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/profile.scala.html
                    HASH: 8bc564dae2f5b7641126839bbfb2f4f241ee7ec9
                    MATRIX: 804->1|963->77|984->90|1078->74|1107->154|1144->157|1203->208|1242->210|1597->529|1612->535|1726->639|1767->641|1826->664|1841->670|1968->774|2026->796|2041->802|2176->914|2235->937|2250->943|2395->1065|2453->1087|2468->1093|2597->1199|2889->1459|3056->1590|3099->1617|3139->1619|3307->1751|3323->1758|3389->1802|3547->1924|3563->1931|3620->1966|3777->2087|3793->2094|3860->2139|3900->2143|3916->2150|3986->2197|4145->2320|4161->2327|4216->2360|4402->2509|4419->2516|4460->2534|4599->2641|4653->2659|4687->2684|4727->2686|4861->2788|4927->2836|4966->2838|5052->2888|5067->2894|5123->2928|5211->2980|5226->2986|5286->3024|5355->3065|5384->3066|5439->3093|5468->3094|5536->3134|5565->3135|5650->3192|5679->3193|5750->3236|5779->3237|5929->3358|5959->3359|6032->3404|6061->3405|6117->3433|6146->3434|6232->3492|6261->3493|6381->3584|6411->3585|6481->3627|6510->3628|6579->3669|6608->3670|6664->3699|6693->3700|6891->3871|6920->3872|6981->3906|7010->3907|7085->3955|7114->3956|7174->3989|7203->3990|7324->4084|7353->4085|7416->4121|7445->4122|7507->4157|7536->4158|7598->4193|7627->4194|7689->4229|7718->4230|7779->4264|7808->4265|7870->4300|7899->4301|7933->4316|7973->4318|8076->4392|8106->4393|8362->4620|8392->4621|8531->4731|8561->4732|8636->4778|8666->4779|8714->4797|8745->4798|8846->4870|8876->4871|9016->4982|9046->4983|9121->5029|9151->5030|9282->5132|9312->5133|9358->5150|9388->5151|9432->5166|9462->5167|9501->5178|9531->5179|9584->5203|9614->5204|9823->5385|9853->5386|9903->5404
                    LINES: 26->1|28->3|28->3|29->1|31->3|33->5|33->5|33->5|44->16|44->16|44->16|44->16|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|57->29|61->33|61->33|61->33|64->36|64->36|64->36|67->39|67->39|67->39|70->42|70->42|70->42|70->42|70->42|70->42|73->45|73->45|73->45|75->47|75->47|75->47|78->50|79->51|79->51|79->51|81->53|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|90->62|90->62|90->62|90->62|91->63|91->63|91->63|91->63|92->64|92->64|92->64|92->64|93->65|93->65|93->65|93->65|94->66|94->66|94->66|94->66|95->67|95->67|95->67|95->67|98->70|98->70|104->76|104->76|106->78|106->78|108->80|108->80|110->82|110->82|114->86|114->86|116->88|116->88|118->90|118->90|120->92|120->92|122->94|122->94|124->96|124->96|126->98|126->98|128->100|128->100|130->102|130->102|135->107|135->107|138->110|138->110|138->110|138->110|138->110|138->110|140->112|140->112|142->114|142->114|144->116|144->116|146->118|146->118|147->119|147->119|148->120|148->120|149->121|149->121|150->122|150->122|153->125|153->125|155->127
                    -- GENERATED --
                */
            