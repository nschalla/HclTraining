package prb2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String stallName,stallDetail,stallOwner,stallType,tvConfirmation;
		Integer stallSquareFeet,tvNo;
		Scanner scan =new Scanner(System.in);
		 System.out.println("Enter the name of the stall");
		 stallName=scan.nextLine();
		 System.out.println("Enter the details of the stall");
		 stallDetail=scan.nextLine();
		System.out.println("Enter the owner name of the stall");
		stallOwner=scan.nextLine();
		System.out.println("Enter the tyep of the stall");
		stallType=scan.nextLine();
		System.out.println("Enter the size of the stall in square feet");
		stallSquareFeet=scan.nextInt();
		scan.nextLine();
		System.out.println("Does the hall Tv?(y/n)");
		tvConfirmation=scan.nextLine();
	
		Stall sc=new Stall(stallName,stallDetail,stallOwner);
		if(tvConfirmation=="yes") {
		System.out.println("enter the number of tv");
		tvNo=scan.nextInt();
		 sc.DoubleComputeCost(stallType,stallSquareFeet,tvNo);

		}
		else {
		sc.DoubleComputeCost(stallType, stallSquareFeet);	
		}
	
		}
	

}
