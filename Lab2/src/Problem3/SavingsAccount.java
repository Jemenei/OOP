package Problem3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        deposit(getBalance() * interestRate / 100);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + "accNumber=" + getAccountNumber() + ", balance=" + getBalance() +
                ", interestRate=" + interestRate + '}';
    }
}

