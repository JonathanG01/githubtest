
public class Calculation {
	public void test(){
        System.out.println("1st method");
    }

    public void test(int a){
        System.out.println("2nd method");
    }

    public void test(String a){
        System.out.println("3rd method");
    }

    public void test(int a, String b){
        System.out.println("4th method");
    }

    public void test(String a, int b){ //switched parameters, still usable.
        System.out.println("5th method");
        System.out.println(a);
        System.out.println(b);
    }
}
