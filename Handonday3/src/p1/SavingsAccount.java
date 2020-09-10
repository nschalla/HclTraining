package p1;

public class SavingsAccount extends Account{

	String orgNAme,accNAme,bankName,accno;

	

	public SavingsAccount(String accName, String accNo, String bankName, String orgNAme) {
		super(accName, accNo, bankName);
		System.out.println(accName + "\t"+ accNo +"\t"+bankName );
		
		this.orgNAme = orgNAme;
		
	}

	public SavingsAccount() {
		super();
	}

	public String getOrgNAme() {
		return orgNAme;
	}

	public void setOrgNAme(String orgNAme) {
		this.orgNAme = orgNAme;
	}

	public String getAccNAme() {
		return accNAme;
	}

	public void setAccNAme(String accNAme) {
		this.accNAme = accNAme;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}
public void display() {
	
	super.display();
	System.out.println("Organisation name:"+getOrgNAme());

}
	
}
