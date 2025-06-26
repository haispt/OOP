package bai4;

abstract class Animal {
    private String name;
    public Animal(String name) {  // Phương thức khởi tạo
    	this.name = name;
    }
    public void setName(String name) {  //Phương thức thực thể
        this.name = name;
    }
    public String getName() {   //Phương thức thực thể
        return name;
    }
    public abstract void makeSound();  // Phương thức trừu tượng
    public void displayInfo() { // Phương thức nạp chồng
    	System.out.println("Name: " + name);
    }
    public void displayInfo(boolean showSound) { // Phương thức nạp chồng
    	System.out.println("Name: " + name);
        if (showSound) 
        {  
        	makeSound();        
        }
    }
}

//Lớp con kế thừa từ Animal
class Dog extends Animal {
	// Phương thức khởi tạo (Constructor)
	public Dog(String name) {
		super(name); // Gọi phương thức khởi tạo của lớp cha
	}
	// Phương thức viết đè (Overridden Method)
	@Override
	public void makeSound() {
		System.out.println("Woof!");
	}
	// Phương thức nạp chồng (Overloaded Method) trong lớp con
	public void displayInfo(String extraInfo) {
		super.displayInfo();
		System.out.println("Extra Info: " + extraInfo);
	}
	// Phương thức tĩnh (Static Method) trong lớp con
	public static void printGreeting() {
		System.out.println("Hello from the Dog class!");
	}
}

public class phuongthuc { //Main-class Lớp Chính
    public static void main(String[] args) {
        // Gọi phương thức tĩnh từ lớp con
        Dog.printGreeting();
        // Tạo đối tượng của lớp Dog
        Dog myDog = new Dog("Buddy");
        // Gọi phương thức thông thường
        myDog.displayInfo();
        myDog.displayInfo(true);
        // Gọi phương thức thực thể
        myDog.setName("Jenny");
        // Gọi phương thức nạp chồng
        myDog.displayInfo("Loves to play fetch!");
        // Gọi phương thức viết đè
        myDog.makeSound();
    }
}


