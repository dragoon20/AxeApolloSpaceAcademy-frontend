
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
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Anggota],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(anggotaForm: Form[Anggota]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
implicit def /*3.2*/implicitField/*3.15*/ = {{ views.html.helper.FieldConstructor(templateFormInline.f) }};
Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*3.79*/("""

"""),_display_(Seq[Any](/*5.2*/main("Axe Appolo Space Academy - register")/*5.45*/ {_display_(Seq[Any](format.raw/*5.47*/("""

    <div id="main-content">
        <div class="content-title">Pendaftaran Anggota Erlangga Airlines</div>
        <div id="content-description">
            Menjadi Anggota Erlangga Airlines berarti yang perlu dilakukan adalah
            menyimpan rincian Anda SEKALI SAJA dan Anda dapat membukanya pada saat
            membeli tiket di masa mendatang melalui EAirlines.co.id
        </div>

        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(action = routes.Application.newAnggota(), 'id -> "anggota-form", 'class->"form-horizontal")/*15.113*/ {_display_(Seq[Any](format.raw/*15.115*/("""

            """),_display_(Seq[Any](/*17.14*/helper/*17.20*/.inputText(anggotaForm("nama"), '_label -> "Nama", '_showConstraints -> false, 'class -> "form-control"))),format.raw/*17.124*/("""
            """),_display_(Seq[Any](/*18.14*/helper/*18.20*/.inputPassword(anggotaForm("sandi"), '_label -> "Sandi", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*18.129*/("""
            """),_display_(Seq[Any](/*19.14*/helper/*19.20*/.inputPassword(anggotaForm("konfirmasi_sandi"), '_label -> "Konfirmasi Sandi", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*19.151*/("""
            """),_display_(Seq[Any](/*20.14*/helper/*20.20*/.inputText(anggotaForm("email"), '_label -> "Alamat Email", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*20.132*/("""

            """),_display_(Seq[Any](/*22.14*/helper/*22.20*/.inputText(anggotaForm("no_handphone"), '_label -> "Nomor Handphone", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*22.142*/("""
            """),_display_(Seq[Any](/*23.14*/helper/*23.20*/.textarea(anggotaForm("alamat"), '_label -> "Alamat", '_showConstraints ->false, 'class -> "form-control"))),format.raw/*23.126*/("""

            <div class="form-group">
                <div class="submit">
                    <button type="submit" class="btn btn-primary">Daftar Sekarang Juga!</button>
                </div>
            </div>
        """)))})),format.raw/*30.10*/("""
    </div>

""")))}/*33.2*/ {_display_(Seq[Any](format.raw/*33.4*/("""
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*34.50*/routes/*34.56*/.Assets.at("stylesheets/form.css"))),format.raw/*34.90*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*35.50*/routes/*35.56*/.Assets.at("stylesheets/register.css"))),format.raw/*35.94*/("""">
""")))}/*36.2*/ {_display_(Seq[Any](format.raw/*36.4*/("""
    <script type="text/javascript">
        $(document).ready(function() """),format.raw/*38.38*/("""{"""),format.raw/*38.39*/("""
            var parent = $("#no_handphone").parent();
            parent.addClass("input-group");
            parent.prepend('<span class="input-group-addon">+62</span>');
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/(""");
    </script>
""")))})),format.raw/*44.2*/("""

"""))}
    }
    
    def render(anggotaForm:Form[Anggota]): play.api.templates.HtmlFormat.Appendable = apply(anggotaForm)
    
    def f:((Form[Anggota]) => play.api.templates.HtmlFormat.Appendable) = (anggotaForm) => apply(anggotaForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 13 16:36:39 WIT 2013
                    SOURCE: /media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/app/views/register.scala.html
                    HASH: 3584a13723ee00d26166a2df789258559cdf4f8b
                    MATRIX: 784->1|898->32|919->45|1013->29|1042->109|1079->112|1130->155|1169->157|1611->563|1626->569|1733->666|1774->668|1825->683|1840->689|1967->793|2017->807|2032->813|2164->922|2214->936|2229->942|2383->1073|2433->1087|2448->1093|2583->1205|2634->1220|2649->1226|2794->1348|2844->1362|2859->1368|2988->1474|3244->1698|3276->1712|3315->1714|3401->1764|3416->1770|3472->1804|3560->1856|3575->1862|3635->1900|3657->1904|3696->1906|3798->1980|3827->1981|4035->2162|4064->2163|4113->2181
                    LINES: 26->1|28->3|28->3|29->1|31->3|33->5|33->5|33->5|43->15|43->15|43->15|43->15|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|50->22|50->22|50->22|51->23|51->23|51->23|58->30|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|66->38|66->38|70->42|70->42|72->44
                    -- GENERATED --
                */
            