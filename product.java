package javaproject;

public class product {
	private int productId;
	private String name;
	private double price;
	private int quqntity;
	private String manufacturar;

	public void displayDetails() {
		System.out.println("product details are");

	}

	public void updatePrice() {
		System.out.println("price of product are");

	}

	public void upadateQuantity() {
		System.out.println("product quqantity is");

	}

	public void display() {
		System.out.println("productId=" + productId);
		System.out.println("name=" + name);
		System.out.println("price=" + price);
		System.out.println("quantity=" + quqntity);
		System.out.println("manufacturar=" + manufacturar);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product product1 = new product();
		product1.productId = 123;
		product1.name = "amul";
		product1.price = 90;
		product1.manufacturar = "xyz company";

		product1.displayDetails();
		product1.updatePrice();
		product1.upadateQuantity();
		product1.display();

	}

}
