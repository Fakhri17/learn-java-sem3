package com.fakhri.praktikum.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TugasException {
    public static void main(String[] args) {
        // deklarasi scanner
        Scanner input = new Scanner(System.in);
        // deklarasi variabel inputValid untuk menampung kondisi input
        boolean inputValid = false;

        // perulangan do while
        do {
            // try catch
            try {
                // input bilangan
                System.out.print("Masukkan bilangan bulat: ");
                int bilangan = input.nextInt();
                inputValid = true;
                // jika bilangan genap, maka akan ditampilkan
                if (bilangan % 2 == 0) {
                    System.out.println(bilangan + " adalah bilangan genap.");
                }
                // jika bilangan ganjil, maka akan dilempar ke catch
                else {
                    throw new IllegalArgumentException("Bilangan ganjil ditemukan!");
                }
                // jika input tidak bukan bilangan bulat, maka akan dilempar ke catch
                // dan akan ditampilkan pesan error serta input akan dibersihkan dan diulang
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan bilangan bulat.");
                input.nextLine(); // Membersihkan buffer input
             // jika input ganjil maka akan menampilkan pesan dari throw
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!inputValid);
        // menutup scanner
        input.close();
    }
}
