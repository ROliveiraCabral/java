package application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String folder = scanner.nextLine();

        File path = new File(folder);

        File folders[] = path.listFiles(File::isDirectory);

        System.out.println("Folders: ");
        for (File f : folders) {
            System.out.println(f);
        }

        System.out.println("Files: ");
        File files[] = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(path + "/subdir").mkdir();
        System.out.println("directory create successfully" + success);

        scanner.close();
    }
}
