import java.util.Scanner;


public class Demo01 {
	static Operations y = new Operations(); //why can I use Operations.methods()? and why can I use y.method() if static??

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator!");
		System.out.println("Choose a numbers to use:");
		Scanner scan = new Scanner(System.in);
		
		int num01 = scan.nextInt();
		System.out.println("Choose another number to use:");
		int num02 = scan.nextInt();
		
		y. Menu();
		int x = scan.nextInt();
		
		while(x!=5) {
		switch(x) {
		case 1: 
			System.out.println("you chose to add, and it equals to:");
			y.addNums(num01,num02); 
			break; 
		case 2: System.out.println("you chose to substract, and it equals to:");
		Operations.subNums(num01,num02); break;
		case 3: System.out.println("you chose to multiply, and it equals to:"); 
		Operations.multNums(num01,num02); break;
		case 4:  System.out.println("you chose to divide, and it equals to:");
		Operations.divNums(num01,num02); break;
		case 5: System.out.println("you have exited the program");
		
		}
		
		System.out.println("you're back to first menu, pick again");
	
		Operations.Menu();
		
		x = scan.nextInt();
	
		
		}
	}
	
	
}
