/* Class Name: Product.java
 * Class Description: This class creates the Product and all its details.
 * Created By: Tami Adeduntan (C18327556)
 */

package objects;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Product {

	String name;
	String brand;
	int stock;
	double price;
	int idProduct;
	
	public Product(String name, String brand, int stock, double price, int idProduct) {
		this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	
	public String toString(){
	    return new String(" Name: " + getName() + "Brand" + brand + " Stock: " + stock + " Price: " + price + "ID: " + idProduct );
	}
	//display message if stock number is below 5
	public void checkStock() {
		if(this.stock < 5) {
			JOptionPane.showMessageDialog(null, "Stock items number is below 5!", "Alert", JOptionPane.WARNING_MESSAGE);
		}
	}
}
