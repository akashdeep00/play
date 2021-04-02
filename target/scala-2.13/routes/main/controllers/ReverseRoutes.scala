// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akash/Desktop/playrest/conf/routes
// @DATE:Fri Apr 02 11:20:30 IST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:3
package controllers {

  // @LINE:14
  class ReverseV2PersonController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "v2/persons")
    }
  
  }

  // @LINE:3
  class ReversePersonController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def remove(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "person/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:3
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "persons")
    }
  
    // @LINE:4
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "person")
    }
  
    // @LINE:5
    def update(id:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "person/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:9
  class ReverseAddressController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def add(id:String, kind:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "person/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/address/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("kind", kind)))
    }
  
    // @LINE:11
    def remove(id:String, kind:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "person/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/address/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("kind", kind)))
    }
  
    // @LINE:10
    def update(id:String, kind:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "person/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/address/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("kind", kind)))
    }
  
  }


}
