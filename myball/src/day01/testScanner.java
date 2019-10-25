package day01;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author 海绵宝宝
 * @create 2019- 08- 02 16:42
 **/
public class testScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入名字");
        String name = in.nextLine();
        System.out.println(name);
        System.out.println("请输入年龄");
        int age = in.nextInt();
        System.out.println("已经来的时间"+365*age);
        System.out.println("将要离去的时间"+365*(92-age));
    }

}
