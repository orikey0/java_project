package day04;

/**
 * @author 海绵宝宝
 * @create 2019- 08- 26 11:00
 **/
public class 考拉兹猜想 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 2; i <=10000; i+=2) {
            int k =i;
            int kk=k*3+1;
            while (true){
                if (kk==1)break;
                if (kk==k){
                    cnt+=1;
                    break;
                }
                kk= kk%2==0 ? kk/2:kk*3+1;

            }
        }
        System.out.println(cnt);
    }
}
