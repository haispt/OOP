package bai6;


class B {
    void msg() {
     class A {
    void msg() {
        System.out.println("Hello");
    }
}    System.out.println("Welcome");
    }
}

//Không hỗ trợ đa kế thừa
class C extends A,B{
	//to-do
}


public class MinhhoaErrorDaKethua extends A { 
	public static void main(String args[]) {
        //C obj = new C();
        //obj.msg();
    }
}
