package prob5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static HashSet<String>a =  new HashSet<String>();  
	static Scanner scan =new Scanner(System.in);
	
	public static void start() {
		String userName,state;
		System.out.println("enter the user name");
		userName=scan.nextLine();
		a.add(userName);
		System.out.println("Do you want to continue?(yes/no)");
		state=scan.nextLine();
		if(state.equalsIgnoreCase("yes"))
		{
			start();
		}
		else {
			System.out.println("number of user : "+a.size());
		}
		
		
	}
	
	public static void main(String[] args) {
	
		Main.start();
	
	}

}
