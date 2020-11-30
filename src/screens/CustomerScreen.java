/*
 * Class Name: CustomerScreen.java
 * Description: This GUI class allows the user to create or update (the details of) a customer
 * Created by: Joshua Chukwuezi (C18709101)
 * 
 */


package screens;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import objects.Customer;

public class CustomerScreen extends JFrame{
	ArrayList<Customer> list = null;
	
	public CustomerScreen(ArrayList<Customer> customerList) {
		list = customerList;
		JPanel panel = new JPanel();
		
		JLabel mainLbl = new JLabel("Choose an option to start");
		JButton createBtn = new JButton("CREATE CUSTOMER");
		JButton updateBtn = new JButton("UPDATE CUSTOMER");
		
		panel.setLayout(new MigLayout());
		panel.add(mainLbl, "wrap");
		panel.add(createBtn, "wrap");
		panel.add(updateBtn);
		add(panel);
		
		createBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreateCustomerScreen(customerList);
			}
			
		});
		
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		setTitle("Customer Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
