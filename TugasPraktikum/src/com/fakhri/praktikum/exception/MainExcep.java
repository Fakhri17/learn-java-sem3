package com.fakhri.praktikum.exception;
import java.util.Scanner;
public class MainExcep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = scanner.nextInt();

        System.out.print("Masukkan a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan b: ");
        int b = scanner.nextInt();

        System.out.println("\nHasil:");
        for (int i = a; i < b; i++) {
            // try catch
            try {
                // jika N/i menghasilkan error, maka akan dilempar ke catch
                System.out.println(N + "/" + i + " = " + N / i);
            }
            // jika terjadi error, maka akan ditangkap oleh catch
            // AritmeticException merupakan exception apabila terjadi error aritmatika
            // berupa pembagian dengan 0
            catch (ArithmeticException error) {
                System.out.println("Di sini ada error: " + error.toString());
            }
        }

        scanner.close();
    }
}
