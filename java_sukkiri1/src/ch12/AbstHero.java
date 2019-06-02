package ch12;

//抽象クラスの特徴
//newできない
//継承させて使う
//オーバーライドを強制する
public abstract class AbstHero {
    String name;
    int hp;
    public void run() {
        System.out.println("run!");
    }

    public abstract void attack(String attackName);
}
