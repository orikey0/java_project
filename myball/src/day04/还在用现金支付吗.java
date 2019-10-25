package day04;

import javax.management.openmbean.OpenMBeanConstructorInfoSupport;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 海绵宝宝
 * @create 2019- 08- 25 16:41
 **/
public class 还在用现金支付吗 {

    public static int shift(int[]coins){
        int[] ss = new int[coins.length-1];
        System.arraycopy(coins, 1, ss, 0, ss.length);
        System.out.println(Arrays.toString(ss));
        return coins[0];
    }
    public static final int cnt=0;

    public static void func(int target,int[]coins,int usable) {
        int coin = shift(coins);
    }
    public static void main(String[] args) {
        int[]arr= new int[]{10,50 ,100,500};

    }
}
//这道题目不是很会下次再来挑战