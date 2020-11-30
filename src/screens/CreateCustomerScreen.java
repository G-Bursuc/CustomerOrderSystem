/*
 * Class Name: CreateCustomerScreen.java
 * Description: This GUI class allows the user to create a customer by entering their details
 * Created by: Joshua Chukwuezi (C18709101)
 * 
 */

package screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import net.miginfocom.swing.MigLayout;
import objects.Customer;

public class CreateCustomerScreen extends JFrame {
	ArrayList<Customer> list = null;
	public CreateCustomerScreen(ArrayList<Customer> customerList) {
		list = customerList;
		JPanel panel = new JPanel();
		
		JLabel customerNameLbl = new JLabel("Enter Customer Name");
		JTextField customerNameField = new JTextField(20);
		
		JLabel customerNumberLbl = new JLabel("Enter Customer Phone Number");
		JTextField customerNumberField = new JTextField(20);
		
		JLabel customerAddressLbl = new JLabel("Enter Customer Address");
		JTextField customerAddressField = new JTextField(20);
		
		JButton submitButton = new JButton("CREATE CUSTOMER");
		
		JLabel resultLbl = new JLabel("Added Customers: ");
		
		//creating scroll plane with text area inside of it
		JTextArea bottomArea = new JTextArea(20, 20);
		JScrollPane bottomScrollPane = new JScrollPane(bottomArea);
		
		//constraints
			//for scroll pane
		bottomScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		bottomScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			
			//for text area
		bottomArea.setEditable(false);	
		
		//frame for dialog
		JFrame jf = new JFrame();
		
		//button adds customers to customer list
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (customerNameField.getText().equals("")) {
					JOptionPane.showMessageDialog(jf, "Customer Name is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else if (customerNumberField.getText().equals("")) {
					JOptionPane.showMessageDialog(jf, "Customer Number is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else if(customerAddressField.getText().equals("")) {
					JOptionPane.showMessageDialog(jf, "Customer Address is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else {
						//create new customer
						String custName = customerNameField.getText();
						String custNum = customerNumberField.getText();
						String custAdd = customerAddressField.getText();
						
						//creates new customer
						Customer aCustomer = new Customer(custName, custNum, custAdd);

						
						//adds the customer to the list
						customerList.add(aCustomer);
						
						
						//changing text area
						String existingCustomers = bottomArea.getText();
						bottomArea.setText(existingCustomers + "\n" + aCustomer.toString());
				
						
						//customerIdField.setText("");
						customerNameField.setText("");
						customerNumberField.setText("");
						customerAddressField.setText("");		
				}
			}
		});
		
		panel.setLayout(new MigLayout());
		panel.add(customerNameLbl);
		panel.add(customerNameField, "wrap");
		panel.add(customerNumberLbl);
		panel.add(customerNumberField, "wrap");
		panel.add(customerAddressLbl);
		panel.add(customerAddressField, "wrap");
		panel.add(submitButton, "wrap");
		panel.add(resultLbl, "wrap");
		panel.add(bottomScrollPane);
		add(panel);
		
		setTitle("Create Customer Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
	
}
