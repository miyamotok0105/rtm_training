package ch11;

//extendsで継承できてる。
public class HyperHero extends Hero {
//親クラスを複数選択できない。
//public class HyperHero extends Hero, Hero2 {
//ちなみにfinalをfinal classやfinal void method1などにすると継承不可能。

    //superクラスで追加
    private boolean flying;

    //コンストラクタも省略されてる。継承してるとsuper()も省略されてる。
    public HyperHero() {
        //継承してるのであれば、勝手にスーパークラスコンストラクタが呼ばれてる。
        super();
        System.out.println("hyper heroコンストラクタ！");
    }

    public void fly() {
        this.flying = true;
        System.out.println("fly!!");
    }

    public void land() {
        this.flying = false;
        System.out.println("land!!");
    }

    //スーパークラスのメソッドがprivateなのでオーバーライドできない
//    private void die() {
//        System.out.println("オーバーライドしたdie");
//    }

    public void attack() {
        System.out.println("オーバーライドしたattack");
        //親クラスの処理を呼び出しするにはsuper
        super.attack();
    }

}
