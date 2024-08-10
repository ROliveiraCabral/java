package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int qtd = scanner.nextInt();

        double[] vetAlturas = new double[qtd];
        char[] vetGeneros = new char[qtd];
        int numerosHomens = 0;
        int numerosMulheres = 0;
        double mediaAlturaMulheres = 0.0;

        for (int i = 0; i < qtd; i++) {
            System.out.println("Altura da " + (i + 1) + "a pessoa: ");
            vetAlturas[i] = scanner.nextDouble();
            System.out.println("Genero da " + (i + 1) + "a pessoa: ");
            vetGeneros[i] = scanner.next().charAt(0);
            if (vetGeneros[i] == 'm') {
                numerosHomens++;
            } else {
                mediaAlturaMulheres += vetAlturas[i];
                numerosMulheres++;
            }
        }

        double maiorAltura = vetAlturas[0];
        for (int i = 1; i < qtd; i++) {
            if (vetAlturas[i] > maiorAltura) {
                maiorAltura = vetAlturas[i];
            }
        }

        double menorAltura = vetAlturas[0];
        for (int i = 1; i < qtd; i++) {
            if (vetAlturas[i] < menorAltura) {
                menorAltura = vetAlturas[i];
            }
        }


        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", (mediaAlturaMulheres / numerosMulheres));
        System.out.println("Numero de homens = " + numerosHomens);

        scanner.close();
    }
}
