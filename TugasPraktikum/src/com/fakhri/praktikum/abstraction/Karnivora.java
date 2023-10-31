package com.fakhri.praktikum.abstraction;

public class Karnivora extends Hewan{
    public String habitat;
    @Override
    public void habitatHewan() {
        System.out.println("\nMethod ini dalam class Karnivora");
        System.out.println("Hewan ini hidup di " + habitat);
    }

    @Override
    public void namaHewan() {
        System.out.println("\nMethod ini dalam class Karnivora");
        System.out.println("Nama hewan ini adalah " + nama);
    }

    // Kesimpulan
    // Method overrding yg terjadi di class Karnivora adalah method abstract yg diwarisi dari class Hewan
}
