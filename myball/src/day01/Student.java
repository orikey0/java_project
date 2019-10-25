package day01;

import org.jetbrains.annotations.Contract;

/**
 * @author 海绵宝宝
 * @create 2019- 08- 02 17:14
 **/
public class Student {
    int id ;
    String name;
    int age;
    Computer com ;

    void study(){
        System.out.println("正在学习"+com.brand);
    }
    void play(){
        System.out.println("我在玩游戏");
    }

    Student(){

    }
    public static void main(String[] args) {
        Student student = new Student();
        student.play();
        student.id = 1001;
        student.name = "李厚华";
        student.age = 18;

        Computer c1 = new Computer();
        c1.brand = "联想";
        student.com = c1;
        student.study();
    }
}

class Computer{
    String brand;

}

