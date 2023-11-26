package com.fakhri.praktikum.exception;
import java.util.Scanner;
public class MainExcep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Masukkan angka A: ");
                int a = scanner.nextInt();

                System.out.print("Masukkan angka B: ");
                int b = scanner.nextInt();

                int c = a / b;
                System.out.println("Nilai C adalah " + c);
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                System.out.println("Akan diulang lagi.");
            }
        }
    }
}
