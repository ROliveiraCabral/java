package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n) ");
        char response = sc.next().charAt(0);

        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: " + account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);

        System.out.println();
        System.out.println("Update account data: " + account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);

        System.out.println();
        System.out.println("Update account data: " + account);

        sc.close();
    }
}
