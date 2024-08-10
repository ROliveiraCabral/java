package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of line: ");
        int lin = scanner.nextInt();
        System.out.print("Number of column: ");
        int col = scanner.nextInt();

        System.out.println("Fill: ");
        int[][] mtz = new int[lin][col];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                mtz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        System.out.print("Enter a number from the matrix: ");
        int num = scanner.nextInt();

        System.out.println();

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (mtz[i][j] == num) {
                    System.out.print("Position: " + i + "," + j);
                    System.out.println();

                    if (j - 1 >= 0) {
                        System.out.println("Left: " + mtz[i][j - 1]);
                    }
                    if (j + 1 < col) {
                        System.out.println("Right: " + mtz[i][j + 1]);
                    }
                    if (i - 1 >= 0) {
                        System.out.println("Up: " + mtz[i - 1][j]);
                    }
                    if (i + 1 < lin) {
                        System.out.println("Down: " + mtz[i + 1][j]);
                    }
                }
            }
            System.out.println();
        }

        System.out.println();

        scanner.close();
    }
}