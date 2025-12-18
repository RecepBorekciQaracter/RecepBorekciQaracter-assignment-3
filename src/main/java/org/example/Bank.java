package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public double getBalance(String accountNumber) {
        double total = 0;

        for (BankAccount account : accounts) {
            total += account.getBalance();
        }

        return total;
    }

    public List<BankAccount> getAccountsWithBalanceGreaterThan(double balance) {
        List<BankAccount> filteredAccounts = new ArrayList<>();

        for (BankAccount account : accounts) {
            if (account.getBalance() > balance) {
                filteredAccounts.add(account);
            }
        }

        return filteredAccounts;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }


}
