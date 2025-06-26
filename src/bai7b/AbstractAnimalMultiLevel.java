package bai7b;

public class AbstractAnimalMultiLevel {

}

//Lớp trừu tượng gốc
abstract class Animal {
	 public void eat() {
	     System.out.println(getClass().getSimpleName() + " is eating.");
	 }
	 public abstract void makeSound();
}

//Lớp trung gian: họ Mèo (Feline)
abstract class Feline extends Animal {
	 public void scratch() {
	     System.out.println(getClass().getSimpleName() + " is scratching with claws.");
	 }
}

//Lớp trung gian: họ Chó (Canine)
abstract class Canine extends Animal {
	 public void sniff() {
	     System.out.println(getClass().getSimpleName() + " is sniffing around.");
	 }
}

//Các lớp cụ thể kế thừa từ Feline
class Cat extends Feline {
	 @Override
	 public void makeSound() {
	     System.out.println("Cat says: Meow!");
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
