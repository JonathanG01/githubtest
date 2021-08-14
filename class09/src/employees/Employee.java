package employees;

public class Employee { //properties represent columns, table 3 colums, 3 properties = id, name, email;`
private int id;
private String name, email;

public Employee() {}

public Employee(int id, String name, String email) { //constructor ??
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}

//------------------------------------Getters and Setters------------------------------------------------------------
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



}

