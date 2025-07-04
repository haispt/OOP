package bai9;

import java.util.*;

public class QL_NhanVien {
    private ArrayList<NhanVien> dsNV = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void nhapDanhSach() {
        int n = 0;
        while (true) {
            try {
                System.out.print("Nhập số nhân viên (2 <= n <= 100): ");
                n = Integer.parseInt(sc.nextLine());
                if (n < 2 || n > 100)
                    throw new IllegalArgumentException("Số lượng không hợp lệ.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng! Nhập số nguyên.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhân viên thứ " + (i + 1) + ":");
            System.out.print("Là nhân viên full-time? (y/n): ");
            String chon = sc.nextLine();
            NhanVien nv;
            if (chon.equalsIgnoreCase("y")) {
                nv = new NhanVienFullTime();
            } else {
                nv = new NhanVien();
            }
            nv.nhapTT(sc);
            dsNV.add(nv);
        }
    }

    public void sapXepGiamTheoLuong() {
        dsNV.sort((a, b) -> Double.compare(b.tinhLuong(), a.tinhLuong()));
    }

    public void hienThiDanhSach() {
        System.out.println("\n--- Danh sách nhân viên ---");
        for (NhanVien nv : dsNV) {
            System.out.println(nv);
        }
    }

    public static void main(String[] args) {
        QL_NhanVien ql = new QL_NhanVien();
        ql.nhapDanhSach();
        ql.sapXepGiamTheoLuong();
        ql.hienThiDanhSach();
    }
}
