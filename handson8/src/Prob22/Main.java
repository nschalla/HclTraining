package Prob22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static ArrayList<String>arrList =  new ArrayList<String>();  
	static Scanner scan =new Scanner(System.in);
	int i=1;
	public static void start() {
		
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
			start();
		}
		else {
			System.out.println("Name"+"/t"+"deposit"+"/t"+"deposit");
			 Iterator iter = arrList.iterator();
		      while (iter.hasNext()) {
		         System.out.println(iter.next());
		      }
			
		}
	}
		
	
	
	public static void main(String[] args) {
		Main.start();
	}

}
