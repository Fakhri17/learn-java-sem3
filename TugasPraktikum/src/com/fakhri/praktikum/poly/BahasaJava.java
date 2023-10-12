package com.fakhri.praktikum.poly;

public class BahasaJava extends BahasaPemrograman{
    public boolean hasJVM = true;

    public BahasaJava(){
        super(true, "object-oriented");
    }

    @Override
    public void display() {
        System.out.println("Bahasa Java adalah bahasa pemrograman");
        super.display();
    }
}
