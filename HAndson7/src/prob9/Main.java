package prob9;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		String humpty;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the humpty Sentence");
		humpty=scan.nextLine();
		ChecKString c =new ChecKString(humpty);
		c.check();
	}

}
