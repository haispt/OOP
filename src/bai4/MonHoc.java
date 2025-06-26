package bai4;

class MonHoc2 {
	//Khai báo thuộc tính
	public String maMon;
	public String tenMon;
	public double diemTB;
	public int soTC;
	
	//Khai báo phương thức
	
	//Hàm tạo
	MonHoc2(){
		maMon = "OOP231";
		tenMon = "Lập trình HĐT";
		soTC = 3;
		diemTB = 8.8;
	}
	//Hàm tạo có tham số
	MonHoc2(String maMon, String tm, int soTC, double diem){
		this.maMon = maMon;
		tenMon = tm;
		this.soTC = soTC;
		this.diemTB = diem;
	}
	//Hàm hiển thị môn học
	public void hienthiMonHoc() {
		System.out.println("Mã môn:" + maMon );
		System.out.println("Tên môn:" + tenMon );
		System.out.println("Số tín chỉ:" + soTC );
		System.out.println("Điểm số:" + diemTB );
	}
	// Hàm có kiểu trả về
	protected int kiemtraSoTC() {
		return soTC;
	}
	
	// Hàm có kiểu trả về
	protected double getDiemTB() {
		return diemTB;
	}
	
}


