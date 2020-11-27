package screens;

import objects.Product;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProductScreen  extends JFrame{
	ArrayList<Product> list = null;
	
	public ProductScreen(ArrayList<Product> productList) {
		list = productList;
		JPanel panel = new JPanel();
		
		
		//display message if stock number is below 5
		if(list.size() < 5) {
			JOptionPane.showMessageDialog(null, "Stock items number is below 5!", "Alert", JOptionPane.WARNING_MESSAGE);
		}
		
		add(panel);
		setTitle("Product Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
		
}
