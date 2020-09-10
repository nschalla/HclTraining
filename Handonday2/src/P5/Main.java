package P5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int film_no;
		Scanner scan =new Scanner(System.in);
		System.out.println("How many films?");
		film_no=scan.nextInt();
		String [] film_id_name =new String[film_no];

		for(int i=0;i<film_no;i++) {
			System.out.println("enter the Film Details : (id,name)");
			film_id_name[i]=scan.nextLine();
			System.out.println("how many songs in ");
			
		}
	}

}
