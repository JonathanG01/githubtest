
public interface IBankAccount {
	boolean deposit(double amount);
    boolean withdraw(double amount);
    void getBalance();
    //self note: ask why boolean values.
}
