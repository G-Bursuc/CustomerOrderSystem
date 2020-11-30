package screens;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import objects.Customer;
import objects.Order;
import objects.Product;
import objects.Supplier;

public class HomeScreen extends JFrame{
	//global arraylists that store the list of objects needed in the program
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<Order> orderList = new ArrayList<Order>();
	ArrayList<Supplier> supplierList = new ArrayList<Supplier>();
	ArrayList<Product> productList = new ArrayList<Product>();
  
	public HomeScreen() {
		// create and setup the panel, buttons and text labels
		JPanel panel = new JPanel();
		JButton homeButton = new JButton("Home");
		JButton customerButton = new JButton("Customers");
		JButton supplierButton = new JButton("Suppliers");
		JButton stockButton = new JButton("Products");
		JButton ordersButton = new JButton("Orders");	
		JButton exitButton = new JButton("Exit");
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		label1.setText("<html><body><p>My name is George and I love to code!</p></body></html>");
		label2.setText("<html><body><p>I'm Iuliana and I'm friendly and organised!</p></body></html>");
		label3.setText("<html><body><p>Hey Josh here, always up for hard work!</p></body></html>");
		label4.setText("<html><body><p>My name is Tami and I like to get things done!</p></body></html>");
		
		// create and setup the pictures
		BufferedImage myPicture = null; // used to read the image on disk
		Image img; // used to resize the image
		// image size dimensions
		int width = 200;
		int height = 200;
		// labels used to house the images
		JLabel picLabel1 = null;
		JLabel picLabel2 = null;
		JLabel picLabel3 = null;
		JLabel picLabel4 = null;
		
		// creating and displaying each picture
		try {
		myPicture = ImageIO.read(new File("images/George.png")); // read image from disk
		img = myPicture.getScaledInstance(width, height, Image.SCALE_DEFAULT); // resize the image
		picLabel1 = new JLabel(new ImageIcon(img)); // store image in label to be displayed

		myPicture = ImageIO.read(new File("images/Iuliana.png"));
		img = myPicture.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		picLabel2 = new JLabel(new ImageIcon(img));

		myPicture = ImageIO.read(new File("images/Josh.png"));
		img = myPicture.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		picLabel3 = new JLabel(new ImageIcon(img));
		
		myPicture = ImageIO.read(new File("images/Tami.png"));
		img = myPicture.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		picLabel4 = new JLabel(new ImageIcon(img));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// BUTTONS
		// displays the customer window
		customerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CustomerScreen(customerList);
			}
		});
		
		// displays the supplier window
		supplierButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SupplierScreen(supplierList);
			}
		});
		
		// displays the product window
		stockButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProductScreen(productList);
			}
		});
		
		// displays the order window
		ordersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new OrderScreen(customerList, orderList, productList);
			}
		});
		
		// closes the program
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		// add elements to the panel and configure miglayout
		panel.setLayout(new MigLayout("", "275!"));
		panel.add(homeButton, "split 3, align center");
		panel.add(customerButton);
		panel.add(supplierButton);
		panel.add(stockButton, "split 3, align left");
		panel.add(ordersButton);
		panel.add(exitButton, "wrap");
		panel.add(picLabel1, "align center");
		panel.add(picLabel2, "align center, wrap");
		panel.add(label1, "align center");
		panel.add(label2, "align center, wrap");
		panel.add(picLabel3, "align center");
		panel.add(picLabel4, "align center, wrap");
		panel.add(label3, "align center");
		panel.add(label4, "align center");
		add(panel);
		
		// configure frame
		setTitle("Control Management System");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	// constructor
	public static void main(String[] args) {
		new HomeScreen();
	}
}
