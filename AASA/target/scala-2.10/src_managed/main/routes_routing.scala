// @SOURCE:/media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/conf/routes
// @HASH:f06565b0eb7d894b1df8ad6f2cd859981efde6fa
// @DATE:Tue Oct 15 20:31:13 WIT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_register1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:8
private[this] lazy val controllers_Application_newAnggota2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:9
private[this] lazy val controllers_Application_activateAnggota3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activate"))))
        

// @LINE:10
private[this] lazy val controllers_Application_login4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Application_doLogin5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:12
private[this] lazy val controllers_Application_forgotPass6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forgot_pass"))))
        

// @LINE:13
private[this] lazy val controllers_Application_sendChangePass7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forgot_pass"))))
        

// @LINE:14
private[this] lazy val controllers_Application_changePass8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("change_pass"))))
        

// @LINE:15
private[this] lazy val controllers_Application_doChangePass9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("change_pass"))))
        

// @LINE:16
private[this] lazy val controllers_Application_profile10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:17
private[this] lazy val controllers_Application_changeAnggotaData11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:18
private[this] lazy val controllers_Application_search12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
        

// @LINE:19
private[this] lazy val controllers_Application_logout13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:20
private[this] lazy val controllers_Application_askRefund14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("askRefund"))))
        

// @LINE:23
private[this] lazy val controllers_Booking_order15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("order"))))
        

// @LINE:24
private[this] lazy val controllers_Booking_addOrderer16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ordererData"))))
        

// @LINE:25
private[this] lazy val controllers_Booking_addPassenger17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("passengerData"))))
        

// @LINE:26
private[this] lazy val controllers_Booking_payment18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("payment"))))
        

// @LINE:27
private[this] lazy val controllers_Booking_sendBooking19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("payment"))))
        

// @LINE:30
private[this] lazy val controllers_Assets_at20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.register()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.newAnggota()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activate""","""controllers.Application.activateAnggota(activation_code:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.doLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forgot_pass""","""controllers.Application.forgotPass()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forgot_pass""","""controllers.Application.sendChangePass()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """change_pass""","""controllers.Application.changePass(code:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """change_pass""","""controllers.Application.doChangePass()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.changeAnggotaData()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Application.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """askRefund""","""controllers.Application.askRefund()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """order""","""controllers.Booking.order(id:Long, jumlah:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ordererData""","""controllers.Booking.addOrderer()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """passengerData""","""controllers.Booking.addPassenger()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """payment""","""controllers.Booking.payment(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """payment""","""controllers.Booking.sendBooking()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_register1(params) => {
   call { 
        invokeHandler(controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Nil,"GET", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:8
case controllers_Application_newAnggota2(params) => {
   call { 
        invokeHandler(controllers.Application.newAnggota(), HandlerDef(this, "controllers.Application", "newAnggota", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:9
case controllers_Application_activateAnggota3(params) => {
   call(params.fromQuery[String]("activation_code", None)) { (activation_code) =>
        invokeHandler(controllers.Application.activateAnggota(activation_code), HandlerDef(this, "controllers.Application", "activateAnggota", Seq(classOf[String]),"GET", """""", Routes.prefix + """activate"""))
   }
}
        

// @LINE:10
case controllers_Application_login4(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Application_doLogin5(params) => {
   call { 
        invokeHandler(controllers.Application.doLogin(), HandlerDef(this, "controllers.Application", "doLogin", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:12
case controllers_Application_forgotPass6(params) => {
   call { 
        invokeHandler(controllers.Application.forgotPass(), HandlerDef(this, "controllers.Application", "forgotPass", Nil,"GET", """""", Routes.prefix + """forgot_pass"""))
   }
}
        

// @LINE:13
case controllers_Application_sendChangePass7(params) => {
   call { 
        invokeHandler(controllers.Application.sendChangePass(), HandlerDef(this, "controllers.Application", "sendChangePass", Nil,"POST", """""", Routes.prefix + """forgot_pass"""))
   }
}
        

// @LINE:14
case controllers_Application_changePass8(params) => {
   call(params.fromQuery[String]("code", None)) { (code) =>
        invokeHandler(controllers.Application.changePass(code), HandlerDef(this, "controllers.Application", "changePass", Seq(classOf[String]),"GET", """""", Routes.prefix + """change_pass"""))
   }
}
        

// @LINE:15
case controllers_Application_doChangePass9(params) => {
   call { 
        invokeHandler(controllers.Application.doChangePass(), HandlerDef(this, "controllers.Application", "doChangePass", Nil,"POST", """""", Routes.prefix + """change_pass"""))
   }
}
        

// @LINE:16
case controllers_Application_profile10(params) => {
   call { 
        invokeHandler(controllers.Application.profile(), HandlerDef(this, "controllers.Application", "profile", Nil,"GET", """""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:17
case controllers_Application_changeAnggotaData11(params) => {
   call { 
        invokeHandler(controllers.Application.changeAnggotaData(), HandlerDef(this, "controllers.Application", "changeAnggotaData", Nil,"POST", """""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:18
case controllers_Application_search12(params) => {
   call { 
        invokeHandler(controllers.Application.search(), HandlerDef(this, "controllers.Application", "search", Nil,"GET", """""", Routes.prefix + """search"""))
   }
}
        

// @LINE:19
case controllers_Application_logout13(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:20
case controllers_Application_askRefund14(params) => {
   call { 
        invokeHandler(controllers.Application.askRefund(), HandlerDef(this, "controllers.Application", "askRefund", Nil,"POST", """""", Routes.prefix + """askRefund"""))
   }
}
        

// @LINE:23
case controllers_Booking_order15(params) => {
   call(params.fromQuery[Long]("id", None), params.fromQuery[Long]("jumlah", None)) { (id, jumlah) =>
        invokeHandler(controllers.Booking.order(id, jumlah), HandlerDef(this, "controllers.Booking", "order", Seq(classOf[Long], classOf[Long]),"GET", """ Booking""", Routes.prefix + """order"""))
   }
}
        

// @LINE:24
case controllers_Booking_addOrderer16(params) => {
   call { 
        invokeHandler(controllers.Booking.addOrderer(), HandlerDef(this, "controllers.Booking", "addOrderer", Nil,"POST", """""", Routes.prefix + """ordererData"""))
   }
}
        

// @LINE:25
case controllers_Booking_addPassenger17(params) => {
   call { 
        invokeHandler(controllers.Booking.addPassenger(), HandlerDef(this, "controllers.Booking", "addPassenger", Nil,"POST", """""", Routes.prefix + """passengerData"""))
   }
}
        

// @LINE:26
case controllers_Booking_payment18(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Booking.payment(id), HandlerDef(this, "controllers.Booking", "payment", Seq(classOf[Long]),"GET", """""", Routes.prefix + """payment"""))
   }
}
        

// @LINE:27
case controllers_Booking_sendBooking19(params) => {
   call { 
        invokeHandler(controllers.Booking.sendBooking(), HandlerDef(this, "controllers.Booking", "sendBooking", Nil,"POST", """""", Routes.prefix + """payment"""))
   }
}
        

// @LINE:30
case controllers_Assets_at20(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     