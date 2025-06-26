package bai6;

class Animal {
	void eat() {
		System.out.println("Con vật đang ăn!");
	}
	void makeNoise() {
		System.out.println("Con vật đang kêu");
	}
}

class Dog extends Animal {
	
	//Phương thức viết đè - ở lớp con
	@Override
	void makeNoise() {
		System.out.println("Con chó đang sủa");
	}
	
}

class Cat extends Animal{
	String name;
	//Phương thức viết đè - ở lớp con 
	@Override 
	void eat() {
		System.out.println("Con mèo đang ăn cá rán");
	}
}

public class DemoKeThuaDongVat {
    public static void main(String args[]) {
        Dog concho = new Dog();
        concho.eat();
        concho.makeNoise();
        
        concho.toString();
        
        
    }
}

