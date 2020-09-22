package prob1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		String Username;
		String state;
		ArrayList<String> array = new ArrayList<String>();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the username 1");
		Username=scan.nextLine();
		array.add(Username);
		System.out.println("Do you want to continue(y/n)");
		state=scan.nextLine();
		if(state.equals("y")) {
			System.out.println("Enter the username 2");
			Username=scan.nextLine();
			array.add(Username);
			System.out.println("Do you want to continue(y/n)");
			state=scan.nextLine();
		}
		else {
			
		}
		System.out.println("Name entered are");
		 Iterator iter = array.iterator();
	      while (iter.hasNext()) {
	         System.out.println(iter.next());
	      }
		
	}

}
