package bai5;

import java.util.InputMismatchException;
import java.util.Scanner;


//DivisionExample
public class baitap1Ver2 {
	public static void main(String[] args) {
        int a = 0, b = 0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập số nguyên a:");
            a = nhapSo(scanner);
            System.out.println("Nhập số nguyên b:");
            b = nhapSo(scanner);
            result = a / b;
            System.out.println("Kết quả a / b = " + result);
        } 
        catch (InputMismatchException e) {
            System.out.println("--aaaa--Lỗi: Bạn phải nhập số nguyên!");     
        }
        
        catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0!");
            result=0;
        }
    }
    
    public static int nhapSo(Scanner scanner) {
    	while (true)
	    	try {
	            System.out.print("Nhập số nguyên:");
	            return scanner.nextInt();
	        } 
	        catch (InputMismatchException e) {
	            System.out.println("Lỗi, xin mời nhập lại: Bạn phải nhập số nguyên!");
	            scanner.nextLine(); //Xóa dữ liệu sai
	        }

    }
}

