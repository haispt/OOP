package bai6c;

public class AnimalKeThuaNhieuTang {

}

//Lớp trừu tượng gốc
class Animal {
	 public void eat() {
	     System.out.println("The animal is eating.");
	 }

	 public void makeSound() {
		 System.out.println("The animal is eating.");
	 }; 
}

//Lớp trung gian: họ Mèo (Feline)
class Feline extends Animal {
	 public void scratch() {//cào cấu
	     System.out.println("The animal is scratching with claws.");
	 }
}

//Lớp trung gian: họ Chó (Canine)
class Canine extends Animal {
	 public void sniff() {//đánh hơi
	     System.out.println("The animal is sniffing around.");
	 }
}

//Các lớp cụ thể kế thừa từ Feline
class Cat extends Feline {
	 @Override
	 public void makeSound() {
	     System.out.println("Cat says: Meow!");//
	 }
}

class Tiger extends Feline {
	 @Override
	 public void makeSound() {
	     System.out.println("Tiger says: Grrr!");
	 }
}

class Lion extends Feline {
	 @Override
	 public void makeSound() {
	     System.out.println("Lion says: Roar!");
	 }
}

//Các lớp cụ thể kế thừa từ Canine
class Dog extends Canine {
	 @Override
	 public void makeSound() {
	     System.out.println("Dog says: Woof!");
	 }
}

class Wolf extends Canine {
	 @Override
	 public void makeSound() {
	     System.out.println("Wolf says: Howl!");
	 }
}
