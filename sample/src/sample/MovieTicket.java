package sample;
// thido hphodrty

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MovieTicket {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieTicket window = new MovieTicket();
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
	public MovieTicket() {
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
		
		JLabel lblNewLabel = new JLabel("MOIVE TICKETS BOOKING");
		lblNewLabel.setBounds(118, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(62, 66, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MoiveName");
		lblNewLabel_2.setBounds(60, 104, 65, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number Tckts");
		lblNewLabel_3.setBounds(60, 143, 77, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(169, 63, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "Pushpa", "Om Bhim Bush", "Liger", "RRR", "Kgf"}));
		cb1.setBounds(169, 100, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6"}));
		cb2.setBounds(169, 139, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill=0;
				String Name = tb1.getText();
				String Movie = (String) cb1.getSelectedItem();
				String Tckts = (String) cb2.getSelectedItem();
				int nt=Integer.parseInt(Tckts);
				
				if(Movie.equals("RRR"))
				{
					bill=bill+nt*200;
				}
				if(Movie.equals("Liger"))
				{
					bill=bill+nt*320;
				}
				if(Movie.equals("Om Bhim Bush"))
				{
					bill=bill+nt*110;
				}
				if(Movie.equals("kgf"))
				{
					bill=bill+nt*220;
				}
				if(Movie.equals("Pushpa"))
				{
					bill=bill+nt*330;
				}
				
				
				
				JOptionPane.showMessageDialog(btnNewButton,"Name:"+Name+
						 "\n Moive:" +Movie+ "\n Tckts:" +Tckts+"\n Amount:"+bill);
			}
		});
		btnNewButton.setBounds(169, 200, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\headphones-4223911_640.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
