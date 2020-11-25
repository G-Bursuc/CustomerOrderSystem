import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class HomeFrame extends JFrame{

	public HomeFrame() {
		JPanel panel = new JPanel();
		BufferedImage myPicture = null;
		JButton homeButton = new JButton("Home");
		JButton customerButton = new JButton("Customers");
		JButton supplierButton = new JButton("Suppliers");
		JButton stockButton = new JButton("Stock");
		JButton ordersButton = new JButton("Orders");	
		JButton exitButton = new JButton("Exit");
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		int width = 200;
		int height = 200;
		
		label1.setText("<html><body><p>My name is George and I love to code!</p></body></html>");
		label2.setText("<html><body><p>I'm Iuliana and I'm friendly and organised!</p></body></html>");
		label3.setText("<html><body><p>Hey Josh here, always up for hard work!</p></body></html>");
		label4.setText("<html><body><p>My name is Tami and I like to get things done!</p></body></html>");
		
		try {
			myPicture = ImageIO.read(new File("images/George.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Image img1 = myPicture.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		JLabel picLabel1 = new JLabel(new ImageIcon(img1));

		try {
			myPicture = ImageIO.read(new File("images/Iuliana.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Image img2 = myPicture.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		JLabel picLabel2 = new JLabel(new ImageIcon(img2));
		
		try {
			myPicture = ImageIO.read(new File("images/Josh.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Image img3 = myPicture.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		JLabel picLabel3 = new JLabel(new ImageIcon(img3));
		
		try {
			myPicture = ImageIO.read(new File("images/Tami.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Image img4 = myPicture.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		JLabel picLabel4 = new JLabel(new ImageIcon(img4));
		
		customerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame customerFrame = new JFrame();
				customerFrame.setVisible(true);
				customerFrame.setSize(400, 400);
				customerFrame.setTitle("Customer Window");
				customerFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		
		supplierButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame supplierFrame = new JFrame();
				supplierFrame.setVisible(true);
				supplierFrame.setSize(400, 400);
				supplierFrame.setTitle("Supplier Window");
				supplierFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		
		stockButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame stockFrame = new JFrame();
				stockFrame.setVisible(true);
				stockFrame.setSize(400, 400);
				stockFrame.setTitle("Stock Window");
				stockFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		
		ordersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ordersFrame = new JFrame();
				ordersFrame.setVisible(true);
				ordersFrame.setSize(400, 400);
				ordersFrame.setTitle("Order Window");
				ordersFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
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
		setTitle("Control Management System");
		setSize(580, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new HomeFrame();
	}
}
