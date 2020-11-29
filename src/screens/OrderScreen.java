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
	
	public OrderScreen(ArrayList<Order> orderList) {
		list = orderList;
		JPanel panel = new JPanel();
		
		JButton seeTotal = new JButton("total");
		
		//action listener for total button
		seeTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame totalFrame = new JFrame("See Total");
				JPanel totalPanel = new JPanel();
				JLabel custIDLabel = new JLabel("Enter customer ID: ");
				JTextField custID = new JTextField();
				custID.setColumns(10);
				JButton submit = new JButton("Submit");
						
				totalPanel.setLayout(new MigLayout("", "[grow, fill]", "[grow, fill]"));
				totalPanel.add(custIDLabel, "wrap, span");
				totalPanel.add(custID, "wrap, span");
				totalPanel.add(submit, "wrap, span");
				totalFrame.add(totalPanel);			
						
				submit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {	
						double totalDue = 0;
						boolean custfound = false;
						boolean ordfound = false;
								
						for (Customer cust : custlist) {
							if(cust.getCustomerID() == Integer.parseInt(custID.getText())) {
								custfound = true;
							}
						}
									
						if (custfound == false) {
							JOptionPane.showMessageDialog(null, "This customer does not exist", "Alert", JOptionPane.WARNING_MESSAGE);
						}
						else{
							for (Order ord : ordlist) {
								if(ord.getCustomer().getCustomerID() == Integer.parseInt(custID.getText())) {
										totalDue = ord.getProduct().getPrice();
										ordfound = true;
									}
								}
							if (ordfound == false) {
								JOptionPane.showMessageDialog(null, "This customer has no orders", "Alert", JOptionPane.WARNING_MESSAGE);
							}
							else {
								JOptionPane.showMessageDialog(null, "Total : " + totalDue, "InfoBox", JOptionPane.INFORMATION_MESSAGE);
							}
						}
								
					}
				});
						
						
				totalFrame.setTitle("See Total");
				totalFrame.setSize(250, 200);
				totalFrame.setVisible(true);
				totalFrame.setLocationRelativeTo(null);
				totalFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
						
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
