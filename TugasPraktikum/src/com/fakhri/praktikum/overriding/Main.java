package com.fakhri.praktikum.overriding;

public class Main {
    public static void main(String[] args) {
        double area;
        Shape shape = new Shape();
        Shape circle = new Circle(21);
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(10, 5);

        // manually declaration
        shape.draw();
        area = shape.calculateArea();
        System.out.println("Luas: " + area);
        System.out.println();

        circle.draw();
        area = circle.calculateArea();
        System.out.println("Luas: " + area);
        System.out.println();

        rectangle.draw();
        area = rectangle.calculateArea();
        System.out.println("Luas: " + area);
        System.out.println();

        triangle.draw();
        area = triangle.calculateArea();
        System.out.println("Luas: " + area);
        System.out.println();

        System.out.println("=====================================" );


        // using loop
        Shape[] shapes = {shape, circle, rectangle, triangle};
        for (Shape s : shapes) {
            s.draw();
            area = s.calculateArea();
            System.out.println("Luas: " + area);
            System.out.println();
        }

    }
}
