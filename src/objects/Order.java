/* Class Name: Order.java
 * Class Description: This class creates the Order and all its details.
 * Created By: Tami Adeduntan (C18327556)
 */

package objects;

import java.util.ArrayList;

public class Order {
	ArrayList<Product> prodlist = null;	
	Customer cust;
	int OrderID;
	int customerID;
	int orderQuantity;

	public Order(Customer cust, int OrderID, int customerID, int orderQuantity) {
		this.cust = cust;
		this.OrderID = OrderID;
		this.customerID = customerID;
		this.orderQuantity = orderQuantity;
	}
	
	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public Order(Customer cust) {
		this.cust = cust;
	}
	
	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	public ArrayList<Product> getProdlist() {
		return prodlist;
	}

	public void setProdlist(ArrayList<Product> prodlist) {
		this.prodlist = prodlist;
	}
}
