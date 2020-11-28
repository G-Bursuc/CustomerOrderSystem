package screens;

import objects.Order;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OrderScreen  extends JFrame{
	ArrayList<Order> list = null;
	
	public OrderScreen(ArrayList<Order> orderList) {
		list = orderList;
		JPanel panel = new JPanel();
		
		//button to see total for the order
		JButton seeTotal = new JButton("total");
		//total variable
		double totalDue = 0;
		//in code when adding a product
		//totalDue = totalDue + product.getPrice();
		
		//if totalDue is in a loop do this and change totalDue in info box to displayTotal
		//double displayTotal = totalDue;
		
		
		
		
		
		//action listener for total button
		seeTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Total : " + totalDue, "InfoBox", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		add(panel);
		setTitle("Order Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
