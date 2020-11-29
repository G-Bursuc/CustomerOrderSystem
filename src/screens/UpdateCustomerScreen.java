package screens;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import objects.Customer;

public class UpdateCustomerScreen extends JFrame{
	ArrayList<Customer> list = null;
	
	public UpdateCustomerScreen(ArrayList<Customer> customerList) {
		list = customerList;
		JPanel panel = new JPanel();
		// create labels
		JLabel custListLabel = new JLabel("Choose a Customer ID to Update: ");
		JLabel custInfoLabel = new JLabel("Edit Customer Details Once Selected:");
		JLabel custNameLabel = new JLabel("Customer Name: ");
		JLabel custPhoneLabel = new JLabel("Customer Phone #: ");
		JLabel custAddrLabel = new JLabel("Customer Address: ");
		
		JButton updateCustButton = new JButton("Update Customer Record");
		JButton exitButton = new JButton("Exit");
		
		// create textfields with first customer details included
		JTextField custNameField = new JTextField(customerList.get(0).getCustomerName(), 20);
		JTextField custPhoneField = new JTextField(customerList.get(0).getCustomerPhoneNumber(), 20);
		JTextField custAddrField = new JTextField(customerList.get(0).getCustomerAddress(), 20);
		
		// create an array with customer id's
		String[] idList = new String[list.size()];
		
		for(int i = 0; i < list.size(); i++)
		{
			Customer customer = list.get(i);
			String id = Integer.toString(customer.getCustomerId());
			idList[i] = id;
		}
		
		// put array into the combo box for user to select a customer
    	JComboBox comboCustomer = new JComboBox(idList);
		
    	// when user selects a customer in the combo box, details of customer will be updated in each text field
		comboCustomer.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				// create a temporary customer to grab details from, ID's start from 1 so we can assume
				// customer with ID 4 is the 4th customer in the array
				Customer tempCust = customerList.get(Integer.parseInt((String) comboCustomer.getSelectedItem()) - 1);
				
				// update the details in the textfield
				custNameField.setText(tempCust.getCustomerName());
				custPhoneField.setText(tempCust.getCustomerPhoneNumber());
				custAddrField.setText(tempCust.getCustomerAddress());
			}
		});
		
		// button to update the new details of customer
		updateCustButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// set a variable to store the customer id/position
				int position = Integer.parseInt((String) comboCustomer.getSelectedItem()) - 1;
				// create a temporary customer with new details user put in
				Customer tempCust = new Customer(position + 1, custNameField.getText(), custPhoneField.getText(),
						custAddrField.getText());
				// replace customer in the arraylist with new customer
				list.set(position, tempCust);
				JOptionPane.showMessageDialog(null, "Customer Has Been Updated", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		// button to exit the window
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
    	
		panel.setLayout(new MigLayout("", "275!"));
		panel.add(custListLabel);
		panel.add(comboCustomer, "wrap");
		panel.add(custInfoLabel, "wrap");
		panel.add(custNameLabel);
		panel.add(custNameField, "wrap");
		panel.add(custPhoneLabel);
		panel.add(custPhoneField, "wrap");
		panel.add(custAddrLabel);
		panel.add(custAddrField, "wrap");
		panel.add(exitButton);
		panel.add(updateCustButton);
		add(panel);
		setTitle("Update A Customer Record");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
