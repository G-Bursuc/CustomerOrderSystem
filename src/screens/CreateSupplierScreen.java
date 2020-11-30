/*
 * Class Name: CreateSupplierScreen.java
 * Description: This GUI class allows the user to create a supplier by entering their details
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
import objects.Supplier;

public class CreateSupplierScreen extends JFrame {
	ArrayList<Supplier> list = null;
	
	public CreateSupplierScreen(ArrayList<Supplier> supplierList) {
		list = supplierList;
		JPanel panel = new JPanel();
		
		JLabel supplierNameLbl = new JLabel("Enter Supplier Name");
		JTextField supplierNameField = new JTextField(20);
		
		JLabel supplierNumberLbl = new JLabel("Enter Supplier Phone Number");
		JTextField supplierNumberField = new JTextField(20);
		
		JLabel supplierAddressLbl = new JLabel("Enter Supplier Address");
		JTextField supplierAddressField = new JTextField(20);
		
		JButton submitButton = new JButton("CREATE SUPPLIER");
		
		JLabel resultLbl = new JLabel("Added Suppliers: ");
		
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
		
		//button adds supplier to customer list
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (supplierNameField.getText().equals("")) {
					JOptionPane.showMessageDialog(jf, "Supplier Name is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else if (supplierNumberField.getText().equals("")) {
					JOptionPane.showMessageDialog(jf, "Supplier Number is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else if(supplierAddressField.getText().equals("")) {
					JOptionPane.showMessageDialog(jf, "Supplier Address is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else {
						//create new supplier
						String supName = supplierNameField.getText();
						String supNum = supplierNumberField.getText();
						String supAdd = supplierAddressField.getText();
						
						//creates new supplier
						Supplier aSupplier = new Supplier(supName, supNum, supAdd);

						
						//adds the supplier to the list
						supplierList.add(aSupplier);
						
						
						//changing text area
						String existingCustomers = bottomArea.getText();
						bottomArea.setText(existingCustomers + "\n" + aSupplier.toString());
				
						

						supplierNameField.setText("");
						supplierNumberField.setText("");
						supplierAddressField.setText("");		
				}
			}
		});
		
		panel.setLayout(new MigLayout());
		panel.add(supplierNameLbl);
		panel.add(supplierNameField, "wrap");
		panel.add(supplierNumberLbl);
		panel.add(supplierNumberField, "wrap");
		panel.add(supplierAddressLbl);
		panel.add(supplierAddressField, "wrap");
		panel.add(submitButton, "wrap");
		panel.add(resultLbl, "wrap");
		panel.add(bottomScrollPane);
		add(panel);
		
		setTitle("Create Supplier Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
}
