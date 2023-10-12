package com.fakhri.praktikum.poly;

public class BahasaPemrograman {
    public boolean isCompiled;
    public String paradigma;

    public BahasaPemrograman(){
        this.isCompiled = false;
        this.paradigma = null;
    }

    public BahasaPemrograman(boolean isCompiled, String paradigma){
        this.isCompiled = isCompiled;
        this.paradigma = paradigma;
    }

    public void display(){
        if(!isCompiled && paradigma == null) {
            System.out.println("Bahasa Pemrograman ini belum diketahui");
        }
        else{
            String type = isCompiled ? "Compiled" : "Interpreted";
            System.out.println("Bahasa Pemrograman ini adalah " + paradigma + " dan " + type);
        }
    }
}
