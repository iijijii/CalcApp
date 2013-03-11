package models;

import java.util.*;

import javax.persistence.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;


public class Calculate extends Model{
    
    public static List<Calculate> all() {
        return new ArrayList<Calculate>();
      //配列を作る
    }
    
    public static void calculate(Calculate calc) {
        /*逆ポーランド記法電卓プログラムを引っ張ってくる
        （フォームに入力されたものを入力として計算し、計算結果を返す。（計算できる場合）*/
    }
    public static void error(){
        //計算できない場合    
    }
    
    public static void create(Calculate calc) {
        calc.save();
        //履歴
    }
    
}
