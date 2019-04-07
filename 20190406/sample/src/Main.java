package System.out;
import java.util.Arrays;
import java.math.*;


public class Main {

    public static void main(String[] args) {
//        sub1();
//        sub2();
//        sub3();
//        sub4();
//        sub6();
        sub7();
    }

    private static void sub1() {
        //変数
        int x = 10;
        int y = 20;
        int answer = x+y;
        System.out.println(answer);
    }

    private static void sub2() {
        char[] carray = new char[3];
        carray[0] = 'い';
        carray[1] = 'ろ';
        carray[2] = 'は';

        System.out.println(carray[0]);
        System.out.println(carray[1]);
        System.out.println(carray[2]);

    }

    //列挙型
    enum Direction {
        EAST, WEST, SOUTH, NORTH
    }

    private static void sub3() {

        Direction d = Direction.EAST;
        if (d == Direction.WEST) {
            System.out.println("向いてる方向はWEST");
        }
        if (d == Direction.EAST) {
            System.out.println("向いてる方向はEAST");
        }
        System.out.println("向いてる方向:"+d);

    }

    private static void sub4() {
        int[] arrayDefaut = {1,2,3,4};

        int arrayLength = arrayDefaut.length;
        System.out.println(arrayLength);
    }

    private static void sub5() {
        final double PI = 3.14;
    }

    private static void sub6() {
        int x = 7;
        int y = 2;
        System.out.println(x/y);
        double x2 = 7;
        double y2 = 2;
        System.out.println(x2/y2);

    }

    private static void sub7() {
        String youbi = "水曜";
        if(youbi.equals("金曜")){
            System.out.println("金");
        } else if(youbi.equals("土曜")) {
            System.out.println("土");
        }
    }

}

class Ranking {
    public static void main(String[] args) {
        int rank = Integer.parseInt("1");



    }
}