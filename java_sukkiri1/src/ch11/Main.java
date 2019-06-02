package ch11;

public class Main {
    public static void main(String[] args) {
        //親クラス呼び出し
        HyperHero hh = new HyperHero();
        hh.attack();
        hh.fly();

        hh.attack();
    }
}
