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
	ArrayList<Customer> list = null;

	public CustomerScreen(ArrayList<Customer> customerList) {
		list = customerList;
		JPanel panel = new JPanel();
		JButton updateCustButton = new JButton("Update A Customer Record");
		JButton exitButton = new JButton("Exit");

		// button that brings user to update a customer record
		updateCustButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check if customers exist in the arraylist
				if (!list.isEmpty())
					new UpdateCustomerScreen(list);
				else // if arraylist is empty then show a popup warning
					JOptionPane.showMessageDialog(null, "Access Denied, No Customers Exist in the System", "Alert", JOptionPane.WARNING_MESSAGE);
			}});

		// button to exit the window
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		panel.add(updateCustButton);
		panel.add(exitButton);
		add(panel);
		setTitle("Customer Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
