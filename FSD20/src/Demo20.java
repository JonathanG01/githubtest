
public class Demo20 {//self note: ask for Demo20 review.

public static void main(String[] args) {
    IBankAccount savingAccount = new SavingAccount();
    IBankAccount currentAccount = new CurrentAccount();

    savingAccount.deposit(2000);
    savingAccount.withdraw(1000);
    savingAccount.getBalance();

    currentAccount.deposit(5000);
    currentAccount.withdraw(6000);
    currentAccount.withdraw(2000);
    currentAccount.getBalance();
}}
