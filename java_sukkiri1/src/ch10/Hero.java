package ch10;

//カプセル化の章

//

public class Hero {
    private String name;

    //hpはプライベート変数にする
    private int hp;

    int money;
    static int money2;
    Sword sword;

    Hero() {
//        this(100);
        this.name = "aaa";
    }

    Hero(int hp) {
        this.hp = hp;
    }

    //getter
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnull");
        }
        if (name.length() <= 1){
            throw new IllegalArgumentException("名前が短い");
        }
        if (name.length() >= 8){
            throw new IllegalArgumentException("名前が長い");
        }
        this.name = name;
    }

    //プライベートメソッド
    //Heroクラスからのみ呼び出したい。
    //他のクラスから呼び出したくない。
    private void die() {
        System.out.println(this.name + "は死んだ");
        System.out.println("GAME OVER!!");
    }
    //デフォルトはpackeage private
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は100眠って回復");
    }

    //attackはどのようなクラスからでも呼び出したい。
    public void attack() {
        System.out.println(this.name +"は攻撃した！");
        System.out.println("敵に5ポイントのダメージを与えた");
    }

    static void setRandomMoney() {
        Hero.money2 = (int) (Math.random() * 1000);
    }
}
