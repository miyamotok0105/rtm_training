package ch04;

public class Main {
    public static void main(String[] args) {
        //普通の書き方
        int sansu = 20;
        int kokugo = 30;
        int rika = 40;
        int sum = sansu + kokugo + rika;
        int avg = sum / 3;
        System.out.println("合計"+sum);
        System.out.println("平均"+avg);
        //配列
        int[] score = new int[3]; //3個の配列
        score[0] = sansu;
        score[1] = kokugo;
        score[2] = rika;
//        score[3] = 3; //indexのerror
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println("要素数は"+score.length);
        //省略記法
        int[] score2 = new int[] { 1, 2, 3 };
        int[] score3 = { 1, 2, 3 };
        //for文 その１
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        //for文 その２ 拡張for
        for (int val : score) {
            System.out.println(val);
        }
        //メモリー解放
        score = null;
        //多次元配列
        int[][] scores = new int[2][3];
        scores[0][0] = 40;
        scores[1][1] = 60;
        






    }
}
