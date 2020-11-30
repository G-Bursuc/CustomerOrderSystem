/* Class Name: Order.java
 * Class Description: This class creates the Order and all its details.
 * Created By: Tami Adeduntan (C18327556)
 */

package objects;

import java.util.ArrayList;

public class Order {
	Product product;	
	Customer cust;
	int OrderID;
	int customerID;
	int orderQuantity;

	public Order(Customer cust, Product prod, int OrderID, int customerID, int orderQuantity) {
		this.cust = cust;
		this.OrderID = OrderID;
		this.customerID = customerID;
		this.orderQuantity = orderQuantity;
		this.product = prod;
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
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
