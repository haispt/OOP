package bai7;

class PhuongTien {
	private String name;//Thuộc tính riêng tư
	protected int year;  //Thuộc tính bảo mật
	public double dungTichXiLanh; //Thuộc tính công khai
	
	void start() {
		System.out.println("Phương tiện giao thông đang khởi động");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}

interface DieuKhien { 
	void dichuyen();
}

interface BayVaLuon {
	void bayluon();
}

//Kết hợp kế thừa và triển khai giao diện
class FlyingCar extends PhuongTien implements DieuKhien, BayVaLuon {
	@Override
	public void dichuyen() {
		System.out.println("Chiếc xe bay đang di chuyển");
	}
	@Override
	public void bayluon() {
		System.out.println("Chiếc xe bay đang bay lượn");
	}
}

//Khai báo lớp main-chính để chạy hàm main trong cùng 1 file java
//Có thể tạo 1 file java riêng để viết hàm main chạy chương trình
public class KetHopKeThuaVaGiaoDien {
	public static void main(String[] args) {
		FlyingCar xebay = new FlyingCar();
		//xebay.name(); //Lỗi vì thuộc tính name là private
		xebay.getName();//Ok
		xebay.start();
		xebay.dichuyen();
		xebay.bayluon();
	}
}
