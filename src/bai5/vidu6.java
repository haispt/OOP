package bai5;

class TuoiKhongHopLeException extends Exception {
	  // Construtor 1
      public TuoiKhongHopLeException(){} 
      // Construtor 2
      public TuoiKhongHopLeException(String message) {
		super(message);
		System.out.println("Ngoại lệ tự tạo!");
	}
}

public class vidu6 {
	public static void main(String[] args) {
		try {
			checkAge(15);
			//checkAge(19);
		}
		catch (TuoiKhongHopLeException e) {
			System.out.println("Ngoại lệ xảy ra: " + e.getMessage());
		}
	}
	public static void checkAge(int age) throws TuoiKhongHopLeException{
		if (age < 18) {
			throw new TuoiKhongHopLeException("Tuổi phải từ 18 trở lên để đăng ký.");
		} 
		else {
			System.out.println("Đăng ký thành công!");
		}
	}
}