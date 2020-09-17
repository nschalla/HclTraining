package prob5;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String humpty,dumpty;
		System.out.println("Enter the humpty Sentence");
		humpty=scanner.nextLine();
		System.out.println("Enter the dumpty Sentence");
		dumpty=scanner.nextLine();
		CheckString c =new CheckString(humpty,dumpty);
		c.check();
	}

}
