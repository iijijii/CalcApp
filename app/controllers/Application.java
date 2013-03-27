package controllers;

import java.util.Set;

import play.*;
import play.mvc.*;
import play.data.*;
import models.*;

import views.html.*;

public class Application extends Controller {
	static Form<Calculate> calcForm = form(Calculate.class);

	public static Result index() {
		// TODO
		// 全ての計算結果を削除する
		return ok(views.html.index.render(calcForm));
	}

	public static Result calculate() {
		Form<Calculate> filledForm = calcForm.bindFromRequest();
		String func = filledForm.get().function;
		if (func == null || func.equals("")) {
			return ok(views.html.err.render(calcForm, "入力がありません", func));
		} else {
			String ans = Calculator1.process(Calculator1.parse(func));
			if (ans == "エラー（０で割れません）" || ans == "エラー（逆ポーランド記法の数式を入力してください。）"
					|| ans == "エラー（数字か演算子（+,-,*,/）かexitを入力してください）") {
				return ok(views.html.err.render(calcForm, ans, func));
			} else {
				return ok(views.html.record.render(calcForm, ans, func));
			}
		}
	}

}