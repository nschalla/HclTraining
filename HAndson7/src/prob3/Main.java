package prob3;

import java.util.Scanner;

import prob3.CheckString;

public class Main {

	public static void main(String[] args) {
			Scanner scanner =new Scanner(System.in);
		String humpty;
		System.out.println("Enter the humpty Sentence");
		humpty=scanner.nextLine();
		
		CheckString c =new CheckString(humpty);
		c.reverse();

	}

}
