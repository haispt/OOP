package bai6;

class CayCoi {
    void noHoa() {
        System.out.println("Cây đang nở hoa");
    }
    void raQua() {
        System.out.println("Cây đang ra quả (kết trái)");
    }
    
} 
class CayPhuongVi extends CayCoi {
   @Override
	void noHoa() {
       System.out.println("Cây Phượng vĩ nở hoa đỏ thắm...");
   }  
} 

public class Kethua1 {
    public static void main(String args[]) {
        CayPhuongVi caypv = new CayPhuongVi();
        caypv.noHoa();
        caypv.raQua();
    }
}
