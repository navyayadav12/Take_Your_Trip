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
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class Login extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1, b2, b3;

    public Login() {

        setBackground(new Color(255, 25, 20));
        setBounds(230, 100, 800, 500);

        panel = new JPanel();
        setContentPane(panel);
        
       
       // panel.setBackground(new Color(135,206,235));
        panel.setLayout(null);

        
        

        JLabel l1 = new JLabel("Username : ");
        l1.setBounds(124, 89, 95, 24);
        panel.add(l1);

        JLabel l2 = new JLabel("Password : ");
        l2.setBounds(124, 124, 95, 24);
        panel.add(l2);

        textField = new JTextField();
        textField.setBounds(210, 93, 157, 20);
        panel.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(210, 128, 157, 20);
        panel.add(passwordField);

        JLabel l3 = new JLabel("");
        l3.setBounds(377, 79, 46, 34);
        panel.add(l3);

        JLabel l4 = new JLabel("");
        l4.setBounds(377, 124, 46, 34);
        panel.add(l3);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/icons_tyt/icons_tyt/login.jpeg"));
        Image i1 = c1.getImage().getScaledInstance(250, 350, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        JLabel l6 = new JLabel(i2);
        l6.setBounds(430, 40, 400, 263);
        add(l6);

        b1 = new JButton("Login");
        b1.addActionListener(this);

        b1.setForeground(new Color(46, 139, 87));
        b1.setBackground(new Color(176, 224, 230));
        b1.setBounds(149, 181, 113, 25);
        panel.add(b1);

        b2 = new JButton("SignUp");
        b2.addActionListener(this);

        b2.setForeground(new Color(139, 69, 19));
        b2.setBackground(new Color(255, 235, 205));
        b2.setBounds(289, 181, 113, 25);
        panel.add(b2);

        b3 = new JButton("Forgot Password");
        b3.addActionListener(this);

        b3.setForeground(new Color(205, 92, 92));
        b3.setBackground(new Color(253, 245, 230));
        b3.setBounds(199, 231, 179, 25);
        panel.add(b3);

        JLabel l5 = new JLabel("Trouble in Login?");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l5.setForeground(new Color(255, 0, 0));
        l5.setBounds(70, 235, 150, 20);
        panel.add(l5);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(135, 206, 235));
        panel2.setBounds(24, 40, 434, 263);
        panel.add(panel2);
        
        ImageIcon bg = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/icons/tbg2.jpg"));
        Image bgi = bg.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon bgi2 = new ImageIcon(bgi);

        JLabel lbg = new JLabel(bgi2);
        lbg.setBounds(0, 0, 800, 500);
        panel.add(lbg);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) { // login button
            Boolean status = false;
            try {
                Conn con = new Conn();
                String sql = "select * from account where username=? and password=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, textField.getText());
                st.setString(2, passwordField.getText());

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    this.setVisible(false);
                    new Loading(textField.getText()).setVisible(true);
                } else
                    JOptionPane.showMessageDialog(null, "Invalid Login or Password!");

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (ae.getSource() == b2) {// signup button
            setVisible(false);
            Signup su = new Signup();
            su.setVisible(true);
        }
        if (ae.getSource() == b3) {// forgot button
            setVisible(false);
            ForgotPassword forgot = new ForgotPassword();
            forgot.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

}

