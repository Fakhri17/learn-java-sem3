package com.fakhri.praktikum.interfaces;

public class Hitung implements Operasi{
    double lingkaran, persegi;
    double sisi = 5;

    @Override
    public void kelilingLingkaran(double radius){
        System.out.println("\nMenghitung Keliling Lingkaran");
        System.out.println("Nilai radius = " + radius + kons_panjang);
        lingkaran = kons_pi * 2 * radius;
        System.out.println("Keliling Lingkaran = " + lingkaran + kons_panjang);
    }

//    @Override
//    public void kelilingPersegi() {
//    }

}
