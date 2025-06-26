package bai8;

import java.util.Scanner;

public class QLKHMainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng khách hàng: ");
        int n = Integer.parseInt(scanner.nextLine());

        QLKhachHang ql = new QLKhachHang(n);
        ql.nhapDanhSach();

        System.out.println("\n=== DANH SÁCH BAN ĐẦU ===");
        ql.hienThiDanhSach();

        System.out.println("\n=== DANH SÁCH SAU KHI SẮP XẾP GIẢM DẦN THEO TUỔI ===");
        ql.sapXepGiamDanTheoTuoi();
        ql.hienThiDanhSach();
        

        System.out.print("\nNhập tên cần tìm: ");
        String tenTim = scanner.nextLine();
        ql.timKiemTheoTen(tenTim);
    }
}
