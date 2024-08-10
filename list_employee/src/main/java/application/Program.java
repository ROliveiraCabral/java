package application;

import entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        List<Employee> list = new ArrayList<>();

        System.out.println();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();
            scanner.nextLine();
            list.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int num = scanner.nextInt();
        scanner.nextLine();

        Employee employee = list.stream().filter(x -> x.getId().equals(num)).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            scanner.nextLine();
            employee.increaseSalary(percentage);
        }

        System.out.println();

        System.out.println("List of employees: ");
        for (Employee e : list) {
            System.out.println(e);
        }

        scanner.close();
    }
}
