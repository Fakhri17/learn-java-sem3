package com.quiz.fakhri;

public class Zebra extends Animal{
    protected boolean is_wild;
    protected boolean zebraMammal;
    public Zebra(int age, String gender, boolean is_wild, boolean zebraMammal) {
        super(age, gender);
        this.is_wild = is_wild;
        this.zebraMammal = zebraMammal;
    }


    public void run(){
        System.out.println("Zebra Berlari dengan biasa");
    }

    public void run(int speed, boolean isWild){
        if (isWild){
            System.out.println("Zebra Berlari dengan kecepatan " + speed + " dengan status liar");
        } else {
            System.out.println("Zebra Berlari dengan kecepatan " + speed + " dengan status jinak");
        }
    }

    @Override
    protected boolean isMammal(boolean isMammal) {
        return isMammal;
    }

    @Override
    public void mate(String mate) {
        System.out.println("Zebra Berpasangan dengan " + mate);
    }
}
