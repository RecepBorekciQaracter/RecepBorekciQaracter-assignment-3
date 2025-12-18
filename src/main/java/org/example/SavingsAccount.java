package org.example;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder,
                          double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public SavingsAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public SavingsAccount(String accountNumber, String accountHolder, double interestRate) {
        super(accountNumber, accountHolder);
        this.interestRate = interestRate;
    }

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void applyMonthlyInterest(double interestRate) {
        balance = balance + (balance * interestRate);
    }

    @Override
    public String getAccountInfo() {
        StringBuilder sb = new StringBuilder();

        String currentInfo = super.getAccountInfo();

        sb.append(currentInfo);
        sb.append("Interest rate: ").append(interestRate).append("\n");

        return sb.toString();
    }
}
