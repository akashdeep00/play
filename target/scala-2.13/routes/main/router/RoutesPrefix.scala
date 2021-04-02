// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akash/Desktop/playrest/conf/routes
// @DATE:Fri Apr 02 11:20:30 IST 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
