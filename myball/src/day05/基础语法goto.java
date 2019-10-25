package day05;

/**
 * @author 海绵宝宝
 * @create 2019- 09- 16 22:41
 **/
public class 基础语法goto {
    public static void main(String[] args) {
        outer:for (int i=101;i<150;i++){
            for (int j =2;j<i/2;j++){
                if (i%j==0)
                    continue outer;
            }
            System.out.println(i+" ");
        }
    }
}
//从内循环跳转到外循环

