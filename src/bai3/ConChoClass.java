package bai3;

public class ConChoClass{
	public static void main(String[] args) {
		ConCho conchoA = new ConCho();
		conchoA.ten = "Milu";
		conchoA.sua();
		conchoA.chayNhanh();
	
		//System.out.println("");
	}
	
}

class ConCho {
    String ten;
    String mauLong;
    double canNang;

    void sua() {
        System.out.println("Gâu gâu!");
    }

    void chayNhanh() {
        System.out.println(ten + " đang chạy nhanh!");
    }
}

