package screens;

import objects.Supplier;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SupplierScreen extends JFrame{
	ArrayList<Supplier> list = null;
	
	public SupplierScreen(ArrayList<Supplier> supplierList) {
		list = supplierList;
		JPanel panel = new JPanel();



		add(panel);
		setTitle("Supplier Screen");
		setSize(580, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
