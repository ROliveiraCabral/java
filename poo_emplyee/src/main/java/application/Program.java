package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = input.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = input.nextDouble();
        System.out.print("Tax: ");
        employee.tax = input.nextDouble();

        System.out.println();
        System.out.printf("Employee: " + employee.name + ", " + "$ %.2f%n", employee.netSalary());

        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        System.out.println();
        double percentage = input.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.printf("Uodate data: " + employee.name + ", " + "$ %.2f%n", employee.netSalary());

        input.close();
    }
}