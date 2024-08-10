package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int num = sc.nextInt();

        String[] vetNomes = new String[num];
        double[] vetNota1 = new double[num];
        double[] vetNota2 = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            sc.nextLine();
            vetNomes[i] = sc.nextLine();
            vetNota1[i] = sc.nextDouble();
            vetNota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < num; i++) {
            double media = (vetNota1[i] + vetNota2[i]) / 2.0;
            if (media >= 6.0) {
                System.out.println(vetNomes[i]);
            }
        }

        sc.close();
    }
}
