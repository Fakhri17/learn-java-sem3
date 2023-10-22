package com.fakhri.praktikum.overloading;

public class Human {
    public String name, email;
    public int age, noHp;

    // constructor base overloading
    public Human() {
        this.name = "Anonymous";
        this.email = "example@gmail.com";
        this.age = 0;
        this.noHp = 0;
    }

    // overloading constructor with 2 parameter
    public Human(String name, int age){
        this.name = name;
        this.email = "example@gmail.com";
        this.age = age;
        this.noHp = 0;
    }

    // overloading constructor with 3 parameter
    public Human(String name, int age, String email){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // overloading constructor with 4 parameter
    public Human(String name, int age, String email, int noHp){
        this.name = name;
        this.email = email;
        this.age = age;
        this.noHp = noHp;
    }

    // overloading method base
    public void walk(){
        System.out.println(this.name + " is walking");
    }

    // overloading method with 1 parameter
    public void walk(int distance){
        System.out.println(this.name + " walked " + distance + " meters");
    }

    public void walk(int distance, String direction){
        System.out.println(this.name + " walked " + distance + " meters to " + direction);
    }

    // overloading method base
    public String sendEmail(){
        return "Email sent to " + this.email;
    }

    // overloading method with 1 parameter
    public String sendEmail(String message){
        return "Email sent to " + this.email + " with message: " + message;
    }

    //overloading method with 2 parameter
    public String sendEmail(String message, String subject){
        return "Email sent to " + this.email + " with message: " + message + " and subject: " + subject + " and noHp: " + this.noHp;
    }

    // overload method toString()
    public String toString(){
        return "Name: " + this.name + "\nEmail: " + this.email + "\nAge: " + this.age;
    }
}
