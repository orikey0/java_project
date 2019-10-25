package day03;

import java.util.concurrent.CountDownLatch;

/**
 * @author 海绵宝宝
 * @create 2019- 08- 25 11:35
 **/
public class 切分木棒 {
    public  static  int cutbar(int m,int n){
        int count=0;
        int cur =1;
        while (cur<=n){
            cur+= cur<m ? cur : m;
            count+=1;
        }
        return  count;
    }
    public static void main(String[] args) {
        System.out.println(cutbar(5,100));
    }
}
