package com.fakhri.praktikum.overloading;

public class Main {
    public static void main(String[] args) {
        Human anon = new Human();
        Human fakhri = new Human("Fakhri", 22);
        Human nir = new Human("Nir",20, "nir@gmail.com" );
        Human naruto = new Human("Naruto", 20, "naruto@gmai.com", 897063244);

        System.out.println(anon.toString());

        System.out.println(fakhri.toString());
        fakhri.walk();
        fakhri.walk(100);

        System.out.println("=====================================" );

        System.out.println(nir.toString());
        System.out.println(nir.sendEmail());

        System.out.println("=====================================" );

        System.out.println(naruto.toString());
        System.out.println(naruto.sendEmail("Hello, I'm Naruto", "kirim coba"));

    }
}
