package prob2;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
