package com.uas;

public class Paket {
    protected int berat;
    protected char jenis_paket;

    protected int biaya;

    public Paket(int berat, char jenis_paket) {
        this.berat = berat;
        this.jenis_paket = jenis_paket;
    }

    public int HitungBiaya() {
       if(this.jenis_paket == 'A'){
           if(this.berat == 100 || this.berat <= 400){
               this.biaya = 5000;
           } else if (this.berat == 401 || this.berat <= 1000) {
               this.biaya = 10000;
           } else if (this.berat > 1000) {
               this.biaya = 15000;
           }
       }
       else if (this.jenis_paket == 'B') {
           if(this.berat == 100 || this.berat <= 400){
               this.biaya = 10000;
           } else if (this.berat == 401 || this.berat <= 1000) {
               this.biaya = 15000;
           } else if (this.berat > 1000) {
               this.biaya = 15500;
           }
       }
       else if (this.jenis_paket == 'C') {
           if(this.berat == 100 || this.berat <= 400){
               this.biaya = 12000;
           } else if (this.berat == 401 || this.berat <= 1000) {
               this.biaya = 20000;
           } else if (this.berat > 1000) {
               this.biaya = 25000;
           }
       }

        return this.biaya;
    }

    public void tampilkan(){
        System.out.println("Berat Paket : " + this.berat);
        System.out.println("Jenis Paket : " + this.jenis_paket);
        System.out.println("Biaya Paket : " + this.biaya);
    }
}
