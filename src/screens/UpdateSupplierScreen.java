/*
 * Class Name: UpdateSupplierScreen.java
 * Class Description: This class allows the user to select a supplier record, 
 * update any details about the supplier and apply the changes made
 * back into the system.
 * Created By: George Bursuc (C18399946)
 */

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
import objects.Supplier;

public class UpdateSupplierScreen extends JFrame{
	ArrayList<Supplier> list = null;

	public UpdateSupplierScreen(ArrayList<Supplier> supplierList) {
		list = supplierList;
		JPanel panel = new JPanel();

		// create labels
		JLabel supplListLabel = new JLabel("Choose a Supplier ID to Update: ");
		JLabel supplInfoLabel = new JLabel("Edit Supplier Details Once Selected:");
		JLabel supplNameLabel = new JLabel("Supplier Name: ");
		JLabel supplPhoneLabel = new JLabel("Supplier Phone #: ");
		JLabel supplAddrLabel = new JLabel("Supplier Address: ");

		// create update and delete buttons
		JButton updateSupplButton = new JButton("Update Supplier Record");
		JButton exitButton = new JButton("Exit");

		// create textfields with first supplier details included
		JTextField supplNameField = new JTextField(supplierList.get(0).getSupplierName(), 20);
		JTextField supplPhoneField = new JTextField(supplierList.get(0).getSupplierPhoneNumber(), 20);
		JTextField supplAddrField = new JTextField(supplierList.get(0).getSupplierAddress(), 20);

		// create an array with supplier id's
		String[] idList = new String[list.size()];

		for(int i = 0; i < list.size(); i++)
		{
			Supplier supplier = list.get(i);
			String id = Integer.toString(supplier.getSupplierId());
			idList[i] = id;
		}

		// put array into the combo box for user to select a supplier
		JComboBox comboSupplier = new JComboBox(idList);

		// when user selects a supplier in the combo box, details of supplier will be updated in each text field
		comboSupplier.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				// create a temporary supplier to grab details from, ID's start from 1 so we can assume
				// supplier with ID 4 is the 4th supplier in the array
				Supplier tempSuppl = supplierList.get(Integer.parseInt((String) comboSupplier.getSelectedItem()) - 1);

				// update the details in the textfield
				supplNameField.setText(tempSuppl.getSupplierName());
				supplPhoneField.setText(tempSuppl.getSupplierPhoneNumber());
				supplAddrField.setText(tempSuppl.getSupplierAddress());
			}
		});

		// button to update the new details of supplier
		updateSupplButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// set a variable to store the supplier id/position
				int position = Integer.parseInt((String) comboSupplier.getSelectedItem()) - 1;
				// create a temporary supplier with new details user put in
				Supplier tempSuppl = new Supplier(position + 1, supplNameField.getText(), supplPhoneField.getText(),
						supplAddrField.getText());
				// replace supplier in the arraylist with new supplier
				list.set(position, tempSuppl);
				JOptionPane.showMessageDialog(null, "Supplier Has Been Updated", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		// button to exit the window
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		// add elements to the panel, add panel to the frame and configure miglayout
		panel.setLayout(new MigLayout("", "275!"));
		panel.add(supplListLabel);
		panel.add(comboSupplier, "wrap");
		panel.add(supplInfoLabel, "wrap");
		panel.add(supplNameLabel);
		panel.add(supplNameField, "wrap");
		panel.add(supplPhoneLabel);
		panel.add(supplPhoneField, "wrap");
		panel.add(supplAddrLabel);
		panel.add(supplAddrField, "wrap");
		panel.add(exitButton);
		panel.add(updateSupplButton);
		add(panel);
		
		// configure frame
		setTitle("Update a Supplier Record");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
