package bai5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data1.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
