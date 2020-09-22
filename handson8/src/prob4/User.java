package prob4;

public class User {
private String name,contactNumber,userName,email;

public User() {
	super();
}

public User(String name, String contactNumber, String userName, String email) {
	super();
	this.name = name;
	this.contactNumber = contactNumber;
	this.userName = userName;
	this.email = email;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getContactNumber() {
	return contactNumber;
}

public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public void dispaly() {}

}
