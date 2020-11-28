package objects;

public class Customer {
	private String customerID;
	private String customerName;
	private String customerPhoneNumber;
	private String customerAddress;
	
	public Customer(String id, String name, String phNumber, String address) {
			this.customerID = id;
			this.customerName = name;
			this.customerPhoneNumber = phNumber;
			this.customerAddress = address;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
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
	
	
}
