package screens;

import objects.Product;

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
	ArrayList<Product> list = null;
	
	public ProductScreen(ArrayList<Product> productList) {
		list = productList;
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter product name: ");
		JLabel label2 = new JLabel("Enter brand: ");
		JLabel label3 = new JLabel("Enter stock: ");
		JLabel label4 = new JLabel("Enter price amount: ");
		JLabel label5 = new JLabel("Enter product ID: ");
		
		JTextField name = new JTextField(50);
		JTextField brand = new JTextField(50);
		JTextField stock = new JTextField(50);
		JTextField price = new JTextField(50);
		JTextField idProduct = new JTextField(50);
		
		JButton addButton = new JButton("Add Product");
		JButton cancelButton = new JButton("Cancel");
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product aProduct = new Product(name.getText(), brand.getText(), Integer.parseInt(stock.getText()), Double.parseDouble(price.getText()), Integer.parseInt(idProduct.getText()));
			}			
		});
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}			
		});
		
		
			
		
		panel.setLayout(new MigLayout ("", "275!"));
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(addButton);
		panel.add(cancelButton);				
		add(panel);
		
		setTitle("Product Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
//	public static void main(String[] args) {
//		
//		
//	}
}
