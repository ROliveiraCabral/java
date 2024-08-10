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

        double[] vetor = new double[qtd];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("digite um número: ");
            vetor[i] = input.nextDouble();
        }

        System.out.println();

        double maiorValor = vetor[0];
        int posicaoMaiorValor = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaiorValor);

        input.close();
    }
}