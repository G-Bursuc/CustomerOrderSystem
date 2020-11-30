package objects;

public class Customer {
	private int customerID;
	private String customerName;
	private String customerPhoneNumber;
	private String customerAddress;
	private static int uniqueID;
	
	
	public Customer(int id, String name, String phNumber, String address) {
			this.customerID = createID();
			this.customerName = name;
			this.customerPhoneNumber = phNumber;
			this.customerAddress = address;
	}
	
	public static int createID() {
		return uniqueID++;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public String toString() {
		return
				"\nCustomer ID: " + this.customerID 
				+ "\nCustomer Name: " + this.customerName
				+ "\nCustomer Number: " + this.customerPhoneNumber
				+ "\nCustomer Address: " + this.customerAddress;
	}
	
	
}