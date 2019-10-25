package day03;

import java.lang.reflect.Array;

/**
 * @author 海绵宝宝
 * @create 2019- 08- 25 11:04
 **/
public class 翻牌 {

    public static void main(String[] args) {
        boolean[]arr = new boolean[101];

        for (int i = 2; i <=100 ; i++) {
            for (int k = i;k<=100;k+=i)

                arr[k]=!arr[k];
        }
        for (int i = 1; i < 101; i++) {
            if (!arr[i]){
                System.out.println(i);
            }
        }


    }
}
