package bai8b;

public class KhachHang {
	//Khai báo thuộc tính
	private String maKH;
	private String hoTen;
	private int tuoi;
	private String diaChi;
	private String sdt;
	private String email;
	
	//Hàm tạo không tham số
	public KhachHang(){}
	
	//Hàm tạo có tham số
	public KhachHang(String maKH, String hoTen, int tuoi, String diaChi, String sdt, String email) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.email = email;
	}
	
	//Getters
	public String getHoTen() {
		return hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}
	
	//Hàm thông thường nhapThongTin, hienThiThongTin
	
	
	
}
