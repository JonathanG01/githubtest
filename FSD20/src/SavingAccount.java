
public class SavingAccount implements IBankAccount {

	private double _balance;
    private  double _perDayLimit;

    @Override
    public boolean deposit(double amount) {
        _balance += amount;
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(_balance <amount){
            System.out.println("Insufficient balance!");
            return false;
        }
        // limit 5000
        else if(_perDayLimit + amount > 5000){
            System.out.println("withdraw attempt failed");
            return false;
        }
        else{
            _balance -= amount;
            _perDayLimit += amount;
            System.out.println("Successfully withdraw: "+ amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Saving Account Balance" + _balance);
    }
}
