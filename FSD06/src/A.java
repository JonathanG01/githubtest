
public class A {
	static int a; //global variable? available through the whole program due to static keyword.

    static {
        a = 20;
        System.out.println(a);
    }
}
