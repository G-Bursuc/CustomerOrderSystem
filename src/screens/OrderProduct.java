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
		
		JFrame frame = new JFrame("Order Products");
		JPanel p = new JPanel();
		JLabel customerIDLabel = new JLabel("Enter customer ID: ");
		JTextField customerID = new JTextField(20);
		JLabel productIDLabel = new JLabel("Enter product ID: ");
		JTextField idProduct = new JTextField(20);
		JButton enter = new JButton("Enter");
		
		p.setLayout(new MigLayout("", "[grow, fill]", "[grow, fill]"));
		p.add(customerIDLabel, "wrap, span");
		p.add(customerID, "wrap, span");
		p.add(productIDLabel, "wrap, span");
		p.add(idProduct, "wrap, span");
		p.add(enter, "wrap, span");


		//order button
				enter.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						boolean customerfound = false;
						boolean productfound = false;

						for (Customer cust : custlist) {
							if(cust.getCustomerID() == Integer.parseInt(customerID.getText())) {
								customerfound = true;
							}
						}

						for(Product prod: prodlist) {
							if(prod.getIdProduct() == Integer.parseInt(idProduct.getText())) {
								productfound = true;
							}
						}
						
						for(Product prod: prodlist) {
							if (customerfound = true && (productfound = true)) {
								Order anOrder = new Order(prod.getIdProduct(), prod.getName(), prod);
								ordlist.add(anOrder);
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