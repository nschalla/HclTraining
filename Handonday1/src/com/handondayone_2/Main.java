package com.handondayone_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    String name,country,skill;
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter the name");
    name=scan.nextLine();
    System.out.println("Enter the country name");
    country=scan.nextLine();
    System.out.println("Enter the skill");
    skill=scan.nextLine();
    scan.close();
    Player p1 =new Player();
    p1.setName(name);
    p1.setCountry(country);
    p1.setSkill(skill);
    System.out.println("Player Details");
   System.out.println("Player Name : "+p1.getName()); 
   System.out.println("Country Name : "+p1.getCountry());    
   System.out.println("Skill : "+p1.getSkill());    

	}

}
