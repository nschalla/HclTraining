package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        int choose;
        String accName,accNo,accBank,orgName;
        String details;
        String info[]=new String[4];
		System.out.println("Choose Account Type");
		System.out.println("1.Saving Account");
		System.out.println("2.Current Account");
		Scanner scan =new Scanner(System.in);
		choose=scan.nextInt();
		scan.nextLine();
		switch(choose) {
			
		case 1:
			System.out.println("Enter account details in comma separted (Account Name,Acoount Number,Bank Name ,Organisation Name)");
			details=scan.nextLine();
			info=details.split(",");
			accName=info[0];
			accNo=info[1];
			accBank=info[2];
			orgName=info[3];
			SavingsAccount sa=new SavingsAccount(accName,accNo,accBank,orgName);
			sa.display();
			break;
		
		case 2:
			System.out.println("Enter account details in comma separted (Account Name,Acoount Number,Bank Name Organisation Name)");
			details=scan.nextLine();
			info=details.split(",");
			accName=info[0];
			accNo=info[1];
			accBank=info[2];
			orgName=info[3];
			CurrentAccount ca=new CurrentAccount(accName,accNo,accBank,orgName);
			ca.display();
					break;
			default:
				break;
		}	
		
		
		
	}

}
