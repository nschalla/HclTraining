package Prob2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String  name,detail,ownerName;
		Integer noOfStall;
		 Integer noOfShows,noOfSeatsPerShow;

		int choose;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the event :");
		name=scan.nextLine();
		System.out.println("Enter the detail of the event");
		detail=scan.nextLine();
		System.out.println("enter the owner name of the event");
		ownerName=scan.nextLine();
		System.out.println("Enter the type of the  event ");
		System.out.println("1.Exhibition");
		System.out.println("2.StageEvent");
		choose=scan.nextInt();
		scan.nextLine();
		switch(choose) {
		case 1:
			System.out.println("Enter the number of stalls");
			noOfStall=scan.nextInt();
			Event e =new Exhibition(noOfStall);
			System.out.println("the projected revenue of the event "+e.projectedRevenue());
			break;
		case 2:
			System.out.println("Enter the number of shows");
			noOfShows=scan.nextInt();
			System.out.println("Enter the number of seats per show");
			noOfSeatsPerShow=scan.nextInt();
			Event s =new StageEvent(noOfShows, noOfSeatsPerShow);
			System.out.println("the projected revenue of the event "+s.projectedRevenue());
			break;
			default:
				break;
		}		
	}

}
