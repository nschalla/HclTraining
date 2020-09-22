package prob11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Main {
	static ArrayList<String>arrList =  new ArrayList<String>();  
	static Scanner scan =new Scanner(System.in);
	public static void start() {
		String userName,state;
		System.out.println("enter the user name");
		userName=scan.nextLine();
		arrList.add(userName);
		System.out.println("Do you want to continue?(yes/no)");
		state=scan.nextLine();
		if(state.equalsIgnoreCase("yes"))
		{
			start();
		}
		else {
			System.out.println("the name entered");
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
