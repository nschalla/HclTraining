package prob6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String humpty,word;
		int position;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the humpty sentence ");
		humpty= scan.nextLine();
		System.out.println("humpty says :"+humpty);
		System.out.println("what is dumpty want to insert & where?");
		word=scan.nextLine();
		System.out.println("enter the position");
		position=scan.nextInt();
		CheckString c =new CheckString(humpty,word,position);
		c.check();
	}

}
