package bai5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class nhapTuoiVoiWhile {

    public static int nhapTuoi() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập tuổi nhân viên: ");
                int tuoi = scanner.nextInt();

                if (tuoi < 0 || tuoi > 62) {
                    throw new InvalidAgeException("Tuổi không hợp lệ! Tuổi phải từ 0 đến 62.");
                }
                return tuoi;  // Trả về nếu tuổi hợp lệ

            } 
            catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn phải nhập số nguyên!");
                scanner.nextLine();  // Xóa dữ liệu sai còn lại trong bộ nhớ đệm
            } catch (Exception e) {
                System.out.println("Lỗi không xác định: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        int tuoi = nhapTuoi();  // Gọi hàm nhập tuổi
        System.out.println("Tuổi hợp lệ: " + tuoi);
    }
}
