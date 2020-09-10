package com.handondayone_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
     
     Long over,balls;
     int number;
     String wicketType,playerName,bowlerName;
     System.out.println("Enter the number of wickets");
     Scanner scan =new Scanner(System.in);
     number=scan.nextInt(); 
     scan.nextLine();
     String[] details =new String[number];
     for(int i=1;i<=number;i++) {
    	System.out.println("enter the details of wicket "+ i);
    	details[i-1]=scan.nextLine();
    	}
    
     
   String[] p1details=new String[5];
   p1details=details[0].split(",");
   String[] p2details=new String[5];
   p2details=details[1].split(",");
   String[] p3details=new String[5];
   p3details=details[2].split(",");
   System.out.println("Wicket Details");
   Wicket w1= new Wicket(Long.parseLong(p1details[0]),Long.parseLong(p1details[1]),p1details[2],p1details[3],p1details[4]);
   System.out.println("over : "+w1.getOver());
   System.out.println("Ball : "+w1.getBall());
   System.out.println("WicketType : "+w1.getWicketType());
   System.out.println("PlayerName : "+w1.getPlayerName());
   System.out.println("BlowerName : "+w1.getBowlerName());
   Wicket w2= new Wicket(Long.parseLong(p2details[0]),Long.parseLong(p2details[1]),p2details[2],p2details[3],p2details[4]);
   System.out.println("over : "+w2.getOver());
   System.out.println("Ball : "+w2.getBall());
   System.out.println("WicketType : "+w2.getWicketType());
   System.out.println("PlayerName : "+w2.getPlayerName());
   System.out.println("BlowerName : "+w2.getBowlerName());
   Wicket w3= new Wicket(Long.parseLong(p1details[0]),Long.parseLong(p3details[1]),p3details[2],p3details[3],p3details[4]);
   System.out.println("over : "+w3.getOver());
   System.out.println("Ball : "+w3.getBall());
   System.out.println("WicketType : "+w3.getWicketType());
   System.out.println("PlayerName : "+w3.getPlayerName());
   System.out.println("BlowerName : "+w3.getBowlerName());
}
	
}