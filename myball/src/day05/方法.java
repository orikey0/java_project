package day05;

import java.io.PrintStream;

/**
 * @author 海绵宝宝
 * @create 2019- 09- 16 22:51
 **/
//方法就是一段用来完成特定功能的代码片段，类似于其他语言的函数
public class 方法 {
    public static void main(String[] args) {
        方法 testMethod = new 方法();
        testMethod.add(3, 4);
    }
    void printsxt(){
        System.out.println("hello,it's me.");
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
}
