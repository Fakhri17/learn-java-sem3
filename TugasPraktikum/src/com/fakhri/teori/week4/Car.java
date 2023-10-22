package com.fakhri.teori.week4;

public class Car extends Vehicle{
    // set attributes car
    protected int fuelLevel;

    // set constructor car
    public Car(String brand, String color, String type, int fuelLevel) {
        super(brand, color, type);
        this.fuelLevel = fuelLevel;
    }


    // override method displayInfo from class Vehicle
    @Override
    public void displayInfo() {
        System.out.println("Car Info");
        super.displayInfo();
        System.out.println("Fuel Level: " + this.fuelLevel);
    }

    // set method refuel
    public void refuel() {
        System.out.println("Fuel level not changed and still on " + this.fuelLevel + " liter");
    }

    // overloading method refuel with parameter fuel
    public void refuel(int fuel) {
        this.fuelLevel += fuel;
        System.out.println("Fuel level changed to " + this.fuelLevel + " liter");
    }

}
