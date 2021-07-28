
public class Demo04 {
	 public static void main(String[] args) {
	        Employee emp01 = new Employee(1, "Mark");
	        Employee emp02 = new Employee(2, "Paul");
	        emp01.printInfo();
	        emp02.printInfo();
	        Employee.companyName = "Walmart";
	        emp01.printInfo();
	        emp02.printInfo();
	    }
}
