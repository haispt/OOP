package bai5;

import java.io.*;
import java.util.Scanner;

public class vidu1 {
	public static void main(String arg[]) {
		int x, fx;
		Scanner  inputData = new Scanner(System.in); 		
		System.out.print("Nhap x: ");
		x = inputData.nextInt();
		fx  = 10/x;
		System.out.println ("f(x) = " + fx);
	}
}
