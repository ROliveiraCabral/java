package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        int[] vetA = new int[qtd];
        int[] vetB = new int[qtd];
        int[] vetC = new int[qtd];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetB.length; i++) {
            vetB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vetC.length; i++) {
            System.out.println(vetC[i] = vetA[i] + vetB[i]);
        }

        sc.close();
    }
}
