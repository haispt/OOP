package bai3;

class BongDen{
	int soWatts; 
	boolean batTat;
	String viTri; 
	// Định nghĩa hàm tạo
	BongDen(){ 
		soWatts = 40; 
		batTat = true; 
		viTri = new String("XX"); 
	}
	// Định nghĩa hàm tạo có tham số
	BongDen(int w, boolean s, String v){
		soWatts = w; 
		batTat = s;
		viTri = new String(v);
	}
}

public class ToanTuTaoLap {
	public static void main(String[] args) {
		BongDen bongden1 = new BongDen();
		System.out.print(bongden1.soWatts);
	}
	
}
