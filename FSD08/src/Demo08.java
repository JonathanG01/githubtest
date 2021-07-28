
public class Demo08 {
	public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.test();
        cal.test(10);
        cal.test("A");
        cal.test(10, "A");
        cal.test("A", 10);
    }
}
