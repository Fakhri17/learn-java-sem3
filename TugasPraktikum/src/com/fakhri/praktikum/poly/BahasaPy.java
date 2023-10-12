package com.fakhri.praktikum.poly;

public class BahasaPy extends BahasaPemrograman{
    public boolean isLooselyTyped = true;

    public BahasaPy(){
        super(false, "OOP");
    }

    @Override
    public void display() {
        System.out.println("Bahasa Python adalah bahasa pemrograman");
        super.display();
    }
}
