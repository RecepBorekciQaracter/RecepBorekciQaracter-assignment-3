package org.example;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected double balance;

    public BankAccount() {
        accountNumber = "Empty";
        accountHolder = "Empty";
        balance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        balance = 0.0;
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        accountHolder = "Empty";
        balance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InsufficientFundsException("Amount must be greater than zero.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InsufficientFundsException("Amount must be greater than zero.");
        } else if (amount > balance) {
            throw new InsufficientFundsException("You can't withdraw more than your balance.");
        }

        balance -= amount;
    }

    public void transferTo(BankAccount otherAccount, double amount) throws InsufficientFundsException {
        this.withdraw(amount);
        otherAccount.deposit(amount);
    }

    public String getAccountInfo() {
        StringBuilder sb = new StringBuilder();

        sb.append("Account Number: ").append(accountNumber).append("\n");
        sb.append("Account Holder: ").append(accountHolder).append("\n");
        sb.append("Balance: ").append(balance).append("\n");

        return sb.toString();
    }

}
