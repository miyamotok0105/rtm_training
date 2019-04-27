package book1_ch04_6;


//javaでの

//論理型：boolean
//文字型

public class Main {
//    String str;
    public static void main(String[] args) {
        Sample sample1 = new Sample();
        Sample sample2 = sample1;
        sample2.name = "name2!";

        System.out.println(sample2.name);
    }
}
