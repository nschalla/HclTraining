package com.handondayone_5;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		String name,city;
		int choose;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the venue name");
		name=scan.nextLine();
		System.out.println("Enter the city name");
	    city=scan.nextLine();
	    Venue v1= new Venue();
	    v1.setName(name);
	    v1.setCity(city);
	    
	    System.out.println("Venue Details");
	    System.out.println("Venue Name : "+v1.getName());
	    System.out.println("City name : "+v1.getCity());
	   
	  
	 do {
	    System.out.println("Verify and Update venue Details");
	    System.out.println("Menu");
	    System.out.println("1.Update Venue Name");
	    System.out.println("2.Update city Name");
	    System.out.println("3. All information Correct/Exit");
	    System.out.println("type 1 or 2  or 3");
	    choose= scan.nextInt();
	    scan.nextLine();
	    switch(choose) {
	    case 1:
	    	System.out.println("Enter the venue name");
			name=scan.nextLine();
		    v1.setName(name);	
		    System.out.println("Venue Details");
		    System.out.println("Venue Name : "+v1.getName());
		    System.out.println("City name : "+v1.getCity());
			 break;
	    case 2:
	    	System.out.println("Enter the city name");
		    city=scan.nextLine();
		    v1.setCity(city);
		    System.out.println("Venue Details");
		    System.out.println("Venue Name : "+v1.getName());
		    System.out.println("City name : "+v1.getCity());
		 default:
			 break;
	    	
	  }}
	 while(choose<3);
	 
	    
	    
	}
	}



