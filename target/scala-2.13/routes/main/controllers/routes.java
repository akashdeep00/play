// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akash/Desktop/playrest/conf/routes
// @DATE:Fri Apr 02 11:20:30 IST 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseV2PersonController V2PersonController = new controllers.ReverseV2PersonController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePersonController PersonController = new controllers.ReversePersonController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAddressController AddressController = new controllers.ReverseAddressController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseV2PersonController V2PersonController = new controllers.javascript.ReverseV2PersonController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePersonController PersonController = new controllers.javascript.ReversePersonController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAddressController AddressController = new controllers.javascript.ReverseAddressController(RoutesPrefix.byNamePrefix());
  }

}
