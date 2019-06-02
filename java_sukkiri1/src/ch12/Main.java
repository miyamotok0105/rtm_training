package ch12;

public class Main {
    public static void main(String[] args) {

        //継承はIS Aの関係
        //犬は動物だ。
        //犬 IS 動物

        //抽象クラスの継承もIS Aの関係だが、３つの特徴を伴う
        //newできない
        //継承させて使う
        //オーバーライドを強制する
        //この３つがある理由は開発現場では前もって処理を定義しておくことが頻繁にあるからだ。

        //インターフェースはCAN DOの関係。
        //メソッドをインターフェースに書いて置いて、実際の処理は子クラスに実装する。

        Hero hero = new Hero();
        hero.attack("heyhey");
    }
}
