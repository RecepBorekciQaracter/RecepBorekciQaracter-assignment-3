package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        boolean running = true;

        while (running) {
            System.out.println("1. Create Bank Account");
            System.out.println("2. Create Savings Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. Apply Monthly Interest");
            System.out.println("7. Show Account Info");
            System.out.println("8. Show Total Bank Balance");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {

                    case 1 -> {
                        System.out.print("Account number: ");
                        String num = sc.nextLine();
                        System.out.print("Holder name: ");
                        String name = sc.nextLine();
                        System.out.print("Initial balance: ");
                        double bal = sc.nextDouble();

                        bank.addAccount(new BankAccount(num, name, bal));
                        System.out.println("Account created.");
                    }

                    case 2 -> {
                        System.out.print("Account number: ");
                        String num = sc.nextLine();
                        System.out.print("Holder name: ");
                        String name = sc.nextLine();
                        System.out.print("Initial balance: ");
                        double bal = sc.nextDouble();
                        System.out.print("Interest rate: ");
                        double rate = sc.nextDouble();

                        bank.addAccount(new SavingsAccount(num, name, bal, rate));
                        System.out.println("Savings account created.");
                    }

                    case 3 -> {
                        System.out.print("Account number: ");
                        String num = sc.nextLine();
                        System.out.print("Amount: ");
                        double amt = sc.nextDouble();

                        bank.findAccount(num).deposit(amt);
                        System.out.println("Deposit successful.");
                    }

                    case 4 -> {
                        System.out.print("Account number: ");
                        String num = sc.nextLine();
                        System.out.print("Amount: ");
                        double amt = sc.nextDouble();

                        bank.findAccount(num).withdraw(amt);
                        System.out.println("Withdrawal successful.");
                    }

                    case 5 -> {
                        System.out.print("From account: ");
                        String from = sc.nextLine();
                        System.out.print("To account: ");
                        String to = sc.nextLine();
                        System.out.print("Amount: ");
                        double amt = sc.nextDouble();

                        bank.findAccount(from)
                                .transferTo(bank.findAccount(to), amt);
                        System.out.println("Transfer successful.");
                    }

                    case 6 -> {
                        System.out.print("Savings account number: ");
                        String num = sc.nextLine();

                        BankAccount acc = bank.findAccount(num);
                        if (acc instanceof SavingsAccount sa) {
                            sa.applyMonthlyInterest(8);
                            System.out.println("Interest applied.");
                        } else {
                            System.out.println("Not a savings account.");
                        }
                    }

                    case 7 -> {
                        System.out.print("Account number: ");
                        String num = sc.nextLine();
                        System.out.println(bank.findAccount(num).getAccountInfo());
                    }

                    case 8 -> {
                        System.out.println("Total bank balance: " +
                                bank.getBalance());
                    }

                    case 0 -> running = false;

                    default -> System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

        sc.close();
        System.out.println("Goodbye!");
    }
}
