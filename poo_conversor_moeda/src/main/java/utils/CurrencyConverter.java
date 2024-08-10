package utils;

public class CurrencyConverter {

    public static double TAX = 6.00;

    public static double converter(double quotation, double currency) {
        return quotation * currency * (1 + (TAX /100));
    }

}
