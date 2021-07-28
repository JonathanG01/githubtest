package demo15;

public class Calculator2{
	// not abstract method
    public void addNumber(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    public void subNumber(int num1, int num2) {
        System.out.println("Sub: " + (num1 - num2));
    }

    // abstract methods
    public abstract void mulNumber(int num1, int num2);

    public abstract void divNumber(int num1, int num2);
    
    //can't figure out the issue on this Demo!
}
