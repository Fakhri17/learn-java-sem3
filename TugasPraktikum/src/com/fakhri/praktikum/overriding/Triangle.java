package com.fakhri.praktikum.overriding;

public class Triangle extends Shape{
    private int alas;
    private int tinggi;

    public Triangle(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    public double calculateArea() {
        return 0.5 * alas * tinggi;
    }
}
