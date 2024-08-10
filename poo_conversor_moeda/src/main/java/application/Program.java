package application;

import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double quotation, currency, totalValue;

        System.out.print("What is the dollar price? ");
        quotation = input.nextDouble();
        System.out.print("How many dollars will be bought? ");
        currency = input.nextDouble();

        totalValue = CurrencyConverter.converter(quotation, currency);

        System.out.printf("Amount to be paid in reais = R$ %.2f%n", totalValue);

        input.close();
    }
}
