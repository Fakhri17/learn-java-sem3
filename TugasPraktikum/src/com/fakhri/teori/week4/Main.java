package com.fakhri.teori.week4;

public class Main {
    public static void main(String[] args) {

        // Create an instance of each class and call all the methods, including the methods from Vehicle class
        // Display all the information of each instance
        // override the displayInfo() method in each class to display all the information of each instance
        Vehicle vehicle = new Vehicle("Toyota", "Black", "Sedan");
        Vehicle car = new Car("Nissan", "Blue", "Sedan", 100);
        Vehicle bicycle = new Bicycle("Polygon", "Red", "Bicycle", 2);
        Vehicle motorcycle = new Motorcycle("Honda", "White", "Bebek", "Manual");
        Vehicle bus = new Bus("Hino", "Green", "UHD", "Jakarta - Bandung");
        Vehicle truck = new Truck("Mercedes", "White", "Tronton", true);

        // display all the information of each instance with for loop
        Vehicle[] vehicles = {vehicle, car, bicycle, motorcycle, bus, truck};
        for(Vehicle v : vehicles){
            v.displayInfo();
            System.out.println();
        }

        // overloading method all the methods in each class
        // call all the overloaded methods
        // Display all the information of each instance
        ((Car) car).refuel();
        ((Car) car).refuel(50);
        System.out.println();

        ((Bicycle) bicycle).changeGear();
        ((Bicycle) bicycle).changeGear(3);
        System.out.println();

        ((Motorcycle) motorcycle).toggleTransmission();
        ((Motorcycle) motorcycle).toggleTransmission("Automatic");
        System.out.println();

        ((Bus) bus).changeRoute();
        ((Bus) bus).changeRoute("Jakarta - Surabaya");
        System.out.println();

        ((Truck) truck).checkCargoStatus();
        ((Truck) truck).checkCargoStatus("Full");


    }
}
