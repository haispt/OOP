package bai2;

import java.util.Scanner;

public class LenhSwitch {
	public static void main(String ar[]) {
		Scanner scanner = new Scanner(System.in);
	
	    System.out.println("Nhập một số từ 1 đến 3:");
	    int number = scanner.nextInt();
	
	    switch (number) {
	        case 1:
	            System.out.println("Bạn đã chọn số 1");
	            break;
	        case 2:
	            System.out.println("Bạn đã chọn số 2");
	            break;
	        case 3:
	            System.out.println("Bạn đã chọn số 3");
	            break;
	        default:
	            System.out.println("Số bạn nhập không hợp lệ");
	            break;
	    }
	    scanner.close();
	}
}
