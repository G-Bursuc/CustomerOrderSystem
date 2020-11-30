/*
 * Class Name: Supplier.java
 * Description: This class is the blueprint used to create supplier objects 
 * Created by: Joshua Chukwuezi (C18709101)
 * 
 */


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
				"\nSupplier ID: " + this.supplierID 
				+ "\nSupplier Name: " + this.supplierName
				+ "\nSupplier Number: " + this.supplierPhoneNumber
				+ "\nSupplier Address: " + this.supplierAddress;
	}
	
	
}
