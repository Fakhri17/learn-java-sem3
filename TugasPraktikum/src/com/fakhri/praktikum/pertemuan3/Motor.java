package com.fakhri.praktikum.pertemuan3;

public class Motor extends Kendaraan{
    // deklarasi atribut dari class Motor yang merupakan turunan dari class Kendaraan
    protected String tipe;
    protected int tahun_pembuatan, konsumsi_bbm;

    // membuat constructor dari class Motor 
    // dengan parameter nomor_plat, kapasitas_bahan_bakar, tipe, tahun_pembuatan, dan konsumsi_bbm
    public Motor(String nomor_plat, double kapasitas_bahan_bakar, String tipe, int tahun_pembuatan, int konsumsi_bbm) {
        // memanggil constructor dari class Kendaraan dengan keyword super
        super(nomor_plat, kapasitas_bahan_bakar);
        this.tipe = tipe;
        this.tahun_pembuatan = tahun_pembuatan;
        this.konsumsi_bbm = konsumsi_bbm;
    }
     // melakukan override terhadap method hitung_jarak_tempuh dari class Kendaraan
    // yang mereturn hasil dari kapasitas_bahan_bakar dibagi konsumsi_bbm
    @Override
    public double hitung_jarak_tempuh() {
        return kapasitas_bahan_bakar / konsumsi_bbm;
    }
    // melakukan override terhadap method cetak_info dari class Kendaraan
    // dengan menambahkan informasi tipe, tahun_pembuatan, dan konsumsi_bbm
    // keyword super digunakan untuk memanggil method cetak_info dari class Kendaraan
    @Override
    public void cetak_info() {
        super.cetak_info();
        System.out.println("Konsumsi BBM (km/liter): " + konsumsi_bbm);
        System.out.println("Tipe Motor: " + tipe);
        System.out.println("Tahun Pembuatan: " + tahun_pembuatan);
       
    }
}
