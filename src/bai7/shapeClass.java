package bai7;

class Shape {
    void draw() {
        System.out.println("Vẽ hình");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Vẽ 1 hình tròn");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Vẽ 1 hình vuông");
    }
}

public class shapeClass {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw();  // Output: Vẽ 1 hình tròn
        s2.draw();  // Output: Vẽ 1 hình vuông
    }
}
