package screens;

import objects.Supplier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SupplierScreen extends JFrame{
	// arraylist to store the list of customers
	ArrayList<Supplier> list = null;

	public SupplierScreen(ArrayList<Supplier> supplierList) {
		// copy given array list into global array list
		list = supplierList;

		// create elements
		JPanel panel = new JPanel();
		JButton updateSupplButton = new JButton("Update A Supplier Record");
		JButton exitButton = new JButton("Exit");

		// configure button to bring user to update a supplier record
		updateSupplButton.addActionListener(new ActionListener() {
			// check if customers exist in the arraylist
			public void actionPerformed(ActionEvent e) {
				// check if customers exist in the arraylist
				if (!list.isEmpty())
					new UpdateSupplierScreen(list);
				else // if arraylist is empty then show a popup warning
					JOptionPane.showMessageDialog(null, "Access Denied, No Suppliers Exist in the System", "Alert", JOptionPane.WARNING_MESSAGE);
			}
		});

		// configure button to exit the window
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		// add elements to the panel, add panel to the frame
		panel.add(updateSupplButton);
		panel.add(exitButton);
		add(panel);
		
		// configure frame
		setTitle("Supplier Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);


	}
}
