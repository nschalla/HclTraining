package com.javaconfig.collection;

import java.util.ArrayList;

public class Employee {
 private String employeeName,employeeEmail;
 private long employeeSalary;
 private ArrayList<String> employeeMobileNumbrer;
 private Address address;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Address address) {
	address=this.address;
	
	// TODO Auto-generated constructor stub
}

public Employee(String employeeName, String employeeEmail, long employeeSalary, ArrayList<String> employeeMobileNumbrer,
		Address address) {
	super();
	this.employeeName = employeeName;
	this.employeeEmail = employeeEmail;
	this.employeeSalary = employeeSalary;
	this.employeeMobileNumbrer = employeeMobileNumbrer;
	this.address = address;
}

public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeEmail() {
	return employeeEmail;
}
public void setEmployeeEmail(String employeeEmail) {
	this.employeeEmail = employeeEmail;
}
public long getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(long employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public ArrayList<String> getEmployeeMobileNumbrer() {
	return employeeMobileNumbrer;
}
public void setEmployeeMobileNumbrer(ArrayList<String> employeeMobileNumbrer) {
	this.employeeMobileNumbrer = employeeMobileNumbrer;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void display() {
	System.out.println("The contact numbers are");
	System.out.println(this.getEmployeeMobileNumbrer());
	System.out.println("Salary:"+this.getEmployeeSalary());
	System.out.println("Email: "+this.getEmployeeEmail());
	this.address.display();
}

}
