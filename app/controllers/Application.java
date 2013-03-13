package controllers;

import play.*;
import play.mvc.*;
import play.data.*;

import views.html.*;



public class Application extends Controller {
    
    //Calculateクラスのためのフォーム作成
    static Form<Calculate> calcForm = form(Calculate.class);


    public static Result index() {
    return redirect(routes.Application.first());
    }
    
    //最初のページをレンダリング
    public static Result first(){
        return TODO;
        /*views.html.index.render(Calculate.ans() ,Calculate.function() , calcForm );*/
    }
    
    //計算式を入力
    public static Result calc(){
        return TODO;
    }
    
   

    
  
}