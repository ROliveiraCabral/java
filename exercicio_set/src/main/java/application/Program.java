package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course A? ");
        number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            courseA.add(scanner.nextInt());
        }

        System.out.print("How many students for course B? ");
        number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            courseB.add(scanner.nextInt());
        }

        System.out.print("How many students for course C? ");
        number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            courseC.add(scanner.nextInt());
        }

        Set<Integer> students = new HashSet<>(courseA);
        students.addAll(courseB);
        students.addAll(courseC);
        
        System.out.println("Total students: " + students.size());

        scanner.close();
    }
}
