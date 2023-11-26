package com.uas;

import org.w3c.dom.ls.LSOutput;

public class Asuransi extends Paket{
    public float biayaAsuransi;
    public float dummy;

    public Asuransi(int berat, char jenis_paket, float biayaAsuransi) {
        super(berat, jenis_paket);
        this.biayaAsuransi = biayaAsuransi;
    }

    @Override
    public int HitungBiaya() {
        return super.HitungBiaya();
    }

    public float HitungAsuransi(){
        if(HitungBiaya() > 1000){

        }
        return this.biayaAsuransi;
    }
}
