package com.fakhri.praktikum.praktikum9;
import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args) {
        DataMahasiswa dataMahasiswa = new DataMahasiswa();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data mahasiswa");
            System.out.println("2. Hapus data mahasiswa");
            System.out.println("3. Tampilkan nilai mahasiswa");
            System.out.println("4. Tampilkan semua data mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilihan menu (1-5): ");

            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nilai mahasiswa: ");
                    double nilai = scanner.nextDouble();
                    scanner.nextLine();
                    dataMahasiswa.addData(nama, nilai);
                    break;
                case 2:
                    System.out.print("Masukkan nama mahasiswa: ");
                    nama = scanner.nextLine();
                    dataMahasiswa.deleteData(nama);
                    break;
                case 3:
                    System.out.print("Masukkan nama mahasiswa: ");
                    nama = scanner.nextLine();
                    dataMahasiswa.displayNilai(nama);
                    break;
                case 4:
                    dataMahasiswa.displayAll();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
            }

        } while (pilihan != 5);

        scanner.close();
    }
}
