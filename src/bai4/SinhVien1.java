package bai4;

import java.util.*;

class SinhVien1 {
	//Thuộc tính
	private String maSV;
	private String hoTen;
	private String ngaySinh; //Định dạng yyyy-MM-dd
	private List<MonHoc2> danhsachMonhoc;
	
	// Phương thức
	// Hàm tạo
	SinhVien1(){
		 this.maSV = "DTC1234";
	     this.hoTen = "Nguyễn Văn An";
	     this.ngaySinh = "10";
	     this.danhsachMonhoc = new ArrayList<>();
	}
	//Hàm tạo có tham số
	SinhVien1(String maSV, String hoTen, String ngaySinh){
		 this.maSV = maSV;
	     this.hoTen = hoTen;
	     this.ngaySinh = ngaySinh;
	     //this.danhsachMonhoc.add(mh);
	}
	//them Mon Hoc cho sinh viên
	public void themMonHoc(MonHoc2 mon) {
		danhsachMonhoc.add(mon);
	}
	//Hàm hiển thị môn học
	public void hienthiSinhVien() {
		System.out.println("Mã maSV:" + maSV );
		System.out.println("Tên sv:" + hoTen );
		System.out.println("Ngày sinh:" + ngaySinh );
		System.out.println("Học môn:" + danhsachMonhoc );
	}
	
	public static void main(String[] args) {
		SinhVien1 sv = new SinhVien1();
		//sv.hienthiSinhVien();
		
		MonHoc2 mh = new MonHoc2();
		mh.hienthiMonHoc();
		
		SinhVien1 sv2 = new SinhVien1("Văn A","CNTTK23L","2005-5-06");
		sv2.themMonHoc(mh);
		sv2.hienthiSinhVien();
	}
}

class chuongtrinh {
	//Chương trình
//	public static void main(String[] args) {
//		SinhVien1 sv = new SinhVien1();
//		sv.hienthiSinhVien();
//	}
}
