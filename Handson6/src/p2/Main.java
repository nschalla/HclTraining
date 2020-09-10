package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		Double deposit,costPerDay;
		Scanner scan= new Scanner(System.in);
		
		try {
			System.out.println("Enter the Item type details:");
			System.out.println("enter the name :");
			name=scan.nextLine();
			System.out.println("Enter the deposit");
			deposit=scan.nextDouble();
			scan.nextLine();
			System.out.println("Enter the cost of the day");
			costPerDay=scan.nextDouble();
			scan.nextLine();
			ItemType it =new ItemType(name,deposit,costPerDay);
			System.out.println("the Details of the item type are :");
			System.out.println("Name : "+it.name);
			System.out.println("Deposit : "+it.getDeposit());
			System.out.println("Cost of per day : "+it.getCostPerDay());
		}
		catch(Exception e){
			System.out.println(e);;
			
		}
	}

}
