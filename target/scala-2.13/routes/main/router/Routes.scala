// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akash/Desktop/playrest/conf/routes
// @DATE:Fri Apr 02 11:20:30 IST 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  v1_post_PostRouter_0: v1.post.PostRouter,
  // @LINE:3
  PersonController_1: controllers.PersonController,
  // @LINE:9
  AddressController_2: controllers.AddressController,
  // @LINE:14
  V2PersonController_0: controllers.V2PersonController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    v1_post_PostRouter_0: v1.post.PostRouter,
    // @LINE:3
    PersonController_1: controllers.PersonController,
    // @LINE:9
    AddressController_2: controllers.AddressController,
    // @LINE:14
    V2PersonController_0: controllers.V2PersonController
  ) = this(errorHandler, v1_post_PostRouter_0, PersonController_1, AddressController_2, V2PersonController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, v1_post_PostRouter_0, PersonController_1, AddressController_2, V2PersonController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    prefixed_v1_post_PostRouter_0_0.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """persons""", """controllers.PersonController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person""", """controllers.PersonController.create"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/""" + "$" + """id<[^/]+>""", """controllers.PersonController.update(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/""" + "$" + """id<[^/]+>""", """controllers.PersonController.remove(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/""" + "$" + """id<[^/]+>/address/""" + "$" + """kind<[^/]+>""", """controllers.AddressController.add(id:String, kind:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/""" + "$" + """id<[^/]+>/address/""" + "$" + """kind<[^/]+>""", """controllers.AddressController.update(id:String, kind:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/""" + "$" + """id<[^/]+>/address/""" + "$" + """kind<[^/]+>""", """controllers.AddressController.remove(id:String, kind:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/persons""", """controllers.V2PersonController.list"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] val prefixed_v1_post_PostRouter_0_0 = Include(v1_post_PostRouter_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v1/posts"))

  // @LINE:3
  private[this] lazy val controllers_PersonController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persons")))
  )
  private[this] lazy val controllers_PersonController_list1_invoker = createInvoker(
    PersonController_1.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "list",
      Nil,
      "GET",
      this.prefix + """persons""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_PersonController_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person")))
  )
  private[this] lazy val controllers_PersonController_create2_invoker = createInvoker(
    PersonController_1.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "create",
      Nil,
      "POST",
      this.prefix + """person""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_PersonController_update3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonController_update3_invoker = createInvoker(
    PersonController_1.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """person/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_PersonController_remove4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonController_remove4_invoker = createInvoker(
    PersonController_1.remove(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "remove",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """person/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_AddressController_add5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/"), DynamicPart("id", """[^/]+""",true), StaticPart("/address/"), DynamicPart("kind", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_add5_invoker = createInvoker(
    AddressController_2.add(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "add",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """person/""" + "$" + """id<[^/]+>/address/""" + "$" + """kind<[^/]+>""",
      """ Addresses""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AddressController_update6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/"), DynamicPart("id", """[^/]+""",true), StaticPart("/address/"), DynamicPart("kind", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_update6_invoker = createInvoker(
    AddressController_2.update(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "update",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """person/""" + "$" + """id<[^/]+>/address/""" + "$" + """kind<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AddressController_remove7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/"), DynamicPart("id", """[^/]+""",true), StaticPart("/address/"), DynamicPart("kind", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_remove7_invoker = createInvoker(
    AddressController_2.remove(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "remove",
      Seq(classOf[String], classOf[String]),
      "DELETE",
      this.prefix + """person/""" + "$" + """id<[^/]+>/address/""" + "$" + """kind<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_V2PersonController_list8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/persons")))
  )
  private[this] lazy val controllers_V2PersonController_list8_invoker = createInvoker(
    V2PersonController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.V2PersonController",
      "list",
      Nil,
      "GET",
      this.prefix + """v2/persons""",
      """ Persons V2""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case prefixed_v1_post_PostRouter_0_0(handler) => handler
  
    // @LINE:3
    case controllers_PersonController_list1_route(params@_) =>
      call { 
        controllers_PersonController_list1_invoker.call(PersonController_1.list)
      }
  
    // @LINE:4
    case controllers_PersonController_create2_route(params@_) =>
      call { 
        controllers_PersonController_create2_invoker.call(PersonController_1.create)
      }
  
    // @LINE:5
    case controllers_PersonController_update3_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_PersonController_update3_invoker.call(PersonController_1.update(id))
      }
  
    // @LINE:6
    case controllers_PersonController_remove4_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_PersonController_remove4_invoker.call(PersonController_1.remove(id))
      }
  
    // @LINE:9
    case controllers_AddressController_add5_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("kind", None)) { (id, kind) =>
        controllers_AddressController_add5_invoker.call(AddressController_2.add(id, kind))
      }
  
    // @LINE:10
    case controllers_AddressController_update6_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("kind", None)) { (id, kind) =>
        controllers_AddressController_update6_invoker.call(AddressController_2.update(id, kind))
      }
  
    // @LINE:11
    case controllers_AddressController_remove7_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("kind", None)) { (id, kind) =>
        controllers_AddressController_remove7_invoker.call(AddressController_2.remove(id, kind))
      }
  
    // @LINE:14
    case controllers_V2PersonController_list8_route(params@_) =>
      call { 
        controllers_V2PersonController_list8_invoker.call(V2PersonController_0.list)
      }
  }
}
