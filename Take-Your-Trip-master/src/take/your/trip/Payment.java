/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package take.your.trip;

/**
 *
 * @author Prach
 */
import java.awt.Color;
//import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Payment extends JFrame{
    
    public Payment(){
        
        setLayout(null);
        setBounds(250, 50, 800, 600);
        
        JLabel label=new JLabel("Pay using Paytm");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(225, 20, 350, 45);
        add(label);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/icons/paytm.jpeg"));
        Image i8 = i7.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(0, 150, 800, 600);
        add(l4);
        
        JButton pay = new JButton("Pay");
        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //new Payment().setVisible(false);
                new Paytm().setVisible(true);
                setVisible(false);
            }
        });
        pay.setBounds(280, 100, 80, 40);
        add(pay);
    
        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(430, 100, 80, 40);
        add(back);
        
        ImageIcon bg = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/icons/tbg2.jpg"));
        Image bgi = bg.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon bgi2 = new ImageIcon(bgi);

        JLabel lbg = new JLabel(bgi2);
        lbg.setBounds(0, 0, 800, 500);
        add(lbg);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }

    public static void main(String[] args){
        new Payment().setVisible(true);
    }
    
}