package application;

import service.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many values? ");
        int n = scanner.nextInt();

        //PrintService<Integer> printService = new PrintService<>();
        PrintService<String> printService = new PrintService<>();


        for (int i = 0; i < n; i++) {
            printService.addValues(scanner.next());
        }

        printService.print();
        printService.first();

        scanner.close();
    }
}
