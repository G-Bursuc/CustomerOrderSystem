package screens;

import objects.Customer;
import objects.Order;
import objects.Product;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class OrderScreen  extends JFrame{
	ArrayList<Order> list = null;
	ArrayList<Customer> custlist = null;
	ArrayList<Product> prodlist = null;
	
	public OrderScreen(ArrayList<Customer> customerList, ArrayList<Order> orderList, ArrayList<Product> productList) {
		list = orderList;
		custlist = customerList;
		prodlist = productList;
		
		JPanel panel = new JPanel();
		
		JButton seeTotal = new JButton("Total");
		JButton orderProduct = new JButton("Order Product");
		
		//action listener for when the total button is clicked
		seeTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TotalScreen(custlist, list);
			}
		});
		
		orderProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new OrderProduct(custlist, list, prodlist);
			}
		});
		
		panel.add(seeTotal);
		panel.add(orderProduct);
		add(panel);
		setTitle("Order Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}