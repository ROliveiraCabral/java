package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        String[] vetNomes = new String[num];
        int[] vetIdades = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            vetNomes[i] = scanner.nextLine();
            System.out.print("Idade: ");
            vetIdades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        String nomeMaisVelho = vetNomes[0];
        int idadeMaisVelho = vetIdades[0];

        for (int i = 1; i < num; i++) {
            if (vetIdades[i] > idadeMaisVelho) {
                nomeMaisVelho = vetNomes[i];
                idadeMaisVelho = vetIdades[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);
        System.out.println("IDADE: " + idadeMaisVelho);

        scanner.close();
    }
}
