package bai3;

//Lớp public phải có tên trùng tên file
public class LopChinh { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog conchoA = new Dog();
		conchoA.hienThiThongTin();
		Dog conchoCuaTra = new Dog("Tra's Dog");
		//conchoCuaTra.hienThiThongTin();
		Dog conchoCuaTai = new Dog("Misa", 2, "Pitpull");
		//conchoCuaTai.hienThiThongTin();	
		
		Dog conchoB = new Dog();
		// Nhập thông tin từ bàn phím
		conchoB.nhapThongTin();
		//Hiển thị thông tin con chó được nhập từ bàn phím
		conchoB.hienThiThongTin();
		// Ok - Vì ten là thuộc tính public
		conchoB.ten = "Pluto";
		// Not Ok - Vì tuổi của Dog là private
		//conchoB.tuoi = 2;
		
 	}

}
