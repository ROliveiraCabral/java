package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int num = input.nextInt();
        input.nextLine();

        double[] vet = new double[num];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = input.nextDouble();
        }

        double soma = 0.0;
        System.out.print("VALORES = ");

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
            soma += vet[i];
        }

        System.out.println();
        System.out.printf("SOMA = %.2f%n", soma);

        double media = soma / vet.length;

        System.out.printf("MEDIA = %.2f%n", media);

        input.close();
    }
}
