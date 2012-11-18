package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("test !"));
  }
  
  public static Result exemple() {
	  String msg = "Hello Word !"; 
	  return ok(test.render(msg));
  }
  
}