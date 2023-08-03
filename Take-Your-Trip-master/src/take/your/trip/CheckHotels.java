/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package take.your.trip;

/**
 *
 * @author Prach
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class CheckHotels extends JFrame implements Runnable {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19;
    JLabel caption;
    Thread th;

    public void run() {
        try {

            l2.setVisible(true);
            caption.setText("Dondrub Homestay & Resort,Tawang");
            l2.add(caption);
            Thread.sleep(2800);
            l2.setVisible(false);
            l3.setVisible(true);
            caption.setText("Tesco The Resort");
            l3.add(caption);
            l3.setVisible(true);
            Thread.sleep(2800);
            l3.setVisible(false);
            l4.setVisible(true);
            caption.setText("Marasa Sarovar Premium");
            l4.add(caption);
            Thread.sleep(2800);
            l4.setVisible(false);
            l5.setVisible(true);
            caption.setText("Firn Gir Forest Resort");
            l5.add(caption);
            Thread.sleep(2800);
            l5.setVisible(false);
            l6.setVisible(true);
            caption.setText("Himalay Heights");
            l6.add(caption);
            Thread.sleep(2800);
            l6.setVisible(false);
            l7.setVisible(true);
            caption.setText("Pine Spring");
            l7.add(caption);
            Thread.sleep(2800);
            l7.setVisible(false);
            l8.setVisible(true);
            caption.setText("Valley Resort");//manipur
            l8.add(caption);
            Thread.sleep(2800);
            l8.setVisible(false);
            l9.setVisible(true);
            caption.setText("Royal Inn");
            l9.add(caption);
            Thread.sleep(2800);
            l9.setVisible(false);
            l10.setVisible(true);
            caption.setText("Hotel Pine");
            l10.add(caption);
            Thread.sleep(2800);
            l10.setVisible(false);
            l11.setVisible(true);
            caption.setText("Lemon Tree Hotel");
            l11.add(caption);
            Thread.sleep(2800);
            l11.setVisible(false);
            l12.setVisible(true);
            caption.setText("Welcome Heritage Hotel");
            l12.add(caption);
            Thread.sleep(2800);
            l12.setVisible(false);
            
            l13.setVisible(true);
            caption.setText("Rufina Hotel");
            l13.add(caption);
            Thread.sleep(2800);
            l13.setVisible(false);
            
            l14.setVisible(true);
            caption.setText("The Naini Retreat");
            l14.add(caption);
            Thread.sleep(2800);
            l14.setVisible(false);
            
            l15.setVisible(true);
            caption.setText("IHCL SeleQtions");
            l15.add(caption);
            Thread.sleep(2800);
            l15.setVisible(false);
            
            l16.setVisible(true);
            caption.setText("Holiday Inn Kokata");
            l16.add(caption);
            Thread.sleep(2800);
            l16.setVisible(false);
            
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public CheckHotels() {

        setBounds(150, 0, 900, 700);
        getContentPane().setBackground(new Color(220, 250, 250));
        
        th = new Thread(this);
    
        caption = new JLabel();
        caption.setBounds(50, 550, 1000, 70);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("Tahoma", Font.PLAIN, 40));
        add(caption);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Tawang valley_h.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 700);
        add(l2);

        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/icons/hotel2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i4);
        l3.setBounds(0, 0, 900, 700);
        add(l3);
        l3.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Budh gaya_h.jpg"));
        Image i8 = i7.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 900, 700);
        add(l4);
        l4.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Gir_h.jpg"));
        Image i11 = i10.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(0, 0, 900, 700);
        add(l5);
        l5.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Manali_h.jpg"));
        Image i14 = i13.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(0, 0, 900, 700);
        add(l6);
        l6.setVisible(false);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Gulmarg_h.jpg"));
        Image i17 = i16.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(0, 0, 900, 700);
        add(l7);
        l7.setVisible(false);

        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/icons/hotel7.jpg"));
        Image i20 = i19.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        l8 = new JLabel(i21);
        l8.setBounds(0, 0, 900, 700);
        add(l8);
        l8.setVisible(false);

        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Gwalior_h.jpg"));
        Image i23 = i22.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        l9 = new JLabel(i24);
        l9.setBounds(0, 0, 900, 700);
        add(l9);
        l9.setVisible(false);

        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Madhurai_h.jpg"));
        Image i26 = i25.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
        l10 = new JLabel(i27);
        l10.setBounds(0, 0, 900, 700);
        add(l10);
        l10.setVisible(false);

        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Amritsar_h.jpg"));
        Image i29 = i28.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i30 = new ImageIcon(i29);
        l11 = new JLabel(i30);
        l11.setBounds(0, 0, 900, 700);
        add(l11);
        l11.setVisible(false);
        
        ImageIcon i31 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Jaisalmer_h.jpg"));
        Image i32 = i31.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i32);
        l12 = new JLabel(i33);
        l12.setBounds(0, 0, 900, 700);
        add(l12);
        l12.setVisible(false);
        
        ImageIcon i34 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Gangtok_h.jpg"));
        Image i35 = i34.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i36 = new ImageIcon(i35);
        l13 = new JLabel(i36);
        l13.setBounds(0, 0, 900, 700);
        add(l13);
        l13.setVisible(false);
        
        ImageIcon i37 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Nainital_h.jpg"));
        Image i38 = i37.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i39 = new ImageIcon(i38);
        l14 = new JLabel(i39);
        l14.setBounds(0, 0, 900, 700);
        add(l14);
        l14.setVisible(false);
        
        ImageIcon i40 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Agra_h.jpg"));
        Image i41 = i40.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i42 = new ImageIcon(i41);
        l15 = new JLabel(i42);
        l15.setBounds(0, 0, 900, 700);
        add(l15);
        l15.setVisible(false);
        
          ImageIcon i43 = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/hotels/Kolkata_h.jpg"));
        Image i44 = i43.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i45 = new ImageIcon(i44);
        l16 = new JLabel(i45);
        l16.setBounds(0, 0, 900, 700);
        add(l16);
        l16.setVisible(false);

        th.start();

    }

    public static void main(String args[]) {
        new CheckHotels().setVisible(true);

    }

}

