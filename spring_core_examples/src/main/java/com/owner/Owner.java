package com.owner;

public class Owner {
private String name,password,mobilenumber;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getMobilenumber() {
	return mobilenumber;
}

public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public void display() {
	System.out.println("details");
	System.out.println("Name: "+getName());
	System.out.println("password :"+getPassword());
	System.out.println("number : "+getMobilenumber());
}


}
