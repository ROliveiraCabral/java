package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        System.out.println();
        Product product = new Product(name, price, quantity);
        System.out.println("Product data" + product);

        System.out.println();
        Thread.sleep(3000);

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("updated data: " + product);

        System.out.println();
        Thread.sleep(3000);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("updated data: " + product);

        sc.close();
        Thread.sleep(3000);
    }
}
