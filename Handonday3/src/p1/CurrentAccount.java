package p1;

public class CurrentAccount extends Account {
private static 
String tinNumber,accName,accNo,bankName;

public CurrentAccount(String accName, String accNo2, String accBank, String orgName) {
	super(accName,accNo,bankName);
}



public String getTinNumber() {
	return tinNumber;
}

public void setTinNumber(String tinNumber) {
	this.tinNumber = tinNumber;
}

public String getAccNamee() {
	return accName;
}

public void setAccNamee(String accNamee) {
	this.accName = accNamee;
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
public void display() {
super.display();
System.out.println("Tin Number"+getTinNumber());
}
}
