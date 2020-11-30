/*
 * Class Name: SupplierScreen.java
 * Description: This GUI class allows the user to create or update (the details of) a supplier
 * Created by: Joshua Chukwuezi (C18709101)
 * 
 */

package screens;

import objects.Supplier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class SupplierScreen extends JFrame{
	ArrayList<Supplier> list = null;
	
	public SupplierScreen(ArrayList<Supplier> supplierList) {
		list = supplierList;
		JPanel panel = new JPanel();
		
		JLabel mainLbl = new JLabel("Choose an option to start");
		JButton createBtn = new JButton("CREATE SUPPLIER");
		JButton updateBtn = new JButton("UPDATE SUPPLIER");
		
		createBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreateSupplierScreen(supplierList);
			}
		});
		
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		panel.setLayout(new MigLayout());
		panel.add(mainLbl, "wrap");
		panel.add(createBtn, "wrap");
		panel.add(updateBtn);
		add(panel);
		setTitle("Supplier Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
