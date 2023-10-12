package fakhri.oop.polymorphisme;

public class Coba {
    public static void main(String[] args) {
        Employee e = new Employee("Fakhri");
        e.sayHello("Budi");

        e = new Manager("Fakhri");
        e.sayHello("Budi");

        e = new VicePresident("Fakhri");
        e.sayHello("Budi");



    }
}
