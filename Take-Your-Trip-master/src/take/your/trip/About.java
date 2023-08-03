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

import java.awt.Font;
import javax.swing.JFrame;
//import javax.swing.border.Border;

public class About extends JFrame implements ActionListener {

//    JButton b1;
//    JLabel l1;
//    Font f, f1, f2;
//    TextArea t1;
    String s;

    public About() {

        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(175, 450, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        //f.setBackground(Color.BLUE);
        setFont(f);

        s = "                             About Projects          \n  "
                +"\nThis project is developed by Avnish Kumar,Ajay Kumar Jakhar,Navya Yadav"
                + "\nThe objective of the Travel and Tourism Management System"
                + "project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
                ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setBackground(new Color(135,206,235));
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

//        Container contentPane = this.getContentPane();
//        t1 = new TextArea();

//        JLabel l1 = new JLabel("About Project");
//        add(l1);
//        l1.setBounds(170, 10, 180, 80);
//        l1.setForeground(Color.red);

//        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
//        l1.setFont(f2);

        setBounds(250, 50, 500, 550);
                ImageIcon bg = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/icons/tbg2.jpg"));
        Image bgi = bg.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon bgi2 = new ImageIcon(bgi);

        JLabel lbg = new JLabel(bgi2);
        lbg.setBounds(0, 0, 800, 500);
        add(lbg);
        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}
