package bai6;

class DongVat {
    void eat() {
        System.out.println("eating...");
    }
} 
class LopCho extends DongVat {
    void bark() {
        System.out.println("barking...");
    }
} 

class LopChoCon extends LopCho {
    void weep() {
        System.out.println("weeping...");
    }
} 
public class KethuaNhieuTang {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}


