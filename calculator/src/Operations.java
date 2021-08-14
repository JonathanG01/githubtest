
public class Operations {
	public static  void addNums(int num01, int num02) {
		System.out.println(num01+num02);
	}
	public static  void subNums(int num01, int num02) {
		System.out.println(num01-num02);
	}
	public static  void divNums(int num01, int num02) {
		System.out.println((double)num01/num02);
	}
	public static  void multNums(int num01, int num02) {
		System.out.println(num01*num02);
	}
	
	public static void Menu() {
		System.out.println("Choose a type of operation:");
		System.out.println("1) Add");
		System.out.println("2) Substract");
		System.out.println("3) Multiply");
		System.out.println("4) Divide");
		System.out.println("5) Exit");
	}
}
