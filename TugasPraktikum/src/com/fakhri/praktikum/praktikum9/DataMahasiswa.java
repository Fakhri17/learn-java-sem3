package com.fakhri.praktikum.praktikum9;
import java.util.HashMap;
import java.util.Map;

public class DataMahasiswa {
    protected Map<String, Mahasiswa> dataMahasiswa;

    public DataMahasiswa() {
        dataMahasiswa = new HashMap<>();
    }

    public void addData(String nama, double nilai) {
        Mahasiswa mahasiswa = new Mahasiswa(nama, nilai);
        dataMahasiswa.put(nama, mahasiswa);
        System.out.println("Data mahasiswa berhasil ditambahkan!");
    }

    public void deleteData(String nama) {
       if(dataMahasiswa.containsKey(nama)) {
           dataMahasiswa.remove(nama);
           System.out.println("Data mahasiswa berhasil dihapus!");
       } else {
           System.out.println("Data mahasiswa tidak ditemukan!");
       }
    }

    public void displayNilai(String nama) {
        if(dataMahasiswa.containsKey(nama)) {
            System.out.println("Nilai " + nama + " adalah " + dataMahasiswa.get(nama).getNilai());
        } else {
            System.out.println("Data mahasiswa tidak ditemukan!");
        }
    }

    public void displayAll() {
        System.out.println("Data Mahasiswa:");
       if(dataMahasiswa.isEmpty()) {
           System.out.println("Data mahasiswa kosong!");
       } else {
           for (Mahasiswa mahasiswa : dataMahasiswa.values()) {
               System.out.println(mahasiswa);
           }
       }
    }
}
