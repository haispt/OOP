package bai6a;

public class DongVatCoKeThua {
	//Do Something - MainClass
}
//Lớp trừu tượng Animal tái sử dụng hành vi dùng chung
abstract class Animal {
	 public void eat() {
	     System.out.println(getClass().getSimpleName() + " is eating.");
	 }

	 public abstract void makeSound();
}

//Các lớp con kế thừa Animal và chỉ cần định nghĩa makeSound()
class Dog extends Animal {
	 public void makeSound() {
	     System.out.println("Dog says: Woof!");
	 }
}

class Wolf extends Animal {
	 public void makeSound() {
	     System.out.println("Wolf says: Howl!");
	 }
}

class Cat extends Animal {
	 public void makeSound() {
	     System.out.println("Cat says: Meow!");
	 }
}

class Tiger extends Animal {
	 public void makeSound() {
	     System.out.println("Tiger says: Grrr!");
	 }
}

class Lion extends Animal {
	 public void makeSound() {
	     System.out.println("Lion says: Roar!");
	 }
}

class Hippo extends Animal {
	 public void makeSound() {
	     System.out.println("Hippo says: Grunt!");
	 }
}
