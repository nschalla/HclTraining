package Probs4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int []array=new int[10];
		int divsor,result;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the value");
		for(int i=0;i<10;i++) {
			array[i]=scan.nextInt();
			
		}
		
		System.out.println("enter the divsior");
		divsor=scan.nextInt();
		try {
			for(int j=0;j<10;j++) {
				 result= array[j]/divsor;
				 System.out.println("Results :"+ result);
			}
			
		}
		catch(ArithmeticException e) {
			System.out.println("can not be divisor by zero");
		}
	}
	

}
