package Probs2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choose;
		double side,length,breadth;
		System.out.println("choose one type :");
		System.out.println("1.square");
		System.out.println("2.Rectangle");
		Scanner scan =new Scanner(System.in);
		choose=scan.nextInt();
		switch(choose) {
		case 1: 
			System.out.println("Enter the side value: ");
			side=scan.nextDouble();
			Square s= new Square(side);
			System.out.println("Area of the square : "+s.calcArea());
			System.out.println("Perimeter of the square : "+s.calcperi());
			break;
		case 2:
			System.out.println("Enter the length value: ");
			length=scan.nextDouble();
			System.out.println("Enter the breadth value: ");
			breadth=scan.nextDouble();
			Rectangle r= new Rectangle(length,breadth);
			System.out.println("Area of the square : "+r.calcArea());
			System.out.println("Perimeter of the square : "+r.calcperi());
			break;
			default: 
				break;
		}
		

	}

}
