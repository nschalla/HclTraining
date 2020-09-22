package Prob2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import Prob22.ItemType;



public class Main {

	public static void main(String[] args) {
		ArrayList<String> arrList =new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String name,state;
		Double deposit,costPerDay;
		int i=1;
		System.out.println("Enter the details of type 1"+i);
		i++;
		System.out.println("Name :");
		name =scan.nextLine();
		System.out.println("deposit :");
		deposit =scan.nextDouble();
		scan.nextLine();
		System.out.println("costPerDay :");
		costPerDay =scan.nextDouble();
		scan.nextLine();
		System.out.println("Do you want to continue?(y/n)");
		state=scan.nextLine();
		ItemType it1=new ItemType(name, deposit, costPerDay);
		arrList.add(it1.toString());
		if(state.equalsIgnoreCase("y")) {
			System.out.println("Enter the details of type 1"+i);
			i++;
			System.out.println("Name :");
			name =scan.nextLine();
			System.out.println("deposit :");
			deposit =scan.nextDouble();
			scan.nextLine();
			System.out.println("costPerDay :");
			costPerDay =scan.nextDouble();
			scan.nextLine();
			System.out.println("Do you want to continue?(y/n)");
			state=scan.nextLine();
			ItemType it2=new ItemType(name, deposit, costPerDay);
			arrList.add(it2.toString());
		}
		
		System.out.println("Name"+"/t"+"deposit"+"/t"+"deposit");
		 Iterator iter = arrList.iterator();
	      while (iter.hasNext()) {
	         System.out.println(iter.next());
	      }
		
		}

}
