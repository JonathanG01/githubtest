
public class Employee {
	public int Id;
    public String name;
    public static String companyName = "Revature";

    public Employee(int eId, String name){
        this.Id = Id;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Id: "+ Id+ ", Name: "+ name+ ", Company Name: "+ companyName);
    }
}
