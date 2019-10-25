package day01; /**
 * @author 海绵宝宝
 * @create 2019- 08- 02 10:46
 **/

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
    Image ball = Toolkit.getDefaultToolkit().getImage("Images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("Images/desk.jpg");

    double x =100;
    double y = 100;
    boolean right = true;
    double degree = 3.14/3;

    public void paint(@org.jetbrains.annotations.NotNull Graphics g){
        System.out.println("first");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball,(int) x,(int)y, null);
        if (right)x = x+10;
        else x = x-10;
        if (x>856-40-30) {
            right = false;
        }
        if (x<40)right = true;
    }

    void launchFrame(){
        setSize(865,500);
        setLocation(50,50);
        setVisible(true);

        while (true){
            repaint();
            try {
                Thread.sleep(40);
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }


    public static void main(String[] args) {
        System.out.println("hello world");
        BallGame game  = new BallGame();
        game.launchFrame();

    }
}
