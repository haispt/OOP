package bai4;
//Lớp khách hàng
class KhachHang2 {
	public static void main(String[] args) {
	     Banh banhMoi = new Banh(); // (1) Tạo ra một đối tượng
	     System.out.println("Nhoi thit vao banh truoc khi nuong: " + banhMoi.thit);
     
	     nuong(banhMoi); // (2) Nướng bánh
		 System.out.println("Thit cua banh sau khi nuong: " + banhMoi.thit);
	}
	// (3) Hàm nướng bánh
	public static void nuong(Banh banhNuong) {
	     banhNuong.thit = "Thit vit"; // Đổi nhân thành thịt vịt
	     banhNuong = null; // (4) Gán null cho biến tham chiếu
	}
}
//Lớp Banh (5)
class Banh {
	String thit = "Thit ga"; // Quy định của hãng: làm bánh nhân thịt gà
}
