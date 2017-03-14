package javakurs;

public class BankAccount {

    // Constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = "Standard Bank Account";
    }

    // Attributes
    private int accountNumber;
    private double balance;
    private String accountType;

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

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void confInfo() {
        System.out.println();
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Account type: " + this.accountType);
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
