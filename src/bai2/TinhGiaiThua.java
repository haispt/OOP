package bai2;
import java.util.Scanner;
public class TinhGiaiThua {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập n
        System.out.print("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();
        // Kiểm tra n hợp lệ
        if (n < 0) {
            System.out.println("n phải là số nguyên dương!");
        } else {
            long giaiThua = 1;
            for (int i = 1; i <= n; i++) {
                giaiThua *= i;
            }
            System.out.println(n + "! = " + giaiThua);
        }
        scanner.close();
    }
}
//max21
