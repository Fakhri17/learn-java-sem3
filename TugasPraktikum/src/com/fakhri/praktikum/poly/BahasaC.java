package com.fakhri.praktikum.poly;

public class BahasaC extends BahasaPemrograman{
    public boolean hasPointer = true;

    public BahasaC(){
        super(true, "imperative");
    }

    @Override
    public void display() {
        System.out.println("Bahasa C adalah bahasa pemrograman");
        super.display();
    }
}
