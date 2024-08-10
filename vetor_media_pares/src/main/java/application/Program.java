package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int num = input.nextInt();
        input.nextLine();

        int[] vet = new int[num];
        double mediaPares = 0.0;
        int qtdPares = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = input.nextInt();
            if (vet[i] % 2 == 0) {
                mediaPares += vet[i];
                qtdPares++;
            }
        }

        if (mediaPares == 0.0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            mediaPares /= qtdPares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
        }

        input.close();
    }
}