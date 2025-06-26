package bai8;

import java.util.Scanner;

public class KhachHang {
    private String maKhach;
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String soDienThoai;
    private String email;

    // Constructor mặc định
    public KhachHang() {}

    // Constructor đầy đủ
    public KhachHang(String maKhach, String hoTen, int tuoi, String diaChi, String soDienThoai, String email) {
        this.maKhach = maKhach;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    // Phương thức nhập thông tin khách hàng
    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập mã khách: ");
        maKhach = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        soDienThoai = scanner.nextLine();
        System.out.print("Nhập email: ");
        email = scanner.nextLine();
    }

    // Phương thức hiển thị thông tin khách hàng
    public void hienThiThongTin() {
        System.out.printf("Mã KH: %s | Họ tên: %s | Tuổi: %d | Địa chỉ: %s | SĐT: %s | Email: %s\n",
                maKhach, hoTen, tuoi, diaChi, soDienThoai, email);
    }

    // Getters
    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }
}
