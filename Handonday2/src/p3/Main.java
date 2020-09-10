package p3;

import java.util.Scanner;

import p3.Product;

public class Main {
	
	public static void buildProduct() {
		  int product_code1,product_code2,product_code3,product_code4,product_code5,stock1,stock2,stock3,stock4,stock5;
		   String product_name1,product_name2,product_name3,product_name4,product_name5;
		   double price1,price2,price3,price4,price5;
		   Scanner scan = new Scanner(System.in);
		    System.out.println("Enter the Product code : ");
		    product_code1=scan.nextInt();
		    scan.nextLine();
		    System.out.println("Enter the Product name : ");
		    product_name1=scan.nextLine();
		    System.out.println("Enter the price");
		    price1=scan.nextDouble();
		    System.out.println("Enter the Stock");
		    stock1=scan.nextInt();
		    
		    System.out.println("Enter the Product code : ");
		    product_code2=scan.nextInt();
		    scan.nextLine();
		    System.out.println("Enter the Product name : ");
		    product_name2=scan.nextLine();
		    System.out.println("Enter the price");
		    price2=scan.nextDouble();
		    System.out.println("Enter the Stock");
		    stock2=scan.nextInt();
		    
		    System.out.println("Enter the Product code : ");
		    product_code3=scan.nextInt();
		    scan.nextLine();
		    System.out.println("Enter the Product name : ");
		    product_name3=scan.nextLine();
		    System.out.println("Enter the price");
		    price3=scan.nextDouble();
		    System.out.println("Enter the Stock");
		    stock3=scan.nextInt();
	
		    System.out.println("Enter the Product code : ");
		    product_code4=scan.nextInt();
		    scan.nextLine();
		    System.out.println("Enter the Product name : ");
		    product_name4=scan.nextLine();
		    System.out.println("Enter the price");
		    price4=scan.nextDouble();
		    System.out.println("Enter the Stock");
		    stock4=scan.nextInt();
		    
		    System.out.println("Enter the Product code : ");
		    product_code5=scan.nextInt();
		    scan.nextLine();
		    System.out.println("Enter the Product name : ");
		    product_name5=scan.nextLine();
		    System.out.println("Enter the price");
		    price5=scan.nextDouble();
		    System.out.println("Enter the Stock");
		    stock5=scan.nextInt();
		    
		    Product p1 =new Product(product_code1,stock1,product_name1,price1);
		    Product p2 =new Product(product_code2,stock2,product_name2,price2);
		    Product p3 =new Product(product_code3,stock3,product_name3,price3);
		    Product p4 =new Product(product_code4,stock4,product_name4,price4);
		    Product p5 =new Product(product_code5,stock5,product_name5,price5);
		    
		    System.out.println("Product details : ");
		    System.out.println(Product.getCompanyName()); 
		    System.out.println("Product Code :"+p1.getProduct_code());
		    System.out.println("Name : "+p1.getProduct_name());
		    System.out.println("Stock : "+p1.getStock());
		    System.out.println("price : "+p1.getPrice());
		    Product.getDiscountedPrice(price1);
		    
		    System.out.println("Product details : ");
		    System.out.println(Product.getCompanyName()); 
		    System.out.println("Product Code :"+p2.getProduct_code());
		    System.out.println("Name : "+p2.getProduct_name());
		    System.out.println("Stock : "+p2.getStock());
		    System.out.println("price : "+p2.getPrice());
		    Product.getDiscountedPrice(price2);
		    
		    System.out.println("Product details : ");
		    System.out.println(Product.getCompanyName()); 
		    System.out.println("Product Code :"+p3.getProduct_code());
		    System.out.println("Name : "+p3.getProduct_name());
		    System.out.println("Stock : "+p3.getStock());
		    System.out.println("price : "+p3.getPrice());
		    Product.getDiscountedPrice(price3);
		    
		    System.out.println("Product details : ");
		    System.out.println(Product.getCompanyName()); 
		    System.out.println("Product Code :"+p4.getProduct_code());
		    System.out.println("Name : "+p4.getProduct_name());
		    System.out.println("Stock : "+p4.getStock());
		    System.out.println("price : "+p4.getPrice());
		    Product.getDiscountedPrice(price4);
		    
		    System.out.println("Product details : ");
		    System.out.println(Product.getCompanyName()); 
		    System.out.println("Product Code :"+p5.getProduct_code());
		    System.out.println("Name : "+p5.getProduct_name());
		    System.out.println("Stock : "+p5.getStock());
		    System.out.println("price : "+p5.getPrice());
		    Product.getDiscountedPrice(price5);
		     
		    System.out.println("The product with Min stock");
		    System.out.println(Product.getCompanyName());
		    Product[] products= {p1,p2,p3,p4,p5};
		    Product.checkLessStock(products);
		    
		    
		    
	}

	public static void main(String[] args) {
    
	Main m1= new Main();
	m1.buildProduct();
	

	
	}

}
