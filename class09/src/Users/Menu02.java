package Users;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu02 {
	public void Menu02() throws SQLException {
		
	
	//public static void main (String[] args) throws SQLException {
		UsersDAO dao = UsersDAOFactory.getUsersDao();
	
	System.out.println("---------------------------");
	System.out.println("Welcome to Gomez's Bank");
	System.out.println("What would you like to do? ");
	System.out.println("1) Create an Account");
	System.out.println("2) Deposit your money");
	System.out.println("3) Withdraw your money");
	System.out.println("4) Update users");
	System.out.println("5)Exit program");
	System.out.println("--------------------------");
	Scanner scan = new Scanner(System.in);
	int input = scan.nextInt();
	
	while(input!=5) {
		case1: System.out.println("PLease enter your First name: ");
			String fname = scan.next(); 
			System.out.println("PLease enter your Last name: ");
			String lname = scan.next();
			System.out.println("This will automatically create you a checking's account, please enter amount you want to deposit: ");
			double balance = scan.nextDouble();
			System.out.println("Please enter your email: ");
			String email = scan.next();
			Users users = new Users();
			users.setFname(fname); users.setLname(lname); users.setBalance(balance); users.setEmail(email); 
			dao.addUsers(users);
			
			Menu02();
	break;}
		case2: {System.out.println("PLease enter your email: ");
		String email = scan.next(); 
		System.out.println("Please enter the amount you want to deposit: ");
		double balance = scan.nextDouble();}
			
		case3: {System.out.println("PLease enter your email: ");
		String email = scan.next(); 
		System.out.println("Please enter the amount you want to withdrawn: ");
		double balance = scan.nextDouble();}
			
		/*case4:
			break;
		case5: System.out.println("you've exited the program");
			break;
	}*/
	
	}
	}
