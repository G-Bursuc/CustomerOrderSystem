package screens;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import objects.Customer;

public class CustomerScreen extends JFrame{
	// arraylist to store the list of customers
	ArrayList<Customer> list = null;

	public CustomerScreen(ArrayList<Customer> customerList) {
		// copy given array list into global array list
		list = customerList;
		
		// create elements
		JPanel panel = new JPanel();
		JButton updateCustButton = new JButton("Update A Customer Record");
		JButton exitButton = new JButton("Exit");

		// configure button to bring user to update a customer record
		updateCustButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check if customers exist in the arraylist
				if (!list.isEmpty())
					new UpdateCustomerScreen(list);
				else // if arraylist is empty then show a popup warning
					JOptionPane.showMessageDialog(null, "Access Denied, No Customers Exist in the System", "Alert", JOptionPane.WARNING_MESSAGE);
			}});

		// configure button to exit the window
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		// add elements to the panel, add panel to the frame
		panel.add(updateCustButton);
		panel.add(exitButton);
		add(panel);
		
		// configure frame
		setTitle("Customer Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
