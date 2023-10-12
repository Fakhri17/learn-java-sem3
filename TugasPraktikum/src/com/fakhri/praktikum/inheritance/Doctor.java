package com.fakhri.praktikum.inheritance;

public class Doctor {
    protected boolean worksAtHospital;

    public Doctor(boolean worksAtHospital){
        this.worksAtHospital = worksAtHospital;
    }

    public void treatPatient(){
        System.out.println("Memeriksa pasien");
    }

    public void setWorksAtHospital(boolean worksAtHospital){
        this.worksAtHospital = worksAtHospital;
    }

    public boolean getWorksAtHospital(){
        return worksAtHospital;
    }
}
