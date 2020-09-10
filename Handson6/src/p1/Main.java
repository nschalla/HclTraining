package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int days,value,result;
		System.out.println("Enter the cost of item for n days");
		Scanner scan =new Scanner(System.in);
		days=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the value of n");
		value=scan.nextInt();
		try {
			result=days/value;
			System.out.println("Cost per day of the item is : "+result);
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
		
	}

}
