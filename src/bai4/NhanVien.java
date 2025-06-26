package bai4;

import java.util.Scanner;

public class NhanVien {
    // 1. Các thuộc tính riêng tư
    private String maNV;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;

    // 2. Constructor (phương thức khởi tạo)
    public NhanVien() {}

    public NhanVien(String maNV, String hoTen, String ngaySinh, String diaChi) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    // 2. Getter và Setter cho từng thuộc tính
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    // 3. Phương thức nhập dữ liệu nhân viên
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã NV: ");
        maNV = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }

    // 3. Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Địa chỉ: " + diaChi);
    }

    // 4. Nạp chồng phương thức tính lương
    public double tinhLuong() {
        double luongCoBan = 5000000;
        return luongCoBan;
    }

    public double tinhLuong(double thuong) {
        double luongCoBan = 5000000;
        return luongCoBan + thuong;
    }

    // 5. Phương thức tĩnh hiển thị quy định
    public static void hienThiQuyDinh() {
        System.out.println("Quy định tính lương: Lương cơ bản 5,000,000 VND.");
        System.out.println("Nếu có thưởng, lương = lương cơ bản + thưởng.");
    }

    // Hàm main để test
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.nhapThongTin();
        nv.hienThiThongTin();

        System.out.println("Lương cơ bản: " + nv.tinhLuong());
        System.out.println("Lương có thưởng: " + nv.tinhLuong(2000000));
        NhanVien.hienThiQuyDinh();
    }
}
