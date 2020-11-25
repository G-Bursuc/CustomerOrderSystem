package screens;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import objects.Customer;

public class CustomerScreen extends JFrame{
	ArrayList<Customer> list = null;
	
	public CustomerScreen(ArrayList<Customer> customerList) {
		list = customerList;
		JPanel panel = new JPanel();
		
		
		
		add(panel);
		setTitle("Customer Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
