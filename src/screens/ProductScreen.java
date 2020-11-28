package screens;

import objects.Product;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProductScreen  extends JFrame{
	ArrayList<Product> list = null;
	
	public ProductScreen(ArrayList<Product> productList) {
		list = productList;
		JPanel panel = new JPanel();
		
		String name;
		String brand;
		int stock;
		double price;
		int idProduct;
		
		Scanner scan = new Scanner(System.in);

		Product aProduct;

		System.out.print("Enter product name: ");
		name = scan.nextLine();
		System.out.print("Enter brand: ");
		brand = scan.nextLine();
		System.out.print("Enter stock: ");
		stock = scan.nextInt();
		System.out.println("Enter price amount: ");
		price = scan.nextInt();
		System.out.print("Enter product ID: ");
		idProduct = scan.nextInt();

		aProduct = new Product(name, brand, stock, price, idProduct);
		list.add(aProduct);
				
		add(panel);
		setTitle("Product Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
