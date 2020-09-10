package p1;

public class Account {
protected String accName,accNo,bankName;

public Account(String accName, String accNo, String bankName) {
	super();
	this.accName = accName;
	this.accNo = accNo;
	this.bankName = bankName;
}


public Account() {
	super();
	// TODO Auto-generated constructor stub
}


public String getAccName() {
	return accName;
}

public void setAccName(String accName) {
	this.accName = accName;
}

public String getAccNo() {
	return accNo;
}

public void setAccNo(String accNo) {
	this.accNo = accNo;
}

public String getBankName() {
	return bankName;
}

public void setBankName(String bankName) {
	this.bankName = bankName;
}


protected void display() {
	
	System.out.println("Account Name:"+getAccName());
	System.out.println("Account Number:"+getAccNo());
	System.out.println("Bank Name:"+getBankName());
}
}
