package ch09;

public class Hero {
    String name;
    int hp;
    //静的なフィールドの説明
    int money1;
    static int money2;

    Sword sword;

    Hero() {
        //thisで引数付きのコンスタトラクタを呼び出してる
        //javaではコンストラクは直接呼び出せない。
        //thisは専用文法
        this(100);

//        System.out.println("new したよ");
//        this.hp = 100;
    }

    Hero(int hp) {
        System.out.println("引数ありでnew したよ");
        this.hp = hp;
        this.money1 = 100;
    }

    void attack() {
        System.out.println(this.name +"は攻撃した！");
        System.out.println("敵に5ポイントのダメージを与えた");
    }

    //staticメソッドではstatic変数使ってください。
    //普通に変数は使えません。
    static void setRandomMoney() {
        //(int)はキャスト。
        //(String)

        Hero.money2 = (int) (Math.random() * 1000);

    }
}
