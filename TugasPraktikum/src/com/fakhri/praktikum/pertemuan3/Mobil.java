package com.fakhri.praktikum.pertemuan3;

public class Mobil extends Kendaraan {
    // deklarasi atribut dari class Mobil yang merupakan turunan dari class Kendaraan
    protected String merk;
    protected double konsumsi_bbm;
    
    // membuat constructor dari class Mobil 
    // dengan parameter nomor_plat, kapasitas_bahan_bakar, merk, dan konsumsi_bbm
    public Mobil(String nomor_plat, double kapasitas_bahan_bakar, String merk, double konsumsi_bbm) {
        // memanggil constructor dari class Kendaraan dengan keyword super
        super(nomor_plat, kapasitas_bahan_bakar);
        this.merk = merk;
        this.konsumsi_bbm = konsumsi_bbm;
    }
    // melakukan override terhadap method hitung_jarak_tempuh dari class Kendaraan
    // yang mereturn hasil dari kapasitas_bahan_bakar dibagi konsumsi_bbm
    @Override
    public double hitung_jarak_tempuh() {
        return kapasitas_bahan_bakar / konsumsi_bbm;
    }

    // melakukan override terhadap method cetak_info dari class Kendaraan
    // dengan menambahkan informasi merk dan konsumsi_bbm
    // keyword super digunakan untuk memanggil method cetak_info dari class Kendaraan
    @Override
    public void cetak_info() {
        super.cetak_info();
        System.out.println("Konsumsi BBM (km/liter): " + konsumsi_bbm);
        System.out.println("Merk: " + merk);

    }
}