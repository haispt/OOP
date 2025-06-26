package bai8;

import java.util.Scanner;

public class QLKhachHang {
    private int soLuong;
    private KhachHang[] danhSach;

    public QLKhachHang(int soLuong) {
        this.soLuong = soLuong;
        danhSach = new KhachHang[soLuong];
    }

    // Nhập danh sách khách hàng
    public void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < soLuong; i++) {
            System.out.println("\nNhập thông tin khách hàng thứ " + (i + 1));
            danhSach[i] = new KhachHang();
            danhSach[i].nhapThongTin(scanner);
        }
    }

    // Hiển thị danh sách khách hàng
    public void hienThiDanhSach() {
        System.out.println("\n--- Danh sách khách hàng ---");
        for (int i = 0; i < soLuong; i++) {
            danhSach[i].hienThiThongTin();
        }
    }

    // Sắp xếp khách hàng theo tuổi giảm dần
    public void sapXepGiamDanTheoTuoi() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (danhSach[i].getTuoi() < danhSach[j].getTuoi()) {
                    KhachHang temp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = temp;
                }
            }
        }
    }

    // Tìm kiếm khách hàng theo tên
    public void timKiemTheoTen(String ten) {
        System.out.println("\n--- Kết quả tìm kiếm theo tên: " + ten + " ---");
        boolean timThay = false;
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getHoTen().toLowerCase().contains(ten.toLowerCase())) {
                danhSach[i].hienThiThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy khách hàng nào.");
        }
    }
}
