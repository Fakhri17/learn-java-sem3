package com.fakhri.praktikum.overriding;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // overriding method draw() dari class Shape
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }

    // overriding method calculateArea() dari class Shape
    @Override
    public double calculateArea() {
        return length * width;
    }
}
