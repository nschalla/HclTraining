package p2;

import java.util.Scanner;

import p2.Product;

public class Main {

	public static void main(String[] args) {
    int product_code1,product_code2,stock1,stock2;
    String product_name1,product_name2;
    double price1,price2;
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
    
    Product p1 =new Product(product_code1,stock1,product_name1,price1);
   Product p2 =new Product(product_code2,stock2,product_name2,price2);
    
    System.out.println("Product details : ");
    System.out.println(Product.getCOMPANY_NAME()); 
    System.out.println("Product Code :"+p1.getProduct_code());
    System.out.println("Name : "+p1.getProductName());
    System.out.println("Stock : "+p1.getStock());
    System.out.println("price : "+p1.getPrice());
    Product.getDiscountedPrice(price1);
    
    System.out.println("Product details : ");
    System.out.println(Product.getCOMPANY_NAME()); 
    System.out.println("Product Code :"+p2.getProduct_code());
    System.out.println("Name : "+p2.getProductName());
    System.out.println("Stock : "+p2.getStock());
    System.out.println("price : "+p2.getPrice());
    Product.getDiscountedPrice(price2);
    Product.checkPrice(p1,p2);
    
	}

}
