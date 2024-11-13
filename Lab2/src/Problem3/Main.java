package Problem3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savings = new SavingsAccount(1001, 5.0);
        CheckingAccount checking = new CheckingAccount(1002);

        bank.addAccount(savings);
        bank.addAccount(checking);

        savings.deposit(1000);
        checking.deposit(500);
        checking.withdraw(100);

        bank.updateAccounts();

        System.out.println(savings);
        System.out.println(checking);
    }
}

