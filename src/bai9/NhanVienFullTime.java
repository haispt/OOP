package bai9;

import java.util.Scanner;

public class NhanVienFullTime extends NhanVien {
    private double thuong;
    private double phat;

    // Constructor
    public NhanVienFullTime() {
        super();
    }

    public NhanVienFullTime(String maNV, String tenNV, double luongCB, double thuong, double phat) {
        super(maNV, tenNV, luongCB);
        this.thuong = thuong;
        this.phat = phat;
    }

    // Getters và Setters
    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public double getPhat() {
        return phat;
    }

    public void setPhat(double phat) {
        this.phat = phat;
    }

    // Ghi đè phương thức nhập
    @Override
    public void nhapTT(Scanner sc) {
        super.nhapTT(sc);
        System.out.print("Nhập tiền thưởng: ");
        thuong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập tiền phạt: ");
        phat = Double.parseDouble(sc.nextLine());
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return super.toString() +
                ", Thưởng: " + thuong +
                ", Phạt: " + phat +
                ", Lương tổng: " + tinhLuong();
    }

    @Override
    public double tinhLuong() {
        return luongCB + thuong - phat;
    }
}
