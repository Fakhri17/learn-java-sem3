package fakhri.oop.interfaceoop;

public class AppInterface {
    public static void main(String[] args) {
        Car car = new Daihatsu();
        car.drive();
        System.out.println(car.getTier());
        System.out.println(car.getBrand());
        System.out.println(car.getPrice());
        System.out.println(car.isGood());
    }
}
