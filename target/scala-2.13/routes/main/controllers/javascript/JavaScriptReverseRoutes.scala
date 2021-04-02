// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akash/Desktop/playrest/conf/routes
// @DATE:Fri Apr 02 11:20:30 IST 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:3
package controllers.javascript {

  // @LINE:14
  class ReverseV2PersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.V2PersonController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "v2/persons"})
        }
      """
    )
  
  }

  // @LINE:3
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.remove",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "person/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:3
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persons"})
        }
      """
    )
  
    // @LINE:4
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
        }
      """
    )
  
    // @LINE:5
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "person/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAddressController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.add",
      """
        function(id0,kind1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "person/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/address/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("kind", kind1))})
        }
      """
    )
  
    // @LINE:11
    def remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.remove",
      """
        function(id0,kind1) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "person/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/address/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("kind", kind1))})
        }
      """
    )
  
    // @LINE:10
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.update",
      """
        function(id0,kind1) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "person/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/address/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("kind", kind1))})
        }
      """
    )
  
  }


}
