package ch08;

public class Hero {
    String name;
    int hp;

    void sleep() {
        this.hp = 100;
        System.out.println(this.name);
    }
    void sit(int sec){
        this.hp += sec;
        System.out.println(this.name + "は" + sec + "秒座った");
        System.out.println("HPが"+sec+"ポイント回復した。");
    }
    void slip(){
        this.hp -= 5;
        System.out.println(this.name +"は転んだ");
        System.out.println("5のダメージ");
    }
    void run(){
        System.out.println(this.name +"は逃げ出した");
        System.out.println("GAME OVER");
        System.out.println("最終HPは"+this.hp + "でした。");
    }
}