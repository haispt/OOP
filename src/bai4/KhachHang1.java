package bai4;

//Lớp Hãng sản xuất
class HangSX {
	double tinh(int num, double gia) {
	     gia = gia / 2;
	     return num * gia; // Thay đổi 'gia' nhưng 'giaBan' thì không đổi
	}
}

//Lớp khách hàng
class KhachHang1 {
	public static void main(String[] args) {
		 HangSX banh = new HangSX(); // Tạo ra một đối tượng
		 int giaBan = 20;
		 double tien = banh.tinh(10, giaBan);
		
		 System.out.println("Gia ban: " + giaBan); // giaBan không đổi
		 System.out.println("Tien ban duoc: " + tien);
	}
}


