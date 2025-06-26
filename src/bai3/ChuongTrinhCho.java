package bai3;

import java.util.Scanner;

//Khai báo lớp Cho (Chó)
class Cho {
	 private String ten;
	 private int tuoi;
	 private String giong;
	 
	 //Hàm tạo trống - Contructor
	 Cho(){
		ten = "Vàng";
		tuoi = 2;
		giong = "Phú Quốc";
	 }
	 //Hàm tạo với 1 tham số
	 Cho(String t){
		ten = t;
	 }
	 //Hàm tạo với 2 tham số 
	 Cho(String t, int year){
		 ten = t;
		 tuoi = year;
	 }
	 //Hàm tạo có 3 tham số:
	 Cho(String t, int tuoi, String g){
		 ten = t;
		 this.tuoi = tuoi;
		 //this.tuoi = tuoi; //Từ khóa this!!
		 giong = g;
	 }
	 
	 // Phương thức nhập thông tin
	 public void nhapThongTin() {
	     Scanner scanner = new Scanner(System.in);
	     System.out.print("Nhập tên chó: ");
	     ten = scanner.nextLine();
	     System.out.print("Nhập tuổi chó: ");
	     tuoi = scanner.nextInt();
	     scanner.nextLine(); // Đọc bỏ dòng newline
	     System.out.print("Nhập giống chó: ");
	     giong = scanner.nextLine();
	 }

	 // Phương thức hiển thị thông tin
	 public void hienThiThongTin() {
	     System.out.println("\n--- Thông tin chó ---");
	     System.out.println("Tên   : " + ten);
	     System.out.println("Tuổi  : " + tuoi);
	     System.out.println("Giống : " + giong);
	 }

	 // Phương thức sủa
	 public void sua() {
	     System.out.println(ten + " sủa: Gâu gâu!");
	 }
}

//Lớp có phương thức main để chạy chương trình
public class ChuongTrinhCho {
	 public static void main(String[] args) {
	     // Tạo đối tượng chó
	     Cho chocuaTuanAnh = new Cho();
	     Cho chocuaPhuCuong = new Cho("Chó Cỏ");
	     Cho chocuaPhuongLan = new Cho("Milu",5);
	     Cho conchoThaiVinh = new Cho("Vện", 3, "Phú Quốc");      
	     
	     //conchoA.nhapThongTin();          // Nhập thông tin chó
	  // Hiển thị thông tin
	     chocuaTuanAnh.hienThiThongTin();     
	     chocuaPhuCuong.hienThiThongTin();
	     chocuaPhuongLan.hienThiThongTin();
	     conchoThaiVinh.hienThiThongTin();
	     //conchoA.sua();                   // Gọi chó sủa
	 }
}
