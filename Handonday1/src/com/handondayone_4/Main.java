package com.handondayone_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
     System.out.println("Enter the player details");
     Scanner scan =new Scanner(System.in);
     String Details,name,country,skill;
     Details=scan.nextLine();
     String values[]=Details.split(",");
     scan.close();
     name=values[0];
     country=values[1];
     skill=values[2];
     Player p1=new Player(name,country,skill);
     System.out.println("Player details");
     System.out.println("player Name : "+p1.getPlayerName());
     System.out.println("country Name : "+p1.getCountryName());
     System.out.println("Skill : "+p1.getSkill());
     
	}

}
