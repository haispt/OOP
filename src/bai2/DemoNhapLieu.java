package bai2;

import java.util.Scanner;

public class DemoNhapLieu {
	public static void main(String[] args) {
		//go main sau do nhan CTRL+Space
		Scanner input = new Scanner(System.in);
		System.out.print("Hãy nhập số nguyên a: ");
		int a = input.nextInt();
		if (a>=0)
			//System.out.print("Số bạn vừa nhập vào là: " +a);
			System.out.print("a là số nguyên dương: " + a);
		else
			System.out.print("a là số nguyên âm: " + a);
		input.close(); // Không bắt buộc
	}
}
