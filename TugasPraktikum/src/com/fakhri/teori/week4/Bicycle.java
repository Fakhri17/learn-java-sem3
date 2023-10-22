package com.fakhri.teori.week4;

public class Bicycle extends Vehicle{
    // set attributes bicycle
    protected int numberGears;

    // set constructor bicycle
    public Bicycle(String brand, String color, String type, int numberGears) {
        super(brand, color, type);
        this.numberGears = numberGears;
    }

    // override method displayInfo from class Vehicle
    @Override
    public void displayInfo() {
        System.out.println("Bicycle Info");
        super.displayInfo();
        System.out.println("Number of Gears: " + this.numberGears);
    }

    // set method changeGear
    public void changeGear(){
        System.out.println("Gear no changed and still on " + this.numberGears + " gear");
    }

    // overloading method changeGear with parameter gear
    public void changeGear(int gear){
        System.out.println("Gear changed to " + gear);
    }
}
