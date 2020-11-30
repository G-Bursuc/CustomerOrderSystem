package screens;

import objects.Customer;
import objects.Order;

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
	
	public OrderScreen(ArrayList<Customer> customerList, ArrayList<Order> orderList) {
		list = orderList;
		custlist = customerList;
		JPanel panel = new JPanel();
		
		//total button
		JButton seeTotal = new JButton("Total");
		
		//action listener for when the total button is clicked
		seeTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TotalScreen(custlist, list);
			}
		});
			
		panel.add(seeTotal);
		add(panel);
		setTitle("Order Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
