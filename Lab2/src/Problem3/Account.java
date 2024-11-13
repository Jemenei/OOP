package Problem3;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int accNumber) {
        this.balance = 0.0;
        this.accNumber = accNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if (amount > 0 && balance >= amount) {
            withdraw(amount);
            other.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "Account{" + "accNumber=" + accNumber + ", balance=" + balance + '}';
    }
}

