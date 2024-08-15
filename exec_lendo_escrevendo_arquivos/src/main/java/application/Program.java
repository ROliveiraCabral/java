package application;

import entity.Product;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        String inputPath = "/home/rocabral/Documentos/products.csv";
        String outputFolder = "/home/rocabral/Documentos/out";
        String outputPath = outputFolder + "/summary.csv";

        List<Product> products = readProductsFromCsv(inputPath);

        if (products != null) {
            createOutputFolder(outputFolder);
            writeSummaryToCsv(products, outputPath);
        }
    }

    private static List<Product> readProductsFromCsv(String path) {
        List<Product> products = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                products.add(new Product(name, price, quantity));
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return null;
        }

        return products;
    }

    private static void createOutputFolder(String folderPath) {
        Path path = Paths.get(folderPath);
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            System.out.println("Error creating output folder: " + e.getMessage());
        }
    }

    private static void writeSummaryToCsv(List<Product> products, String outputPath) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath))) {
            for (Product p : products) {
                bufferedWriter.write(p.getName() + ", " + p.getTotal());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing the file: " + e.getMessage());
        }
    }
}
