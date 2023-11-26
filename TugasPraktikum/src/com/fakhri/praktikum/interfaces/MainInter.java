package com.fakhri.praktikum.interfaces;

public class MainInter {
    public static void main(String[] args) {
        System.out.println("Menerapkan Interface");
        Hitung hitung = new Hitung();
        Operasi operasi = new Hitung();

        hitung.kelilingLingkaran(7);
//        hitung.kelilingPersegi();

        System.out.println("\nAkses langsung dari objek operasi");

        operasi.kelilingLingkaran(21);
//        operasi.kelilingPersegi();
    }
}
