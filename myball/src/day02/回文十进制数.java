package day02;

import com.sun.jdi.PathSearchingVirtualMachine;

import javax.swing.*;

/**
 * @author 海绵宝宝
 * @create 2019- 08- 24 20:57
 **/
public class 回文十进制数 {
    public  static  String reverse_1(String ss){
        return  new StringBuffer(ss).reverse().toString();
    }
    public static void main(String[] args) {
        Integer k =581;
        boolean flag = false;
        while (!flag){
            k++;
            if (
                    k.toString().equals(reverse_1(k.toString()))
                    && k.toOctalString(k).equals(reverse_1(k.toOctalString(k)))
                    && k.toBinaryString(k).equals(reverse_1(k.toBinaryString(k)))
            ){
                flag=true;

                System.out.println(k);
                break;
            }

        }
    }
}
