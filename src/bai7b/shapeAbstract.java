package bai7b;

import java.util.*;

abstract class Shape {
    protected String color = "black";

    public Shape() {} // Constructor mặc định

    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw(); // Phương thức trừu tượng
}

//Hình tròn
class Circle extends Shape {
    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle ⭕");
    }
}

class Rectangle extends Shape {
    public Rectangle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle ▭");
    }
}

class Triangle extends Shape {
    public Triangle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " triangle 🔺");
    }
}

class shapeAbstract {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("red"));
        shapes.add(new Rectangle("green"));
        shapes.add(new Triangle("blue"));

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
