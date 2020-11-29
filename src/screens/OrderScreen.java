package screens;

import objects.Order;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class OrderScreen  extends JFrame{
	ArrayList<Order> list = null;
	
	public OrderScreen(ArrayList<Order> orderList) {
		list = orderList;
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("Enter product ID: ");
		JTextField idProduct = new JTextField(20);
		JButton checkProductButton = new JButton("Check Product");
		JLabel label2 = new JLabel("Enter customer ID: ");
		JTextField customerID = new JTextField(20);
		JButton checkCustomerButton = new JButton("Check Customer");
		
		JButton order = new JButton("Order");
		
		checkProductButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}			
		});
		
		checkCustomerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}			
		});
		
		panel.add(label);
		panel.add(idProduct);
		panel.add(checkProductButton);
		panel.add(label2);
		panel.add(customerID);
		panel.add(checkCustomerButton);
		panel.add(order);		
		add(panel);
		panel.setLayout(new MigLayout ("center center, wrap, gapy 20"));
		
		setTitle("Order Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new OrderScreen(list);	
	}
}
