package other00;

//import java.util.*;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Stream;
import java.util.stream.IntStream;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



public class Main {

    public static void main(String[] args) {
//        sub1();
//        sub3();

    }

    public static void sub1(){
        List<Person> list = new LinkedList<>();
        list.add(new Person("hoge", 18));
        list.add(new Person("piyo", 19));
        list.add(new Person("foo", 20));

        list.stream() // streamの取得
                .filter(o -> o.age == 18) // 中間操作
                .forEach(o -> System.out.println(o.name)); // 終端操作

        IntStream stream = IntStream.range(6, 10);
        stream.forEach(System.out::println);
    }

    public static void sub3(){
//        Car car = new Car();
//        System.out.println(car.move());
    }
    public static void sub4(){
//        Frame jf = new JFrame();
//        jf.setBounds( 300, 100, 500, 350 );
//        jf.setVisible( true );
//        jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//
//        JPanel jp = new JPanel();
//        jp.setBackground( Color.BLACK );
//        jf.add( jp );
    }
    //==============================
    //SuperClassを継承してSubClassを作る
    //親クラス
    public class SuperClass {
        public String label = "Super";

        public String getLabel() {
            return label;
        }
    }

    //子クラス
    public class SubClass extends SuperClass {
        public String label = "Sub";

        public String getLabel2() {
            return label;
        }

        public String getSuperLabel() {
            return super.label;
        }

        public String getThisLabel() {
            return this.label;
        }
    }
    //==============================
    //二重継承
    public class obj {
        public String label = "Super";
    }
    public class Norimono extends obj {
        public String label = "norimono";
        public String move(){
            return "run";
        }
    }
    public class Car extends Norimono {
        public String move(){
            return super.label;
        }
    }


}
