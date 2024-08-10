package application;

import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product;
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        double qtd = sc.nextDouble();

        for (int i = 1; i <= qtd; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("common, used or imported (c/u/i)? ");
            Character type = sc.next().charAt(0);
            sc.nextLine();
            if (type.equals('i')) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Custom fees: ");
                double customsFee = sc.nextDouble();
                product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            } else if (type.equals('c')) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                product = new Product(name, price);
                list.add(product);
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine(); // Consumir a nova linha pendente
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();
                LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                product = new UsedProduct(name, price, localDate);
                list.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
