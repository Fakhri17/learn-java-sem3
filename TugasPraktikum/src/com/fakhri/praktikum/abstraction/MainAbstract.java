package com.fakhri.praktikum.abstraction;

public class MainAbstract {
    public static void main(String[] args) {
        System.out.println("Menerapkan Abstract Class");
        Karnivora singa = new Karnivora();
        Hewan hewan = new Karnivora();

        singa.nama = "Singa";
        singa.habitat = "Savanna";
        singa.namaHewan();
        singa.habitatHewan();

        hewan.nama = "Harimau";
        hewan.habitatHewan();
        hewan.namaHewan();
    }
}
