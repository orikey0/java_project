package day02;

/**
 * @author 海绵宝宝
 * @create 2019- 08- 24 21:19
 **/
public class test {
    public  static  String reverse_1(String ss){
        return  new StringBuffer(ss).reverse().toString();
    }
    public static void main(String[] args) {
//        Integer k = 585;
//        System.out.println(k.toString().getClass());
//        System.out.println(reverse_1(k.toString(k)).getClass());
//        System.out.println(k.toString(k).equals(reverse_1(k.toString(k))));
          Integer k = 1234;
          char[]ss = k.toString().toCharArray();
          System.out.println(ss[0]);
    }
}
