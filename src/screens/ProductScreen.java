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
		JTextField name = new JTextField(50);
		JLabel label2 = new JLabel("Enter brand: ");
		JTextField brand = new JTextField(50);
		JLabel label3 = new JLabel("Enter stock: ");
		JTextField stock = new JTextField(50);
		JLabel label4 = new JLabel("Enter price amount: ");
		JTextField price = new JTextField(50);
		JLabel label5 = new JLabel("Enter product ID: ");		
		JTextField idProduct = new JTextField(50);
		
		//add button
		JButton addButton = new JButton("Add Product");
		
		//reads data from textfields and creates a product object using the data
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product aProduct = new Product(name.getText(), brand.getText(), Integer.parseInt(stock.getText()), Double.parseDouble(price.getText()), Integer.parseInt(idProduct.getText()));
				list.add(aProduct);
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
		
		//set frame properties
		panel.setLayout(new MigLayout ("center center, wrap, gapy 20"));
		setTitle("Product Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		ProductScreen productScreen = new ProductScreen(list);
		
	}
}
