package p1;

public class Product {
private int product_code,stock;
private String product_name;
private double price;

public Product() {
}

public Product(int product_code, int stock, String product_name, double price) {
	super();
	this.product_code = product_code;
	this.stock = stock;
	this.product_name = product_name;
	this.price = price;
}

public int getProduct_code() {
	return product_code;
}

public void setProduct_code(int product_code) {
	this.product_code = product_code;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


public static void checkPrice(Product p1,Product p2) {
	if(p1.getPrice()>p2.getPrice()) {
		System.out.println(p2.getProduct_name()+" is cheaper than  "+p1.getProduct_name());
	}
	else {
		System.out.println(p1.getProduct_name()+" is cheaper than  "+p2.getProduct_name());
	}
}

}
