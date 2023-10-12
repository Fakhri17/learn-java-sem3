package com.fakhri.praktikum.inheritance;

public class Surgeon extends Doctor {

    public Surgeon(boolean worksAtHospital) {
        super(worksAtHospital);
    }
    public void treatPatient(){
        System.out.println("Mengoperasi pasien");
    }

    public void makeIncision(){
        System.out.println("Membuat sayatan");
    }
}
