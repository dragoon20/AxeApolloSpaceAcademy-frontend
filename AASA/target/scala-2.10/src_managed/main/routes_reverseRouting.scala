// @SOURCE:/media/Data/Project/AxeApolloSpaceAcademy/AxeApolloSpaceAcademy-frontend/AASA/conf/routes
// @HASH:e778db1c54080d3c7e4acf2d36a8c6bbc9bf1bac
// @DATE:Mon Oct 14 00:03:14 WIT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
class ReverseBooking {
    

// @LINE:26
def payment(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "payment" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:23
def order(id:Long, jumlah:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "order" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)), Some(implicitly[QueryStringBindable[Long]].unbind("jumlah", jumlah)))))
}
                                                

// @LINE:24
def addOrderer(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "ordererData")
}
                                                

// @LINE:25
def addPassenger(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "passengerData")
}
                                                
    
}
                          

// @LINE:29
class ReverseAssets {
    

// @LINE:29
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def profile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:9
def activateAnggota(activation_code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "activate" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("activation_code", activation_code)))))
}
                                                

// @LINE:14
def changePass(code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "change_pass" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("code", code)))))
}
                                                

// @LINE:11
def doLogin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:20
def askRefund(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "askRefund")
}
                                                

// @LINE:19
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:15
def doChangePass(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "change_pass")
}
                                                

// @LINE:7
def register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:13
def sendChangePass(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forgot_pass")
}
                                                

// @LINE:8
def newAnggota(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:12
def forgotPass(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forgot_pass")
}
                                                

// @LINE:18
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "search")
}
                                                

// @LINE:17
def changeAnggotaData(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:10
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
class ReverseBooking {
    

// @LINE:26
def payment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Booking.payment",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:23
def order : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Booking.order",
   """
      function(id,jumlah) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("jumlah", jumlah)])})
      }
   """
)
                        

// @LINE:24
def addOrderer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Booking.addOrderer",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ordererData"})
      }
   """
)
                        

// @LINE:25
def addPassenger : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Booking.addPassenger",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "passengerData"})
      }
   """
)
                        
    
}
              

// @LINE:29
class ReverseAssets {
    

// @LINE:29
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:9
def activateAnggota : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.activateAnggota",
   """
      function(activation_code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activate" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("activation_code", activation_code)])})
      }
   """
)
                        

// @LINE:14
def changePass : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.changePass",
   """
      function(code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "change_pass" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("code", code)])})
      }
   """
)
                        

// @LINE:11
def doLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:20
def askRefund : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.askRefund",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "askRefund"})
      }
   """
)
                        

// @LINE:19
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:15
def doChangePass : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doChangePass",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "change_pass"})
      }
   """
)
                        

// @LINE:7
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:13
def sendChangePass : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.sendChangePass",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forgot_pass"})
      }
   """
)
                        

// @LINE:8
def newAnggota : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newAnggota",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:12
def forgotPass : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.forgotPass",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forgot_pass"})
      }
   """
)
                        

// @LINE:18
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:17
def changeAnggotaData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.changeAnggotaData",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
class ReverseBooking {
    

// @LINE:26
def payment(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Booking.payment(id), HandlerDef(this, "controllers.Booking", "payment", Seq(classOf[Long]), "GET", """""", _prefix + """payment""")
)
                      

// @LINE:23
def order(id:Long, jumlah:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Booking.order(id, jumlah), HandlerDef(this, "controllers.Booking", "order", Seq(classOf[Long], classOf[Long]), "GET", """ Booking""", _prefix + """order""")
)
                      

// @LINE:24
def addOrderer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Booking.addOrderer(), HandlerDef(this, "controllers.Booking", "addOrderer", Seq(), "POST", """""", _prefix + """ordererData""")
)
                      

// @LINE:25
def addPassenger(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Booking.addPassenger(), HandlerDef(this, "controllers.Booking", "addPassenger", Seq(), "POST", """""", _prefix + """passengerData""")
)
                      
    
}
                          

// @LINE:29
class ReverseAssets {
    

// @LINE:29
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this, "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:9
def activateAnggota(activation_code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.activateAnggota(activation_code), HandlerDef(this, "controllers.Application", "activateAnggota", Seq(classOf[String]), "GET", """""", _prefix + """activate""")
)
                      

// @LINE:14
def changePass(code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.changePass(code), HandlerDef(this, "controllers.Application", "changePass", Seq(classOf[String]), "GET", """""", _prefix + """change_pass""")
)
                      

// @LINE:11
def doLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doLogin(), HandlerDef(this, "controllers.Application", "doLogin", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:20
def askRefund(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.askRefund(), HandlerDef(this, "controllers.Application", "askRefund", Seq(), "POST", """""", _prefix + """askRefund""")
)
                      

// @LINE:19
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:15
def doChangePass(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doChangePass(), HandlerDef(this, "controllers.Application", "doChangePass", Seq(), "POST", """""", _prefix + """change_pass""")
)
                      

// @LINE:7
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:13
def sendChangePass(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.sendChangePass(), HandlerDef(this, "controllers.Application", "sendChangePass", Seq(), "POST", """""", _prefix + """forgot_pass""")
)
                      

// @LINE:8
def newAnggota(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newAnggota(), HandlerDef(this, "controllers.Application", "newAnggota", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:12
def forgotPass(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.forgotPass(), HandlerDef(this, "controllers.Application", "forgotPass", Seq(), "GET", """""", _prefix + """forgot_pass""")
)
                      

// @LINE:18
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.search(), HandlerDef(this, "controllers.Application", "search", Seq(), "GET", """""", _prefix + """search""")
)
                      

// @LINE:17
def changeAnggotaData(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.changeAnggotaData(), HandlerDef(this, "controllers.Application", "changeAnggotaData", Seq(), "POST", """""", _prefix + """profile""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:10
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    