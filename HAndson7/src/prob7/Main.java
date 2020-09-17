package prob7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String humpty,dumpty;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the humpty sentence");
		humpty=scan.nextLine();
		System.out.println("Enter the dumpty sentence");
		dumpty=scan.nextLine();
		CheckString c = new CheckString(humpty,dumpty);
		c.check();
		
		
		}

}
