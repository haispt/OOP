package bai8;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
	// Boxing: Từ int sang Integer
	int a = 5;
	
	
	Integer aWrapper = a;
	// Unboxing: Từ Integer sang int
	Integer bWrapper = new Integer(10);
	int b = bWrapper;
	System.out.println("Boxing: " + aWrapper);
	System.out.println("Unboxing: " + b);
	
	Integer x1 = 100;
	Integer y1 = 100;
	System.out.println(x1 == y1); // true (do nằm trong vùng cache -128 đến 127)
	
	Integer x2 = 200;
	Integer y2 = 200;
	System.out.println(x2 == y2); // false (vì là 2 đối tượng khác nhau)
	
	
    }
}
