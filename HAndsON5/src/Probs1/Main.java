package Probs1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		String stallName,ownerName;
		Integer cost,projectors,screen,tvSet;
		int choose;
		String []detail=new String[4];
		String input;
		 System.out.println("Choose Stall Type ");
		 System.out.println("1.Gold Stall");
		 System.out.println("2.Premium Stall");
		 System.out.println("3.Exective Stall");
		 Scanner scan =new Scanner(System.in);
		 choose=scan.nextInt();
		 scan.nextLine();
		 switch(choose) {
		 case 1:
			  System.out.println("Enter Stall details in comma separated (stall name,stall cost,Owner name,number of screens");
			  input=scan.nextLine();
			  detail=input.split(",");
			  stallName=detail[0];
			  cost=Integer.parseInt(detail[1]);
			  ownerName=detail[2];
			  tvSet=Integer.parseInt(detail[3]);
			  GoldStall g= new GoldStall(stallName,ownerName,cost,tvSet);
			  g.display();
			  break;
		case 2:
			  System.out.println("Enter Stall details in comma separated (stall name,stall cost,Owner name,number of projecters");
			  input=scan.nextLine();
			  detail=input.split(",");
			  stallName=detail[0];
			  cost=Integer.parseInt(detail[1]);
			  ownerName=detail[2];
			  projectors=Integer.parseInt(detail[3]);
			  PremiumStall p= new PremiumStall(stallName,ownerName,cost,projectors);
			  p.display();
			  break;
		case 3:
			  System.out.println("Enter Stall details in comma separated (stall name,stall cost,Owner name,number of projecters");
			  input=scan.nextLine();
			  detail=input.split(",");
			  stallName=detail[0];
			  cost=Integer.parseInt(detail[1]);
			  ownerName=detail[2];
			  screen=Integer.parseInt(detail[3]);
			  ExectuiveStall e= new ExectuiveStall(stallName,ownerName,cost,screen);
			  e.display();
			  break;
			  default:
				  break;
		 
		 }

	}

}
