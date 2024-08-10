package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth Date (dd/mm/yyyy): ");
        Date birthDate = sdf.parse(scanner.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.nextLine());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int qtd = scanner.nextInt();

        for (int i = 0; i < qtd; i++) {
            scanner.nextLine();
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int itemQtd = scanner.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(itemQtd, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();

        System.out.println(order);
        scanner.close();
    }
}
