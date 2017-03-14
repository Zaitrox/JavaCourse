public class BankAccount {

    // Constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Attributes
    private int accountNumber;
    private double balance;

    // Methods
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void confInfo() {
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Balance: " + this.getBalance());
    }

    public void withdraw(double amount) {
        double balance = this.getBalance();

        if((balance - amount) >= 0) {
            balance = balance - amount;
            this.setBalance(balance);
        }
    }

    public void deposit(double amount) {
        double balance = this.getBalance();

        balance = balance + amount;
        this.setBalance(balance);
    }

}
