package prob1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choose;
		Float radius,length,breadth,side;
		Scanner scan =new Scanner(System.in);
		System.out.println("List of Shapes:");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Square");
		System.out.println("Enter the choice");
		choose=scan.nextInt();
		switch(choose) {
		case 1:
			System.out.println("Enter the radius of the circle");
			radius=scan.nextFloat();
			Shape c =new Circle(radius);
			System.out.println("The perimeter is "+c.calculatePerimeter() );
			break;
		case 2:
			System.out.println("Enter the length of the rectangle");
			length=scan.nextFloat();
			System.out.println("Enter the breadth of the rectangle");
			breadth=scan.nextFloat();
			Shape r = new Rectangle(length,breadth);
			
			System.out.println("The perimeter is"+r.calculatePerimeter());
			break;
		case 3:
			System.out.println("Enter the side of the square");
			side=scan.nextFloat();
			Shape s =new Square(side);
			System.out.println("The perimeter is "+s.calculatePerimeter() );
			break;
			
		default:
				
			break;
		}
		
	}

}
