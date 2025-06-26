package bai4;
import java.util.*;

//Môn học:
class MonHoc {
  private String maMon;
  private String tenMon;
  private double diem;

  public MonHoc(String maMon, String tenMon, double diem) {
      this.maMon = maMon;
      this.tenMon = tenMon;
      this.diem = diem;
  }

  // Getters & Setters
  public String getMaMon() { return maMon; }
  public String getTenMon() { return tenMon; }
  public double getDiem() { return diem; }

  public void setDiem(double diem) { this.diem = diem; }

  @Override
  public String toString() {
      return tenMon + " (" + maMon + ") - Điểm: " + diem;
  }
}

//Sinh viên
class SinhVien {
  private String maSV;
  private String hoTen;
  private String ngaySinh;
  private List<MonHoc> danhSachMonHoc;

  SinhVien(String maSV, String hoTen, String ngaySinh) {
      this.maSV = maSV;
      this.hoTen = hoTen;
      this.ngaySinh = ngaySinh;
      this.danhSachMonHoc = new ArrayList<>();
  }

  public void themMonHoc(MonHoc mon) {
      danhSachMonHoc.add(mon);
  }

  public double tinhDiemTrungBinh() {
      if (danhSachMonHoc.isEmpty()) return 0.0;
      double tong = 0;
      for (MonHoc mh : danhSachMonHoc) {
          tong += mh.getDiem();
      }
      return tong / danhSachMonHoc.size();
  }

  // Getters & toString
  public String getMaSV() { return maSV; }
  public String getHoTen() { return hoTen; }

  @Override
  public String toString() {
      return maSV + " - " + hoTen + " - " + ngaySinh + " - ĐTB: " + tinhDiemTrungBinh();
  }
}

// Lớp học
class LopHoc {
    private String tenLop;
    private List<SinhVien> danhSachSV;

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.danhSachSV = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sv) {
        danhSachSV.add(sv);
    }

    public void hienThiDanhSach() {
        System.out.println("Danh sách lớp: " + tenLop);
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv);
        }
    }

    public List<SinhVien> getDanhSachSV() {
        return danhSachSV;
    }
}

//Học kỳ
class HocKy {
    private String tenHocKy;
    private List<MonHoc> danhSachMonHoc;

    public HocKy(String tenHocKy) {
        this.tenHocKy = tenHocKy;
        this.danhSachMonHoc = new ArrayList<>();
    }

    public void themMonHoc(MonHoc mh) {
        danhSachMonHoc.add(mh);
    }

    public List<MonHoc> getDanhSachMonHoc() {
        return danhSachMonHoc;
    }

    @Override
    public String toString() {
        return "Học kỳ: " + tenHocKy + " với " + danhSachMonHoc.size() + " môn học.";
    }
}

//quản lý sinh viên:
class QLSinhVien {
    private List<LopHoc> danhSachLop;

    public QLSinhVien() {
        this.danhSachLop = new ArrayList<>();
    }

    public void themLop(LopHoc lop) {
        danhSachLop.add(lop);
    }

    public void hienThiTatCaSinhVien() {
        for (LopHoc lop : danhSachLop) {
            lop.hienThiDanhSach();
        }
    }
}

// Chương trình chính
public class quanlySinhVien { 
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("SV001", "Nguyen Van A", "2002-01-01");
        sv1.themMonHoc(new MonHoc("ENG301", "Ngoại ngữ 1", 8.0));
        sv1.themMonHoc(new MonHoc("MHH112", "Nhập mon lập trình", 7.5));

        SinhVien sv2 = new SinhVien("SV002", "Le Thi B", "2002-02-02");
        sv2.themMonHoc(new MonHoc("OOP012", "Lập trình hướng đối tượng", 9.0));
        sv2.themMonHoc(new MonHoc("IIT103", "Tin đại cương", 8.5));

        LopHoc cntt23L = new LopHoc("CTTK23G");
        cntt23L.themSinhVien(sv1);
        cntt23L.themSinhVien(sv2);

        QLSinhVien ql = new QLSinhVien();
        ql.themLop(cntt23L);

        ql.hienThiTatCaSinhVien();
    }
}



