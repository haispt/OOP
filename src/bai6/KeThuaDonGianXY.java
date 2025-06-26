package bai6;

public class KeThuaDonGianXY {
	public static void main(String[] args) {
		Y obj = new X();
		obj.sayHello(); // Kết quả: Hello from X
	}
}

class Y {
    public void sayHello() {
        System.out.println("Hello from Y");
    }
}

class X extends Y {
    // Không ghi @Override cũng vẫn hợp lệ
    public void sayHello() {
        System.out.println("Hello from X");
    }
}