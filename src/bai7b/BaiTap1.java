package bai7b;

//Giao diện định nghĩa hành vi có thể di chuyển trên mặt đất
interface Movable {
	 void move();
	 default void stop() {
	     System.out.println("Stopping the vehicle.");
	 }
}

//Giao diện định nghĩa hành vi có thể bay
interface Flyable {
	 void fly();
	 default void land() {
	     System.out.println("Landing the flying vehicle.");
	 }
}

//Lớp ô tô chỉ có thể đi
class Car implements Movable {
	 @Override
	 public void move() {
	     System.out.println("Car is moving on the road.");
	 }
}

//Lớp xe máy chỉ có thể đi
class Motorcycle implements Movable {
	 @Override
	 public void move() {
	     System.out.println("Motorcycle is moving on the road.");
	 }
}

//Lớp máy bay có thể đi và bay
class Airplane implements Movable, Flyable {
	 @Override
	 public void move() {
	     System.out.println("Airplane is taxiing on the runway.");
	 }

	 @Override
	 public void fly() {
	     System.out.println("Airplane is flying in the sky.");
	 }
}

public class BaiTap1 {
 public static void main(String[] args) {
     // Tạo các đối tượng phương tiện
     Movable car = new Car();
     Movable motorcycle = new Motorcycle();
     Airplane airplane = new Airplane();

     System.out.println("=== Car ===");
     car.move();
     car.stop();

     System.out.println("\n=== Motorcycle ===");
     motorcycle.move();
     motorcycle.stop();

     System.out.println("\n=== Airplane ===");
     airplane.move();     // Di chuyển trên đường băng
     airplane.fly();      // Bay lên
     airplane.land();     // Hạ cánh
     airplane.stop();     // Dừng lại
 }
}
