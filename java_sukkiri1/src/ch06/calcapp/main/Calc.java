package ch06.calcapp.main;

//importすることでFQCNのフルを書かなくて良い。
import ch06.calcapp.logics.CalcLogic;

public class Calc {

    public static void main() {
        int a = 10; int b = 2;
        //CalcLogic.を入れて呼び出す。
        int total = CalcLogic.tasu(a, b);
        int delta = CalcLogic.hiku(a, b);
        System.out.println(total +" "+ delta);

    }

}

