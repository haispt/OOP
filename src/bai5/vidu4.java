package bai5;

public class vidu4 {
    public static void main(String[] args) {
        int so1;
        int so2;
    	
        //Todo- hàng trăm nghìn dòng
        
        //
        so1=10;
        so2=0;
        
    	try {
            divide(so1, so2);
            //divide(10, 2);
        } 
        catch (ArithmeticException e) {
            System.out.println("Không thể chia cho số 0!");
        }
    }
    public static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        //(*) Lệnh sau đây bị bỏ qua
        System.out.println("Kết quả là: " + result);
    }
}
