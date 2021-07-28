package demo15;

public class Test2 extends Calculator2 {
	@Override
    public void mulNumber(int num1, int num2) {
        System.out.println("Mul: " + (num1 * num2));
    }

    @Override
    public void divNumber(int num1, int num2) {
        System.out.println("Div: " + (num1 / num2));
    }
}
