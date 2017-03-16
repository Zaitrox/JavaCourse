package javakurs;

public class SubAccount {
    private int accountNumber;
    private double balance;
    private Transaction last;

    public SubAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public class Transaction {
        private String name;
        private double amount;

        public Transaction(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String toString() {
            return accountNumber + ": " + name + " " + amount + ", Balance " + balance;
        }
    }

    public Transaction getLast() {
        return last;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        last = new Transaction("Deposit", amount);
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        last = new Transaction("Withdrawal", amount);
    }
}
