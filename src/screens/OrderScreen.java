package screens;

import objects.Order;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class OrderScreen  extends JFrame{
	ArrayList<Order> list = null;
	
	public OrderScreen(ArrayList<Order> orderList) {
		list = orderList;
		JPanel panel = new JPanel();
		
		
		
		add(panel);
		setTitle("Order Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
