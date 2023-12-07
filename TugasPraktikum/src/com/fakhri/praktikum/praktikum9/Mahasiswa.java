package com.fakhri.praktikum.praktikum9;

public class Mahasiswa {
    protected String nama;
    protected double nilai;

    public Mahasiswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }
    public double getNilai() {
        return nilai;
    }

    public String toString() {
        return "Nama: " + nama + ", Nilai: " + nilai;
    }
}
