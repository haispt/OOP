package bai3;

import java.util.Scanner;

class Dog {
	
	//Thuộc tính
	public String ten;
	private int tuoi;
	private String giong;
	 
	// Phương thức sủa
	public int sua() {
	     System.out.println(ten + " sủa: Gâu gâu!");
	     return 1;
	}
	// Phương thức hiển thị thông tin
	public void hienThiThongTin() {
		System.out.println("----Thông tin về con chó ----");
		System.out.println("Tên của con chó:" + ten);
		System.out.println("Tuổi của con chó:" + tuoi);
		System.out.println("Giống chó:" + giong);
	}
	// Phương thức khởi tạo (hàm tạo - Contructor)
	Dog(){
		ten = "Vàng";
		tuoi = 2;
		giong = "Phú Quốc";
	}
	// Phương thức khởi tạo có 1 tham số
	Dog(String ten){
		this.ten = ten;
	}
	// Phương thức khởi tạo có 2 tham số
	Dog(String ten, int year){
		this.ten = ten;
		tuoi = year;
	}
	// Phương thức khởi tạo có 3 tham số
	Dog(String ten, int year, String gender){
		this.ten = ten;
		tuoi = year;
		giong = gender;
	}
	//Phương thức nhập dữ liệu từ bàn phím
	public void nhapThongTin() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào tên của con chó: ");
		ten = input.nextLine();
		System.out.print("Nhập vào tuổi của con chó: ");
		tuoi = input.nextInt();
		input.nextLine();
		System.out.print("Nhập vào giống chó: ");
		giong = input.nextLine();
	}
	
}


