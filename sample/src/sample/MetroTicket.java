package sample;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MetroTicket {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetroTicket window = new MetroTicket();
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
	public MetroTicket() {
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
		
		JLabel lblNewLabel = new JLabel("Metro Ticket Booking");
		lblNewLabel.setBounds(137, 21, 109, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(75, 65, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("source");
		lblNewLabel_2.setBounds(75, 108, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("destination");
		lblNewLabel_3.setBounds(60, 147, 61, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("tickets");
		lblNewLabel_4.setBounds(75, 180, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name =tb1.getText();
				String source =(String) cb1.getSelectedItem();
				String destination =(String) cb2.getSelectedItem();
				String tickets =(String) cb3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				if(source.equals(destination))
				{
					JOptionPane.showMessageDialog(btnNewButton,"Please check the stations");
					
				}
				else
				{
					int bill=0;
					bill=bill+nt*45;
					int res=0;
					res=JOptionPane.showConfirmDialog(btnNewButton,"Name:"+Name+
							"\nsource:"+source+"\n destination"+destination+"\n tickets"+tickets+"\n amount"+bill);
					if(res==YES_OPTION)
					{
						JOptionPane.showMessageDialog(btnNewButton,"Booking COnfirmed");
						
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton,"Booking Cancelled");
					}
				}
				
				
			}
		});
		btnNewButton.setBounds(202, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		tb1 = new JTextField();
		tb1.setBounds(149, 62, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "JNTU", "KOMPALLY", "SECUNDRABAD", "NAMPALLY", "TIRUMALA"}));
		cb1.setBounds(149, 100, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KOMPALLY", "JNTU", "SURARAM", "CHINTAL", "MEDCHAL"}));
		cb2.setBounds(149, 133, 86, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6"}));
		cb3.setBounds(152, 166, 83, 22);
		frame.getContentPane().add(cb3);
	}

}
