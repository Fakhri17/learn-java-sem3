package com.fakhri.praktikum.pertemuan3;

public class Sepeda extends Kendaraan{
    // deklarasi atribut dari class Sepeda yang merupakan turunan dari class Kendaraan
    protected String jenis_sepeda;
    protected String warna;
    
    // membuat constructor dari class Motor
    // dengan parameter jenis_sepeda dan warna
    public Sepeda(String jenis_sepeda, String warna) {
        // memanggil constructor dari class Kendaraan dengan keyword super
        super(null, 0);
        this.jenis_sepeda = jenis_sepeda;
        this.warna = warna;
    }
    // melakukan override terhadap method hitung_jarak_tempuh dari class Kendaraan
    @Override
    public double hitung_jarak_tempuh() {
        return 0; // Sebuah sepeda tidak menggunakan bahan bakar.
    }
    // melakukan override terhadap method cetak_info dari class Kendaraan
    // mengganti informasi dengan jenis sepda dan warna
    @Override
    public void cetak_info() {
        System.out.println("Jenis Sepeda: " + jenis_sepeda);
        System.out.println("Warna: " + warna);
    }
}
