package application;

import entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = scn.nextInt();

        System.out.print("Enter account holder: ");
        scn.nextLine();
        String ownerName = scn.nextLine();

        String opt;

        do {
            System.out.print("Is there an initial deposit (y/n)? ");
            opt = scn.nextLine();
        } while (!opt.equalsIgnoreCase("y") && !opt.equalsIgnoreCase("n"));

        if (opt.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scn.nextDouble();

            account = new Account(accountNumber, ownerName, initialDeposit);
        } else {
            account = new Account(accountNumber, ownerName);
        }

        System.out.println("\nAccount data:");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        account.deposit(scn.nextDouble());

        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(scn.nextDouble());

        System.out.println("Updated account data:");
        System.out.println(account);
    }
}
