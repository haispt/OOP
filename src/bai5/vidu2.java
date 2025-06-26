package bai5;

//Ví dụ ngoại lệ 2

import java.util.*;
public class vidu2 {
	public static void main(String arg[]) {
		int x, fx;
		Scanner  inputData = new Scanner(System.in); 		
		System.out.print("Nhap x: ");
		try {
		    x = inputData.nextInt();
		    fx  = 10/x;
		}
		catch (ArithmeticException e) {
		    System.out.println ("Co loi xay ra chia cho 0");
		    fx=0;
		}
		catch (InputMismatchException e) {
			System.out.println("Aha có lỗi nhập ký tự" + e.getMessage());
			fx=0;
		}

		finally {
		      System.out.println ("luôn thuc hien");
		}
		System.out.println ("f(x) = " + fx);
	}
}
