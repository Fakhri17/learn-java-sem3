package com.fakhri.teori.week4;

public class Truck extends Vehicle{
    // set attributes truck
    protected boolean hasCargo;

    // set constructor truck
    public Truck(String brand, String color, String type, boolean hasCargo) {
        super(brand, color, type);
        this.hasCargo = hasCargo;
    }

    // override method displayInfo from class Vehicle
    @Override
    public void displayInfo() {
        System.out.println("Truck Info");
        super.displayInfo();
        System.out.println("Has Cargo: " + this.hasCargo);
    }

    // set method checkCargoStatus
    public void checkCargoStatus(){
        System.out.println("Cargo is empty");
    }

    // overloading method checkCargoStatus with parameter cargo
    public void checkCargoStatus(String cargo){
        System.out.println("Cargo is " + cargo);
    }
}
