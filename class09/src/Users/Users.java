package Users;

public class Users { //properties represent columns, table 3 colums, 3 properties = id, name, email;`
private int id;
private double balance, amount;
private String fname, lname, email; //add last name

public Users() {}

public Users(int id, String fname, String lname, double balance, String email, double amount) {// parametrized constructor
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.balance = balance;
	this.amount = amount;
}
//				----------------------------Getters and Setters-----------------
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public Users(String lname) {
	super();
	this.lname = lname;
}


public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}



}

