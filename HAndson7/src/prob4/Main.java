package prob4;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String humpty,replace,synom;
		System.out.println("Enter the humpty Sentence");
		humpty=scanner.nextLine();
		System.out.println("Enter the word to place");
		replace=scanner.nextLine();
		System.out.println("Enter the synonm");
		synom=scanner.nextLine();
		CheckString c =new CheckString(humpty,replace,synom);
		c.check();
	}

}
