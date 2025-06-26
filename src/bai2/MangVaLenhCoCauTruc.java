package bai2;

import java.util.Scanner;

public class MangVaLenhCoCauTruc {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		//int n = 5; //Số phần tử của mạng
		//int [] mang = new int[n];
		int a[] = {12, 34, 0, 6, 7, 5, 45};
//		a[1]=12;
//		a[6]=12;
//		System.out.println("Kich thuoc cua mang a la: " + a.length);
//		System.out.println("Phần tử đầu tiên của mảng là: " + a[0]);
//		a[0]=30;
//		System.out.println("Phần tử đầu tiên của mảng sau khi thay đổi là: " + a[0]);
//		System.out.println("Phần tử cuối cùng của mảng là: " + a[6]);
		
		int n = 5; //Số phần tử của mạng
		int [] mang = new int[n];
		
		System.out.println("Nhap cac phan tu cua mang: ");
		for (int i=0; i<n;i++)
		{	
			System.out.println("Nhap phan tu thu " + i + ": ");
			mang[i]=input.nextInt();
		}
		System.out.println("Mang vua nhap la: ");
		
		for (int j=0;j<n;j++)
			System.out.print(mang[j] + " ");
		System.out.println("Do dai cua mang la: " + mang.length);
		
		input.close();
	}

}
