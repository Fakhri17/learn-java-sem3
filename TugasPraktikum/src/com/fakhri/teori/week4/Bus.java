package com.fakhri.teori.week4;

public class Bus extends Vehicle {

    // set attributes bus
    protected String route;

    // set constructor bus
    public Bus(String brand, String color, String type, String route) {
        super(brand, color, type);
        this.route = route;
    }

    // override method displayInfo from class Vehicle
    @Override
    public void displayInfo() {
        System.out.println("Bus Info");
        super.displayInfo();
        System.out.println("Route: " + this.route);
    }

    // set method changeRoute
    public void changeRoute(){
        System.out.println("Route not changed and still on " + this.route);
    }

    // overloading method changeRoute with parameter route
    public void changeRoute(String route){
        System.out.println("Route changed to " + route);
    }

}
