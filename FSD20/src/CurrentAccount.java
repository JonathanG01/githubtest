
public class CurrentAccount implements IBankAccount{
	private double _balance;

    @Override
    public boolean deposit(double amount) {
       _balance += amount;
       return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(_balance < amount){
            System.out.println("insufficient balance!");
            return false;
        }else{
            _balance -= amount;
            System.out.println("successfully withdraw: "+ amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Current Account Balance" + _balance);
    }
}
