package day02;

import jdk.jshell.EvalException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

/**
 * @author 海绵宝宝
 * @create 2019- 08- 24 21:35
 **/
//回文题目
public class 数列的四则运算 {
    public static void main(String[] args) throws ScriptException {
        String []arr = new String[]{"+","-","*","/"};
        for (int i = 1000; i <= 9999; i++) {
            Integer kk = i;
            for (int j = 0; j < arr.length; j++) {
                for (int l = 0; l < arr.length; l++) {
                    for (int m = 0; m < arr.length; m++) {
                        char[] cc = kk.toString(kk).toCharArray();
                        String ss = cc[0]+arr[j]+cc[1]+arr[l]+cc[2]+arr[m]+cc[3];

                        ScriptEngineManager manager = new ScriptEngineManager();
                        ScriptEngine engine = manager.getEngineByName("js");
                        try {
                            int result = (int)engine.eval(ss);
                            if (result==i )
                            System.out.println(result);
                        }
                        catch (Exception e){
                            continue;
                        }

                    }
                }
            }
        }
    }
}
