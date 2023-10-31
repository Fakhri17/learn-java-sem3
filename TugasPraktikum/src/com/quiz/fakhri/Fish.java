package com.quiz.fakhri;

public class Fish extends Animal{

    protected int sizeInFt;
    protected boolean canEat;
    public Fish(int age, String gender, int sizeInFt, boolean canEat) {
        super(age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    public void swim(){
        System.out.println("Ikan Berenang dengan biasa");
    }

    public void swim(int speed, String name){
        System.out.println("Ikan Berenang dengan kecepatan " + speed + " dengan nama " + name);
    }

    @Override
    protected boolean isMammal(boolean isMammal) {
        return isMammal;
    }

    @Override
    public void mate(String mate) {
        System.out.println("Ikan Berpasangan dengan " + mate);
    }
}
