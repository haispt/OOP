package bai2;

import java.util.Scanner;

public class nhapXauKyTu {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Vui lòng nhập xâu ký tự: ");
        
        String xauKyTu = scanner.nextLine();
        
        System.out.println("Xâu ký tự bạn vừa nhập là: " + xauKyTu);
        
        scanner.close();
    }
}