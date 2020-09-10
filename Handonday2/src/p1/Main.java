package p1;

public class Main {

	public static void main(String[] args) {
     System.out.println("Product Details : ");
     Product p1=new Product(1,10,"TV",20000.0);
     System.out.println("Product code : "+p1.getProduct_code());
     System.out.println("Name : "+p1.getProduct_name());
     System.out.println("Price : "+p1.getPrice());
     System.out.println("Stock : "+p1.getStock() );
     Product p2=new Product(2,20,"Moblie",50000.0);
     System.out.println("Product code : "+p2.getProduct_code());
     System.out.println("Name : "+p2.getProduct_name());
     System.out.println("Price : "+p2.getPrice());
     System.out.println("Stock : "+p2.getStock() );
     Product.checkPrice(p1,p2);
	}

}
