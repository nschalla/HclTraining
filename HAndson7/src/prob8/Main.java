package prob8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
String humpty;
Scanner scan =new Scanner(System.in);
System.out.println("Enter the humpty Sentence");
humpty=scan.nextLine();
CheckString c =new CheckString(humpty);
c.check();
	}

}
