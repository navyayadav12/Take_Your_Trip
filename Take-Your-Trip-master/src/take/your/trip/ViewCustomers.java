 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package take.your.trip;

/**
 *
 * @author Prach
 */
import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ViewCustomers extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	 JLabel lblAvailability;
	private JLabel lblCleanStatus;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblRoomNumber;
	private JLabel lblId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCustomers frame = new ViewCustomers("Avnish Kumar");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

        
	public ViewCustomers(String username) throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 800, 600);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/icons/viewall.jpg"));
                Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,450,626,201);
                add(l1);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/icons/viewall.jpg"));
                Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel l2 = new JLabel(i6);
                l2.setBounds(615,450,626,201);
                add(l2);
                
		
//		table = new JTable();
//		table.setBounds(0, 40, 900, 350);
//		contentPane.add(table);
                
//                lblAvailability = new JLabel("Username");
//		lblAvailability.setBounds(5, 5, 150, 25);
//		contentPane.add(lblAvailability);
                
                
		
		
		lblAvailability = new JLabel("Username");
		lblAvailability.setBounds(10, 15, 200, 25);
		contentPane.add(lblAvailability);
		
		lblCleanStatus = new JLabel("Id Type");
		lblCleanStatus.setBounds(10, 35, 200, 15);
		contentPane.add(lblCleanStatus);
		
		lblNewLabel = new JLabel("Number");
		lblNewLabel.setBounds(10, 55, 200, 15);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(10, 85, 200, 15);
		contentPane.add(lblNewLabel_1);

		
		lblId = new JLabel("Gender");
		lblId.setBounds(10, 105, 200, 15);
		contentPane.add(lblId);
                
                JLabel l3 = new JLabel("Country");
		l3.setBounds(10, 125, 200, 15);
		contentPane.add(l3);
                
                JLabel l4 = new JLabel("Address");
		l4.setBounds(10, 145, 200, 15);
		contentPane.add(l4);
                
                JLabel l5 = new JLabel("Phone");
		l5.setBounds(10, 165, 200, 14);
		contentPane.add(l5);
                
                JLabel l6 = new JLabel("Email");
		l6.setBounds(10, 185, 200, 14);
		contentPane.add(l6);
                
                try{
                    Conn c = new Conn();
                        String displayCustomersql = "select * from customer where username='"+username+"'";
                        ResultSet rs = c.s.executeQuery(displayCustomersql);
                        //table.setModel(DbUtils.resultSetToTableModel(rs));
                        while(rs.next())
                        {
                            lblAvailability.setText(rs.getString("username"));
                            lblCleanStatus.setText(rs.getString("id"));
                            lblNewLabel.setText(rs.getString("number"));
                            lblNewLabel_1.setText(rs.getString("name"));
                            lblId.setText(rs.getString("gender"));
                            
                            l3.setText(rs.getString("country"));
                            l4.setText(rs.getString("address"));
                            l5.setText(rs.getString("phone"));
                            l6.setText(rs.getString("email"));
                           
                        }
                }
                catch(Exception e1){
                        e1.printStackTrace();
                }
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
                btnNewButton.setBounds(330, 400, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
                
                        ImageIcon bg = new ImageIcon(ClassLoader.getSystemResource("take/your/trip/icons/tbg2.jpg"));
        Image bgi = bg.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon bgi2 = new ImageIcon(bgi);

        JLabel lbg = new JLabel(bgi2);
        lbg.setBounds(0, 0, 800, 600);
        contentPane.add(lbg);
                
                getContentPane().setBackground(Color.WHITE);
	}

}