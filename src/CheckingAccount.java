public class CheckingAccount extends BankAccount {
    private double limit;

    // Constructor
    public CheckingAccount(int accountNumber, double balance, double limit) {
        super(accountNumber, balance);
        this.limit = limit;
    }

    // Methods
    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        if(amount <= balance + limit) {
            balance = balance - amount;
            setBalance(balance);
        }
    }

    @Override
    public void confInfo() {
        super.confInfo();
        System.out.println("Limit: " + this.limit);
    }
}
