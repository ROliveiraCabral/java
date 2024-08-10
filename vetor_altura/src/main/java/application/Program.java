package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int num = sc.nextInt();
        sc.nextLine();

        Person[] vet = new Person[num];
        double sum = 0.0;

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();
            vet[i] = new Person(name, age, height);
            sum += vet[i].getHeight();
        }

        System.out.println();
        double avg = sum / vet.length;
        System.out.printf("Altura média: %.2f%n", avg);

        double qtd = 0.0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getAge() < 16) {
                qtd++;
            }
        }

        double percent = (qtd / vet.length) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getAge() < 16) {
                System.out.println(vet[i].getName());
            }
        }

        sc.close();
    }
}

