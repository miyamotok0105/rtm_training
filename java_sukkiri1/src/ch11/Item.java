package ch11;

public class Item {

    //デフォルトコンストラクタ：引数なしのコンストラクタ
    //引数ありのコンストラクタを用意した時は、引数なしのコンストラクタは用意されない。
    //このことによりsuper()はsuper("")を用意しないとコンパイルエラー。
//    public Item(){
//        System.out.println("引数０個のコンストラクタ");
//    }

    public Item(String name){
        System.out.println("引数１個のコンストラクタ");
    }

}
