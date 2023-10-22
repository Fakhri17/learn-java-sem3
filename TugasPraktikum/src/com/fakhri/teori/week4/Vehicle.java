package com.fakhri.teori.week4;

public class Vehicle {

    // set attributes vehicle
    protected String brand;
    protected String color;
    protected String type;

    // set constructor vehicle
    public Vehicle(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }


    // set method displayInfo
    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
    }
}
