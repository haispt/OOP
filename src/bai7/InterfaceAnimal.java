package bai7;

//Interface định nghĩa hành vi có thể bay
interface Flyable {
	//Không chứa bất kỳ contructor nào!
	//String hangSanXuat;//Lỗi - Không chứa biến
	//int yearProduction;//Lỗi
	void fly(); // phương thức trừu tượng
	void stop(); // Bắt buộc phải triển khai
}

//Lớp Bird triển khai interface Flyable
class Bird implements Flyable {
	@Override
	public void fly() {
	     System.out.println("Con chim bay bằng cách vỗ đôi cánh của nó.");
	}
}

//Lớp Airplane triển khai interface Flyable
class Airplane implements Flyable {
	@Override
	public void fly() {
	     System.out.println("Máy bay bay bằng động cơ và cánh.");
	}
}

//Lớp Main để chạy chương trình
public class InterfaceAnimal {
	public static void main(String[] args) {
	     //Flyable sparrow = new Bird(); 
		 Bird sparrow = new Bird(); 
	     Flyable boeing = new Airplane(); 
	
	     sparrow.fly();
	     boeing.fly();
	 }
}
