package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtd = input.nextInt();
        input.nextLine();

        int[] vetor = new int[qtd];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("digite um número: ");
            vetor[i] = input.nextInt();
        }

        System.out.println();

        int num = 0;
        System.out.print("NÚMEROS PARES: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
                num++;
            }
        }

        System.out.println();

        System.out.print("QUANTIDADE DE PARES = " + num);

        input.close();
    }
}