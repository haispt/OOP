package bai2;

public class KieuDuLieuNguyenThuy {
    static int x, y;
    
    public static void main(String[] args) {
        x = 10;
        int chieurong;
        int chieudai;
        
        double a = 3.5;
        int b = (int)(a);
        System.out.println("Gia tri cua a la: " + a);
        System.out.println("Gia tri cua b la: " + b);
        y = 20;
        int z = x + y;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = x + y = " + z);
        System.out.println("So nho hon la so: " + Math.min(x, y));
        char c = 80;
        System.out.println("ky tu c la: " + c);
    }
}
