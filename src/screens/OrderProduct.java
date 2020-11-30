/* Class Name: OrderProduct.java
 * Class Description: This class displays the order product screen and 
 * allows a valid customer to order a product from the list of products available.
 * Created By: Tami Adeduntan (C18327556)
 */

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

public class OrderProduct  extends JFrame{
	ArrayList<Customer> custlist = null;
	ArrayList<Order> ordlist = null;
	ArrayList<Product> prodlist = null;
	
	public OrderProduct(ArrayList<Customer> customerList, ArrayList<Order> orderList, ArrayList<Product> productList) {
		custlist = customerList;
		ordlist = orderList;
		prodlist = productList;
		
		//creates label and textfields for user input
		JFrame frame = new JFrame("Order Products");
		JPanel p = new JPanel();
		JLabel orderIDLabel = new JLabel("Enter order ID: ");
		JTextField orderID = new JTextField(20);
		JLabel customerIDLabel = new JLabel("Enter customer ID: ");
		JTextField customerID = new JTextField(20);
		JLabel productIDLabel = new JLabel("Enter product ID: ");
		JTextField idProduct = new JTextField(20);
		JLabel orderLabel = new JLabel("Enter order quantity: ");
		JTextField orderQuantity = new JTextField(20);
		JButton enter = new JButton("Enter");
		
		//add elements to the panel and configure miglayout
		p.setLayout(new MigLayout("", "[grow, fill]", "[grow, fill]"));
		p.add(orderIDLabel, "wrap, span");
		p.add(orderID, "wrap, span");
		p.add(customerIDLabel, "wrap, span");
		p.add(customerID, "wrap, span");
		p.add(productIDLabel, "wrap, span");
		p.add(idProduct, "wrap, span");
		p.add(orderLabel, "wrap, span");
		p.add(orderQuantity, "wrap, span");
		p.add(enter, "wrap, span");


		//order button
				enter.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						boolean customerfound = false;
						boolean productfound = false;
						Customer tempCust = null;
						
						//if customerid equals the customerid entered its true
						for (Customer cust : custlist) {
							if(cust.getCustomerID() == Integer.parseInt(customerID.getText())) {
								customerfound = true;
								tempCust = cust;
							}
						}
						
						//if productid equals the productid entered its true
						for(Product prod: prodlist) {
							if(prod.getIdProduct() == Integer.parseInt(idProduct.getText())) {
								productfound = true;
							}
						}
						
						//if customer and productfound are true then create an order object and add to list
							if (customerfound = true && (productfound = true)) {
								Order anOrder = new Order(tempCust, Integer.parseInt(orderID.getText()), Integer.parseInt(customerID.getText()), Integer.parseInt(orderQuantity.getText()));
								ordlist.add(anOrder);
							
							// for every order in the orderlist 
							for (Order ord: ordlist) {	
								
								// arraylist of numbers that will store order quantity entered
								int[] quantities = new int[quantities.length];	
								
								// for each product in the product list 
								for (Product prod: prodlist) {
									
								// for every order quantity in the arraylist quantities add the user inputted 
								// order quantity to the array
								for (int i = 0; i < quantities.length; i++) {
									quantities[i] = Integer.parseInt(orderQuantity.getText());
									
									//if stock is less than quantity, the quantity becomes the stock and stock
									// becomes 0
									if(prod.getStock() < Integer.parseInt(orderQuantity.getText()))
										{
											quantities[i] = prod.getStock();
											prod.setStock(0);
											// call checkstock method
											prod.checkStock();
										}
									else 
									{
										JOptionPane.showMessageDialog(null, "Order has been added", "Information", JOptionPane.INFORMATION_MESSAGE);
									}
									
								}							
							}
							}
						}
						
						if (customerfound == false) {
							JOptionPane.showMessageDialog(null, "This customer does not exist", "Alert", JOptionPane.WARNING_MESSAGE);
						}

						else if (productfound == false) {
							JOptionPane.showMessageDialog(null, "This product does not exist", "Alert", JOptionPane.WARNING_MESSAGE);
						}
						
					}
				});
				add(p);
				
				//frame properties
				setTitle("Order Product");
				setSize(250, 200);
				setVisible(true);
				setLocationRelativeTo(null);
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
	}

}