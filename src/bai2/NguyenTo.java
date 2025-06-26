package bai2;

import java.util.Scanner;

public class NguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        // Kiểm tra từ 2 đến căn bậc hai của n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // chia hết -> không phải nguyên tố
            }
        }
        return true; // không chia hết cho số nào -> là nguyên tố
    }
}