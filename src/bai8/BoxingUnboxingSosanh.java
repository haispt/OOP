package bai8;

public class BoxingUnboxingSosanh {
    public static void main(String[] args) {
    	Integer x1 = 100;
		Integer y1 = 100;
		System.out.println(x1 == y1); // true (do nằm trong vùng cache -128 đến 127)
		
		Integer x2 = 200;
		Integer y2 = 200;
		System.out.println(x2 == y2); // false
		
		Integer x3 = 200;
		int y3 = 200; //
		System.out.println(x3 == y3); // true – auto-unboxing về cùng int để so sánh
		// cách so sánh đúng để không hiểu nhầm!
		System.out.println(x2.equals(y2)); // true - an toàn, tránh hiểu nhầm
	}
}

