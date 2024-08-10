package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtd = sc.nextInt();
        double[] vet = new double[qtd];

        double media = 0.0;
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
            media += vet[i];
        }

        media /= qtd;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < media) {
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}
