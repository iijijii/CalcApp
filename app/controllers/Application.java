package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import models.*;

import views.html.*;

public class Application extends Controller {
	static Form<Calculate> calcForm = form(Calculate.class);

	public static Result index() {
		return ok(views.html.index.render(calcForm));
	}

	public static Result calculate() {
		Form<Calculate> filledForm = calcForm.bindFromRequest();
		String func = filledForm.get().function;
		String ans = Calculator1.process(Calculator1.parse(func));
		return ok(views.html.record.render(calcForm, func, ans));
	}
}