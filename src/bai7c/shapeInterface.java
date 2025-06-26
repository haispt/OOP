package bai7c;

import java.util.*;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle ⭕");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle ▭");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle 🔺");
    }
}

public class shapeInterface {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());

        for (Shape shape : shapes) {
            shape.draw(); // Gọi phương thức polymorphic
        }
    }
}

