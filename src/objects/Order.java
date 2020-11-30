package objects;

public class Order {
	private String name;
	private int idProduct;
	private Product prod;

	public Order(int idProduct, String name, Product prod) {
		this.name = name;
		this.idProduct = idProduct;
		this.prod = prod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
}
