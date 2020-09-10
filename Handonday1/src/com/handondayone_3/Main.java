package com.handondayone_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Long overs,balls,runs;
		String batsmen,blower,nonStricker;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the over");
        overs=scan.nextLong();
        System.out.println("Enter the ball");
        balls=scan.nextLong();
        System.out.println("Enter the runs");
        runs=scan.nextLong();
        scan.nextLine();
        System.out.println("Enter the batsman name");
        batsmen=scan.nextLine();
        System.out.println("Enter the bowler name");
        blower=scan.nextLine();
        System.out.println("Enter the nonStricker name");
        nonStricker=scan.nextLine();
        scan.close();
        Delivery d1= new Delivery(overs,balls,runs,batsmen,blower,nonStricker);
        d1.displayDeliveryDetails();
        
        
        

        
        
        
	}

}
