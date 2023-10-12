package fakhri.oop.polymorphisme;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Employee " + this.name);
    }
}
