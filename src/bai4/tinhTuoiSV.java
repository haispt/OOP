package bai4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class tinhTuoiSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập ngày sinh
        System.out.print("Nhập ngày sinh của sinh viên (yyyy-MM-dd): ");
        String input = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(input);

        // Lấy ngày hiện tại
        LocalDate today = LocalDate.now();

        // Tính tuổi
        Period age = Period.between(birthDate, today);
        int years = age.getYears();

        // Hiển thị kết quả
        System.out.println("Sinh viên sinh ngày: " + birthDate);
        System.out.println("Tuổi hiện tại: " + years + " tuổi");

        scanner.close();
    }
}

