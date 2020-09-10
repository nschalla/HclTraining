package p3;

public class Product {
	private int product_code,stock;
	private static final String COMPANY_NAME = "L and k Supplier";
	private double price;
	private String product_name;
	public Product(int product_code3, int stock3, String product_name3, double price3) {
		// TODO Auto-generated constructor stub
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public static String getCompanyName() {
		return COMPANY_NAME;
	}
	public static void checkLessStock(Product[] p1)
	{
		

     }
	public  static void  getDiscountedPrice(double price) {
		  
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

}
