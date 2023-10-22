package com.fakhri.praktikum.pertemuan3;

public class Kendaraan {
    // deklarasi atribut dari class Kendaraan
    protected String nomor_plat;
    protected double kapasitas_bahan_bakar;

    //  membuat constructor dari class Kendaraan
    // dengan parameter nomor_plat dan kapasitas_bahan_bakar
    public Kendaraan(String nomor_plat, double kapasitas_bahan_bakar) {
        this.nomor_plat = nomor_plat;
        this.kapasitas_bahan_bakar = kapasitas_bahan_bakar;
    }

    // membuat method hitung_jarak_tempuh dengan return kapasitas_bahan_bakar
    public double hitung_jarak_tempuh() {
        return kapasitas_bahan_bakar;
    }

    // membuat method cetak_info untuk mencetak informasi kendaraan
    public void cetak_info() {
        System.out.println("Nomor Plat: " + nomor_plat);
        System.out.println("Kapasitas Bahan Bakar (liter): " + kapasitas_bahan_bakar);
        System.out.println("Jarak Tempuh Maksimum (km): " + hitung_jarak_tempuh());
    }

}
