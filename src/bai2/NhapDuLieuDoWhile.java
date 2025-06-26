package bai2;

import java.util.Scanner;

public class NhapDuLieuDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = 4;
		int [] arr = new int[n];
		int i=0;
		System.out.println("Nhap mang");
		do {
			System.out.print("Phan tu thu " + i +": ");
			arr[i++]= input.nextInt();
			if (i == 3)	break;
		}
		while (i<3);
		System.out.println("Cac phan tu cua mang vua nhap vao la:");
		for (i=0; i<n;i++)
			System.out.print(arr[i] + " ");
		input.close();	
	}

}
