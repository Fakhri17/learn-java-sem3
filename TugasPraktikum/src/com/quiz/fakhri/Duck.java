package com.quiz.fakhri;

public class Duck extends Animal{
    protected String beakColor = "yellow";

    public Duck(int age, String gender, String beakColor){
        super(age,gender);
        this.beakColor = beakColor;
    }

    public void swim(){
        System.out.println("Bebek Berenang dengan biasa");
    }

    // overloading
    public void swim(int speed){
        System.out.println("Bebek Berenang dengan kecepatan " + speed);
    }
    public void quack(){
        System.out.println("Quack Quack!!");
    }

    @Override
    public boolean isMammal(boolean isMammal){
        return isMammal;
    }

    @Override
    public void mate(String mate){
        System.out.println("Bebek Berpasangan dengan " + mate);
    }

}
