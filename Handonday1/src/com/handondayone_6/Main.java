package com.handondayone_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
     String name,input;
     Long runs;
     String[] details;
     System.out.println("Enter the extratype details");
     Scanner scan =new Scanner(System.in);
     input=scan.nextLine();
     details=input.split("#");
     name=details[0];
     runs=Long.parseLong(details[1]);
     ExtraType et = new ExtraType();
     et.setName(name);
     et.setRuns(runs);
     System.out.println("Extratype details");
     System.out.println("Extra type : "+et.getName());
     System.out.println("Runs : "+et.getRuns());
	}

}
