package p2;

import p2.Product;

public class Product {
	private int product_code,stock;
	 private String productName;
	 private final static   String COMPANY_NAME=" L & K Suppliers" ;
	 private double price;
	 
	
	public Product() {	
		
	}
	public Product(int product_code, int stock, String productName, double price) {
		super();
		this.product_code = product_code;
		this.stock = stock;
		this.productName = productName;
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
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public  static void  getDiscountedPrice(double price) {
	   double discount;
		if(price>=80000) {
			 System.out.println("Discounted price :"+ 0.30*price);
		}
	else if (price>=60000) {
		 System.out.println("Discounted price :"+ 0.20*price);

			}
	else if (price>=50000) {
		 System.out.println("Discounted price :"+ 0.10*price);

			}		 
	else {
		 System.out.println("Discounted price :"+ 0.5*price);

	}
			 
		}
		

		
	public static void checkPrice(Product p1,Product p2) {
		if(p1.getPrice()>p2.getPrice()) {
			System.out.println(p2.getProductName()+" is cheaper than  "+p1.getProductName());
		}
		else {
			System.out.println(p1.getProductName()+" is cheaper than  "+p2.getProductName());
	
		}
		}
	public static String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}
	}
