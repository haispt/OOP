package bai9;

import java.util.Scanner;

public class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected double luongCB;

    // Constructor mặc định
    public NhanVien() {
    }

    // Constructor có tham số
    public NhanVien(String maNV, String tenNV, double luongCB) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
    }

    // Getters và Setters
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    // Phương thức nhập thông tin
    public void nhapTT(Scanner sc) {
        System.out.print("Nhập mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        tenNV = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        luongCB = Double.parseDouble(sc.nextLine());
    }

    // Ghi đè toString
    @Override
    public String toString() {
        return "Mã NV: " + maNV + ", Tên: " + tenNV + ", Lương CB: " + luongCB;
    }

    // Tính lương tổng
    public double tinhLuong() {
        return luongCB;
    }
}
