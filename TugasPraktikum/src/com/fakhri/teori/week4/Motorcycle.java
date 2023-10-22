package com.fakhri.teori.week4;

public class Motorcycle extends Vehicle {
    // set attributes motorcycle
    protected String transmissionType;

    // set constructor motorcycle
    public Motorcycle(String brand, String color, String type, String transmissionType) {
        super(brand, color, type);
        this.transmissionType = transmissionType;
    }

    // override method displayInfo from class Vehicle
    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Info");
        super.displayInfo();
        System.out.println("Transmission Type: " + this.transmissionType);
    }

    // set method toggleTransmission
    public void toggleTransmission(){
        System.out.println("Transmission not changed and still on " + this.transmissionType + " transmission");
    }

    // overloading method toggleTransmission with parameter transmission
    public void toggleTransmission(String transmission){
        System.out.println("Transmission changed to " + transmission);
    }

}
