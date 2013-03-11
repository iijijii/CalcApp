package controllers;

import play.*;
import play.mvc.*;
import play.data.*;

import views.html.*;


public class Application extends Controller {
    
    //Calculateクラスのためのフォーム作成
    static Form<Calculate> calcForm = form(Calculate.class);


    //レンダリング
    public static Result index() {
    return redirect(routes.Application.calculate());
    }
    
    //
    public static Result calculate(){
        return views.html.index.render(Calculate.all() ,calcForm );
    }
    
    //計算結果の表示
    public static Result computation(){
        Form<Calculate> filledForm = calcForm.bindFromRequest();
        //エラーの場合→メッセージを フォームの真下に表示。フォームの入力内容は計算ボタン押下前のものを維持
        if(filledForm.hasErrors()) {
            //calculate.error()使う
            return badRequest(
                              );
        } else {
            Calculate.create(filledForm.get());
            //Calculate.calculate(filledForm.get())使う
            return redirect(routes.Application.calculate());
        }
    }

    
  
}