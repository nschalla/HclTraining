package com.handondayone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
      String name,city;
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the venue name");
      name=scan.nextLine();
      System.out.println("enter city name");
      city=scan.nextLine();
      scan.close();
      Venue v1= new Venue();
      v1.setVenue(name);
      v1.setCity(city);
      System.out.println("venue Details");
      System.out.println("Venue Name : "+v1.getVenue());
      System.out.println("City Name : "+ v1.getCity());
     
	}

}
