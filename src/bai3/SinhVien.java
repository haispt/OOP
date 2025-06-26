package bai3;
import java.util.Scanner;

class SV {
    private String hoTen;
    private String maSV;
    private int namSinh;

    // Hàm nhập thông tin sinh viên
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten sinh vien: ");
        hoTen = scanner.nextLine();

        System.out.print("Nhap ma sinh vien: ");
        maSV = scanner.nextLine();

        System.out.print("Nhap nam sinh: ");
        namSinh = scanner.nextInt();
    }

    // Hàm hiển thị thông tin sinh viên
    public void hienThiThongTin() {
        System.out.println("\n--- Thong tin sinh vien ---");
        System.out.println("Ho ten      : " + hoTen);
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Nam sinh    : " + namSinh);
    }
}

public class SinhVien {
    public static void main(String[] args) {
        SV sv = new SV();       // Tạo đối tượng sinh viên
        sv.nhapThongTin();      // Nhập thông tin
        sv.hienThiThongTin();   // Hiển thị thông tin
    }
}
