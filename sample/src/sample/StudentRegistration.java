package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentRegistration {

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
					StudentRegistration window = new StudentRegistration();
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
	public StudentRegistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("STUDENT REGISTRATION");
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_5.setBounds(130, 5, 176, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Roll No");
		lblNewLabel.setBounds(42, 33, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(42, 73, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setBounds(42, 120, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(42, 166, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBackground(new Color(255, 128, 64));
		r1.setBounds(130, 162, 65, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBackground(new Color(255, 0, 128));
		r2.setBounds(220, 162, 72, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_4 = new JLabel("PROG LANG");
		lblNewLabel_4.setBounds(33, 204, 78, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBackground(new Color(128, 255, 255));
		c1.setBounds(129, 200, 78, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBackground(new Color(0, 128, 192));
		c2.setBounds(220, 200, 86, 23);
		frame.getContentPane().add(c2);
		tb1 = new JTextField();
		tb1.setBounds(130, 30, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);

		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "DS ", "CIVIL", "MECH", "CS"}));
		cb3.setBounds(130, 112, 86, 22);
		frame.getContentPane().add(cb3);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setBackground(new Color(255, 128, 255));
		c3.setBounds(310, 200, 78, 23);
		frame.getContentPane().add(c3);
		tb2 = new JTextField();
		tb2.setBounds(130, 70, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=tb1.getText();
				String name=tb2.getText();
				String Branch=(String) cb3.getSelectedItem();
				String gender=" ";
				String langs=" ";
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				if(c1.isSelected())
				{
					langs=langs+"C";
				}
				if(c2.isSelected())
				{
					langs=langs+"JAVA";
				}
				if(c3.isSelected())
				{
					langs=langs+"PYTHON";
				}
				JOptionPane.showMessageDialog(btnNewButton,"Roll No:"+roll+
						 "\n Name:" +name+ "\n Branch:" +Branch+
						"\n Gender:" +gender+ "\n Prog Langs:" +langs);
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(165, 230, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
}



