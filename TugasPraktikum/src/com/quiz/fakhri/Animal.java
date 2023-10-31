package com.quiz.fakhri;

public abstract class Animal {
    protected int age;
    protected String gender;

    public Animal(int age, String gender){
        this.age = age;
        this.gender = gender;
    }
    protected abstract boolean isMammal(boolean isMammal);

    public abstract void mate(String mate);
}
