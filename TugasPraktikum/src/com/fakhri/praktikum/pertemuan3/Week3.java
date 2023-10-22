package com.fakhri.praktikum.pertemuan3;
import java.util.ArrayList;

public class Week3 {
    // fungsi cetak inventaris untuk mencetak semua kendaraan yang ada di dalam inventory (ArrayList)
    // yang menggunakan parameter inventory bertipe ArrayList<Kendaraan>
    public static void cetak_inventaris(ArrayList<Kendaraan> inventory) {
        // melakukan looping untuk menampilkan semua kendaraan yang ada di dalam inventory
        for (Kendaraan kendaraan : inventory) {
            kendaraan.cetak_info();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // membuat sebuah ArrayList inventory yang dapat menampung objek Kendaraan
        ArrayList<Kendaraan> inventory = new ArrayList<>();
        // membuat objek kendaraan mobil, motor, dan sepeda yang menggunakan konstruktor
        // yang memiliki parameter yang berbeda-beda override dari kelas Kendaraan
        Kendaraan mobil = new Mobil("B 1234 ABC", 90, "Toyota Avanza", 15);
        Kendaraan motor = new Motor("B 4321 CBA", 150, "Bebek", 2015, 15);
        Kendaraan sepeda = new Sepeda("BMX", "Merah");
        // menambahkan objek kendaraan mobil, motor, dan sepeda ke dalam inventory
        inventory.add(mobil);
        inventory.add(motor);
        inventory.add(sepeda);
        // memanggil fungsi cetak_inventaris dengan parameter inventory untuk mencetak semua kendaraan
        cetak_inventaris(inventory);

    }
}
