/* Class Name: ProductScreen.java
 * Class Description: This class displays the product screen and 
 * allows the user to enter the product details.
 * Created By: Tami Adeduntan (C18327556)
 */
package screens;

import objects.Product;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class ProductScreen  extends JFrame{
	//create list
	ArrayList<Product> list = null;
	
	public ProductScreen(ArrayList<Product> productList) {
		list = productList;
		JPanel panel = new JPanel();
		
		//label and textfields for user input
		JLabel label = new JLabel("Enter product name: ");
		JTextField name = new JTextField(20);
		JLabel label2 = new JLabel("Enter brand: ");
		JTextField brand = new JTextField(20);
		JLabel label3 = new JLabel("Enter stock: ");
		JTextField stock = new JTextField(20);
		JLabel label4 = new JLabel("Enter price amount: ");
		JTextField price = new JTextField(20);
		JLabel label5 = new JLabel("Enter product ID: ");		
		JTextField idProduct = new JTextField(20);
		
		//add button
		JButton addButton = new JButton("Add Product");
		
		//reads data from textfields and creates a product object using the data
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Product Name is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else if (brand.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Brand is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else if(Integer.parseInt(stock.getText())==0) {
					JOptionPane.showMessageDialog(null, "Stock is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else if(Double.parseDouble(price.getText()) ==0) {
					JOptionPane.showMessageDialog(null, "Price is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else if(Double.parseDouble(price.getText()) ==0) {
					JOptionPane.showMessageDialog(null, "Price is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else if(Integer.parseInt(idProduct.getText())==0) {
					JOptionPane.showMessageDialog(null, "Product ID is empty", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else {
					Product aProduct = new Product(name.getText(), brand.getText(), Integer.parseInt(stock.getText()), Double.parseDouble(price.getText()), Integer.parseInt(idProduct.getText()));
					list.add(aProduct);
					JOptionPane.showMessageDialog(null, "Product has been added", "Information", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}			
		});
		
		//add elements to the panel and configure miglayout
		panel.add(label);
		panel.add(name);
		panel.add(label2);
		panel.add(brand);
		panel.add(label3);
		panel.add(stock);
		panel.add(label4);
		panel.add(price);
		panel.add(label5);
		panel.add(idProduct);
		panel.add(addButton);				
		add(panel);
		panel.setLayout(new MigLayout ("center center, wrap, gapy 20"));
		
		//set frame properties
		setTitle("Product Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
