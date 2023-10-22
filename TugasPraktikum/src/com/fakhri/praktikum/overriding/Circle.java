package com.fakhri.praktikum.overriding;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // overriding method draw() dari class Shape
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    // overriding method calculateArea() dari class Shape
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
