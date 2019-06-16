package ch03;

public class Main {
    public static void main(String[] args) {

//        boolean tenki = true;
//
//        //if文
//        if (tenki == true) {
//            System.out.println("天気は良い!");
//        } else {
//            System.out.println("天気は悪い!");
//        }
//
//        //三項演算子
//        //(条件式) ? trueの場合 : falseの場合;
//        boolean tenki2 = (tenki == true) ? true : false;
//        System.out.println(tenki2);

        //switch


//        boolean counter = true;
//        int count = 0;
//        while (counter == true) {
//            System.out.println("■");
//            count++;
//            if (count >= 10) {
//                counter = false;
//            }
//        }


        for(int count1 = 0; count1 <= 2; count1++){
            for(int count2 = 0; count2 <= 5; count2++){
                System.out.println("■"+count1+count2);
            }
        }


    }
}
