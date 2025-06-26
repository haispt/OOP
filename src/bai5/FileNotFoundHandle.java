package bai5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundHandle {
    public static void main(String[] args) {
        try {
            //File file = new File("data.txt"); //Đặt trong thư mục gốc của dự án
        	//File file = new File("src/data3.txt");      // nếu để trực tiếp trong src
        	File file = new File("src/bai5/data2.txt"); // nếu để trong thư mục con
        	//File file = new File("data.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: Không tìm thấy file!");
        }
    }
}
