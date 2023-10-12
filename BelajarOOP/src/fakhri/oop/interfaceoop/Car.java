package fakhri.oop.interfaceoop;

public interface Car extends HasPrice, IsGood {
    void drive();
    int getTier();
    String getBrand();
}
