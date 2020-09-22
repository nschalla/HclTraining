package prob3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int hallno;
		String searchElement;
		System.out.println("Enter the number of halls :");
		hallno=scan.nextInt();
		scan.nextLine();
		ArrayList<String> array =new ArrayList<String>();
		for(int i=0;i<hallno;i++) {
			System.out.println("Enter the hall name : "+(i+1) );
			array.add(scan.nextLine());
			
		}
		System.out.println("enter the hall name to be searched :");
		searchElement=scan.nextLine();
		int postion =array.indexOf(searchElement);
		boolean answer=array.contains(searchElement);
		if(answer)
			System.out.println(searchElement+" hall is found in list at position "+postion);
		else
			System.out.println(searchElement +" hall is not found");
		
	}

}
