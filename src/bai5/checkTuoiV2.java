package bai5;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class checkTuoiV2 {
    // Phương thức nhập tuổi và ném ngoại lệ nếu tuổi không hợp lệ
    public static int nhapTuoi() throws InvalidAgeException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi nhân viên: ");
        int tuoi = scanner.nextInt();

        if (tuoi < 0 || tuoi > 62) {
            throw new InvalidAgeException("Tuổi không hợp lệ! Tuổi phải từ 0 đến 62.");
        }

        return tuoi;
    }

    public static void main(String[] args) {
        try {
            int tuoi = nhapTuoi();  // Gọi phương thức có thể ném ngoại lệ
            System.out.println("Tuổi hợp lệ: " + tuoi);

        } catch (InvalidAgeException e) {
            System.out.println("Lỗi kiểm tra tuổi: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Bạn phải nhập số nguyên!");
            System.exit(1);

        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        }
    }
}
