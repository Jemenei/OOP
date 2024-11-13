package Problem3;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void updateAccounts() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
            }
        }
    }

    public Account getAccount(int accNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accNumber) {
                return account;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" + "accounts=" + accounts + '}';
    }
}

