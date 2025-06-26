package bai2;

import java.util.Scanner;

public class NhapLieuVaEpKieu {
	public static void main(String args[]) {
		Scanner nhaplieu = new Scanner(System.in);
		System.out.print("Nhập số a:");
		int a = nhaplieu.nextInt();
		System.out.print("Nhập số b:");
		int b = nhaplieu.nextInt();
		System.out.println("Chia a cho b: %f" + (double)a/b);

		System.out.print("Nhập vào 1 ký tự: ");
		char kytu = nhaplieu.next().charAt(0);
		System.out.println("Ky tu vua nhap la : " + kytu);
		
		System.out.print("Nhập xau: ");
		String input = nhaplieu.nextLine();
        
        // In xâu ký tự ra màn hình
        System.out.println("Xâu bạn vừa nhập là: " + input);
        nhaplieu.close();
	}
}
