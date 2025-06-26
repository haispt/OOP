package bai7;

interface DiChuyen {
	void move();
}
interface BayLuon {
	void fly();
}
//"Đa kế thừa" bằng cách thực thi nhiều giao diện
class MayBay implements DiChuyen, BayLuon {
	@Override
	public void move() {
		System.out.println("Máy bay đang di chuyển (lăn bánh)");
	}
	@Override
	public void fly() {
		System.out.println("Máy bay đang bay");
	}
}

public class TrienKhaiNhieuGiaoDien {
	public static void main(String args[]) {
		MayBay Airbus = new MayBay();
		Airbus.move();
		Airbus.fly();
	}
}