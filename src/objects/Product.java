package objects;

import javax.swing.JOptionPane;

public class Product {

	public Product() {
		
	}
	
	//display message if stock number is below 5
	public void checkStock() {
		if(this.stock < 5) {
			JOptionPane.showMessageDialog(null, "Stock items number is below 5!", "Alert", JOptionPane.WARNING_MESSAGE);
		}
	}
}
