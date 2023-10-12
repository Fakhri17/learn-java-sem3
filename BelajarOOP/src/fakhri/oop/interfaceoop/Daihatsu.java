package fakhri.oop.interfaceoop;

public class Daihatsu implements Car{

    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Daihatsu";
    }

    @Override
    public int getPrice() {
        return 100000000;
    }

    public boolean isGood() {
        return true;
    }
}
