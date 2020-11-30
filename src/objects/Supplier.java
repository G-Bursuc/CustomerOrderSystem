package objects;

public class Supplier {
	
	private int supplierID;
	private String supplierName;
	private String supplierPhoneNumber;
	private String supplierAddress;
	private static int uniqueID=1;
	
	public Supplier() {
		this.supplierID = createID();
	}
	
	public Supplier(String name, String number, String address) {
		this.supplierName = name;
		this.supplierPhoneNumber = number;
		this.supplierAddress = address;
		this.supplierID = createID();
	}
	
	public static int createID() {
		return uniqueID++;
	}
	
	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierPhoneNumber() {
		return supplierPhoneNumber;
	}

	public void setSupplierPhoneNumber(String supplierPhoneNumber) {
		this.supplierPhoneNumber = supplierPhoneNumber;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	
	public String toString() {
		return
				"\nCustomer ID: " + this.supplierID 
				+ "\nCustomer Name: " + this.supplierName
				+ "\nCustomer Number: " + this.supplierPhoneNumber
				+ "\nCustomer Address: " + this.supplierAddress;
	}
	
	
}
