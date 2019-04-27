package ch10;

public class Main {
    public static void main(String[] args) {

        Hero h = new Hero();
        h.setName("勇者");
        h.setName("");
        King king = new King();
        king.talk(h);

    }
}
