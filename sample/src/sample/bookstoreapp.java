package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class bookstoreapp {
	int items=0;
	int total=0;

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookstoreapp window = new bookstoreapp();
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
	public bookstoreapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK STORE APPLICATION");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel.setBounds(101, 11, 173, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton bt1 = new JButton("");
		bt1.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\book4.PNG"));
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+500;
				tb1.setText(""+items);
				tb2.setText(""+total);
				
				
			}
		});
		bt1.setBounds(10, 61, 101, 146);
		frame.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("");
		bt2.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\book3.PNG"));
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+450;
				tb1.setText(""+items);
				tb2.setText(""+total);
			
			}
		});
		bt2.setBounds(121, 61, 101, 146);
		frame.getContentPane().add(bt2);
		
		JButton bt3 = new JButton("");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+800;
				tb1.setText(""+items);
				tb2.setText(""+total);
			}
		});
		bt3.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\SD.PNG"));
		bt3.setBounds(232, 79, 101, 129);
		frame.getContentPane().add(bt3);
		
		JLabel lblNewLabel_1 = new JLabel("ITEM");
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(272, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBackground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(272, 61, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(328, 33, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(328, 58, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("RS : 500/-");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(20, 218, 62, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS : 450/-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(149, 218, 62, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS : 800/-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(253, 219, 62, 14);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
