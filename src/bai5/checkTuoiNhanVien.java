package bai5;

import java.util.Scanner;

public class checkTuoiNhanVien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập tuổi nhân viên: ");
            int age = scanner.nextInt();

            if (age < 0 || age > 62) {
                // Tạo và ném ngoại lệ
                throw new IllegalArgumentException("Tuổi không hợp lệ! Tuổi phải từ 0 đến 62.");
            }

            System.out.println("Tuổi hợp lệ: " + age);

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        scanner.close();
    }
    // Viết hàm riêng
    public static void checkAge(int age) {
        if (age < 0 || age > 62) {
            throw new IllegalArgumentException("Tuổi không hợp lệ! Tuổi phải từ 0 đến 62.");
        }
    }
}

