package bai5;

import java.util.InputMismatchException;
import java.util.Scanner;

//DivisionExample
public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;

        try {
            System.out.print("Nhập số nguyên a: ");
            a = scanner.nextInt();

            System.out.print("Nhập số nguyên b: ");
            b = scanner.nextInt();

            int result = a / b;
            System.out.println("Kết quả a / b = " + result);

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Bạn phải nhập số nguyên!");

        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0!");
        }
        scanner.close();
    }
}

