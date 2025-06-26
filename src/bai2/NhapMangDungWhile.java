package bai2;

import java.util.Scanner;

public class NhapMangDungWhile {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        int i = 0;
        while (i < n) {
            System.out.print("Nhập phần tử arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Các phần tử vừa nhập:");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
