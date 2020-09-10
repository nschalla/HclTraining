package com.handondayone_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
     Long over,ball,runs;
     String batsmen,bowler,nonStricker;
     Scanner scan =new Scanner(System.in);
     System.out.println("Enter the Over");
     over=scan.nextLong();
     System.out.println("Enter the ball");
     ball=scan.nextLong();
     System.out.println("Enter the runs");
     runs=scan.nextLong();
     scan.nextLine();
     System.out.println("Enter the batsmen name");
     batsmen=scan.nextLine();
     System.out.println("Enter the bowler name");
     bowler=scan.nextLine();
     System.out.println("Enter the nonstricker name");
     nonStricker=scan.nextLine();
     Delivery d1= new Delivery(over,ball,runs,batsmen,bowler,nonStricker);
     System.out.println("over : "+ d1.getOver());
     System.out.println("Ball : "+ d1.getBall());
     System.out.println("Runs : "+ d1.getRuns());
     System.out.println("Batsmen : "+ d1.getBatsmen());
     System.out.println("Bowler : "+ d1.getBowler());
     System.out.println("NonStricker : "+ d1.getNonStricker());


	}

}
