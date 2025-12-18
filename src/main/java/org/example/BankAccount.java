package org.example;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

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

}
