package application;

import entity.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int num = scanner.nextInt();

        Rent[] vetRent = new Rent[10];

        for (int i = 0; i < num; i++) {
            scanner.nextLine();
            System.out.println("#" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            Integer room = scanner.nextInt();
            vetRent[room] = new Rent(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < vetRent.length; i++) {
            if (vetRent[i] != null) {
                System.out.println(vetRent[i].getRoom() + ": " + vetRent[i]);
            }
        }

        scanner.close();
    }
}
