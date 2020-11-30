/*
 * Class Name: TotalScreen.java
 * Class Description: This class allows a user to view the total cost of a customer order by firstly asking the user to enter a valid customer ID.
 * Created By: Iuliana Attl (C18379476) 
 */
package screens;

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
import objects.Customer;
import objects.Order;
import objects.Product;

public class TotalScreen extends JFrame{
	
	//arraylists storing the lists of customers and orders
	ArrayList<Customer> custlist = null;
	ArrayList<Order> ordlist = null;
	
	public TotalScreen(ArrayList<Customer> customerList, ArrayList<Order> orderList) {		
		//copy the elements of the original arraylists to the declared arraylists
		custlist = customerList;
		ordlist = orderList;
		
		//create the java swing elements
		JPanel panel = new JPanel();
		JFrame totalFrame = new JFrame("See Total");
		JLabel custIDLabel = new JLabel("Enter customer ID: ");
		JTextField custID = new JTextField();
		custID.setColumns(10);
		JButton submit = new JButton("Submit");
		
		//set the layout manager of the panel to MigLayout
		panel.setLayout(new MigLayout("", "[grow, fill]", "[grow, fill]"));
		
		//add the elements to the panel
		panel.add(custIDLabel, "wrap, span");
		panel.add(custID, "wrap, span");
		panel.add(submit, "wrap, span");	
				
		//action listener for when the submit button is clicked
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//variables storing the total cost and condition of the findings
				double totalDue = 0;
				boolean custfound = false;
				boolean ordfound = false;
				
				//for each customer in the customer list
				for (Customer cust : custlist) {
					//if the customer ID of the current customer matches the ID entered by the user
					if(cust.getCustomerID() == Integer.parseInt(custID.getText())) {
						//set found variable to true
						custfound = true;
					}
				}
				
				//if the customer has not been found			
				if (custfound == false) {
					//display a warning dialog that the user does not exist
					JOptionPane.showMessageDialog(null, "This customer does not exist", "Alert", JOptionPane.WARNING_MESSAGE);
				}
				else{
					//if the user has been found
					//for each order in the list order list
					for (Order ord : ordlist) {
						//if the customer associated with that order matches the ID entered by the user
						if(ord.getCust().getCustomerID() == Integer.parseInt(custID.getText())) {
							//set the found order to true
							ordfound = true;
							
							//create a new arraylist that will store the products from the order
							ArrayList<Product> customerProducts = ord.getProdlist();
							
							//for each product in the arraylist of product in that order
							for(Product aprod : customerProducts) {
								//add the price to the total due
								totalDue = totalDue + aprod.getPrice();
							}							
						}
					}
					
					//if the customer ID's matched and an order was found
					if (ordfound == false) {
						//display the total cost
						JOptionPane.showMessageDialog(null, "This customer has no orders", "Alert", JOptionPane.WARNING_MESSAGE);
					}
					else {
						//otherwise display warning dialog that the user has no orders
						JOptionPane.showMessageDialog(null, "Total : " + totalDue, "InfoBox", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
						
		});
			
		//add the panel to the frame
		add(panel);
		
		//frame properties
		setTitle("Total Screen");
		setSize(250, 200);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}

