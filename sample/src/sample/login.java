package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.getContentPane().setForeground(new Color(255, 0, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" login page");
		lblNewLabel.setBounds(205, 23, 63, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setBounds(64, 83, 67, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setBounds(68, 128, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(141, 80, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(141, 125, 86, 20);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 String name=tb1.getText();
			 String pwd=p1.getText();
			 if(name.equals("ravi") && pwd.equals("1234"))
			 {
				 JOptionPane.showMessageDialog(btnNewButton, "valid user");
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(btnNewButton, "invalid user");
			 }
			}
			
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(179, 167, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 255));
		table.setBounds(30, 23, 1, 1);
		frame.getContentPane().add(table);
	}
}
