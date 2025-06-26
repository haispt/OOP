package bai5;

//Ví dụ ngoại lệ 3

import java.util.*;
public class vidu3 {
    public static void main(String arg[]) {
	int x, fx;
	Scanner  inputData = new Scanner(System.in); 		
	System.out.print("Nhap x: ");
	try {
	    x = inputData.nextInt();     
		fx  = 10/x;
	}
	catch (InputMismatchException e) {
	    System.out.println ("Loi nhap sai dinh dang "+e.getMessage());      
		fx=0;
	}
	catch (ArithmeticException e) {
	    System.out.println ("Loi chia cho 0 "+e.getMessage());
	    fx=1;
	}
	finally {     
		System.out.println ("Luon thuc hien");	}
		System.out.println ("f(x) = " + fx);
	}
}

