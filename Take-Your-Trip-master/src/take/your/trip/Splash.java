/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package take.your.trip;

/**
 *
 * @author Prach
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash {
    public static void main(String[] args) {
        SplashFrame f1 = new SplashFrame();
        f1.setVisible(true);
        int i;
        int x = 1;
        for (i = 2; i <= 600; i += 10, x += 7) {
            f1.setLocation(600 - ((i + x) / 2), 350 - (i / 2));
            f1.setSize(i + x, i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }

    }
}

class SplashFrame extends JFrame implements Runnable {
    Thread t1;

    SplashFrame() {
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/icons/splash.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1030, 750, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        JLabel l1 = new JLabel(i2);
        add(l1);
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }

    public void run() {// abstract method of Runnable interface
        try {
            Thread.sleep(3000);
            this.setVisible(false);

            Login l = new Login();
            l.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

