package prb3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choose;
		Double radius,length,breadth,base,height;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the  Shape:");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Triangle");
		System.out.println("Enter the choice");
		choose=scan.nextInt();
		switch(choose) {
		case 1:
			
			System.out.println("enter the radius");
			radius=scan.nextDouble();
			Shape c= new Circle(radius);
			c.computeArea();
			break;
		case 2:
			System.out.println("Enter the length");
			length=scan.nextDouble();
			System.out.println("Enter the breadth");
			breadth=scan.nextDouble();
			Shape r =new Rectangle(length,breadth);
			r.computeArea();
		
			break;
		case 3:
			System.out.println("Enter the base");
			base=scan.nextDouble();
			System.out.println("Enter the height");
			height=scan.nextDouble();
			Shape t =new Triangle(base,height);
			t.computeArea();
			break;
		}
	}

}
