package employees;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
	public void Menu() throws SQLException {
		
	
	//public static void main (String[] args) throws SQLException {
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
	
	System.out.println("---------------------------");
	System.out.println("Welcome to Gomez's Bank");
	System.out.println("What would you like to do? ");
	System.out.println("1) Add an Employee");
	System.out.println("2) Update an Employee");
	System.out.println("3) Delete an Employee");
	System.out.println("4) Read Employee");
	System.out.println("5)Exit program");
	System.out.println("--------------------------");
	Scanner scan = new Scanner(System.in);
	int input = scan.nextInt();
	
	while(input!=5) {
		case1: System.out.println("PLease enter your First name: ");
			String name = scan.next(); 
			System.out.println("Please enter your email: ");
			String email = scan.next(); 
			Employee emp = new Employee();
			emp.setName(name); emp.setEmail(email); 
			dao.addEmployee(emp);
	}
		/*case2:
			break;
		case3:
			break;
		case4:
			break;
		case5:
			break;*/
	}
	
	}
