package objects;

public class Customer {

	private int id;
	private String name;
	private String phone;
	private String address;

	public Customer(int id, String name, String phone, String address) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public int getCustomerId() {
		return id;
	}
	
	public String getCustomerName() {
		return this.name;
	}
	
	public String getCustomerPhoneNumber() {
		return this.phone;
	}
	
	public String getCustomerAddress() {
		return this.address;
	}
}
