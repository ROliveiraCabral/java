package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.removeIf(new ProductPredicate());
        //list.removeIf(Product::staticProductPredicate);
        //list.removeIf(Product::nonStaticProductPredicate);

        double min = 100.00;
       // Predicate<Product> predicate = p -> p.getPrice() >= min;

        list.removeIf( p -> p.getPrice() >= min);

        list.forEach(System.out::println);
    }
}
