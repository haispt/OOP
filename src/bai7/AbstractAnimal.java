package bai7;

//Lớp trừu tượng
abstract class Animal {
	
	String name;
	//Phương thức khởi tạo
	public Animal(String name) {
	     this.name = name;
	}

	// Phương thức trừu tượng (không có thân)
	public abstract void makeSound();
	
	// Phương thức trừu tượng (không có thân)
	public abstract void roam();

	// Phương thức thông thường
	public void eat() {
	     System.out.println(name + " đang ăn...");
	}
}

//Lớp con Dog
class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
	     System.out.println(name + " sủa gâu gâu!");
	}
}

//Lớp con Cat
class Cat extends Animal {
	public Cat(String name) {
	     super(name);
	}

	@Override
	public void makeSound() {
	     System.out.println(name + " kêu meo meo!");
	}
}

//Lớp chính để chạy chương trình - trong 1 file java
public class AbstractAnimal {
	 public static void main(String[] args) {
		 
		 //Tính đa hình
		 Animal myDog = new Dog("Đại Hoàng");
		 Animal myCat = new Cat("Tiểu Cường");
	
		 //Con chó kêu và ăn
	     myDog.makeSound();
	     myDog.eat();
	     //Con mèo kêu và ăn
	     myCat.makeSound();
	     myCat.eat();
 }
}
