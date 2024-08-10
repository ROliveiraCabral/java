package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = scanner.next().charAt(0);
            scanner.nextLine();

            if (type == 'i') {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                scanner.nextLine();
                TaxPayer individual = new Individual(name, anualIncome, healthExpenditures);
                list.add(individual);
            } else {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                scanner.nextLine();
                TaxPayer Company = new Company(name, anualIncome, numberOfEmployees);
                list.add(Company);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double sum = 0.0;

        for (TaxPayer taxPayer : list) {
            sum += taxPayer.tax();
            System.out.print(taxPayer);
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f%n", sum));

        scanner.close();
    }
}
