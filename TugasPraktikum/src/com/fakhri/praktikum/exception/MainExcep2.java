package com.fakhri.praktikum.exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainExcep2 {
    public static double calculate(int a, int b) {
//        try {
//            return (double) a / b;
//        } catch (ArithmeticException e) {
//            System.out.println("Pembaginya diperhatikan ya kak :)");
//            return Double.NaN; // Return NaN (Not a Number)
//        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Masukkan angka a: ");
                int a = scanner.nextInt();

                System.out.print("Masukkan angka b: ");
                int b = scanner.nextInt();

                // deklarasi variabel result untuk menampung hasil dari method calculate
                // yang didalamnya terdapat try catch
                // double result = calculate(a, b);
                // System.out.println(result);
                System.out.println("Hasil " + a/b);
            }
            // multi catch
            catch (ArithmeticException e) {
                System.out.println("Pembaginya diperhatikan ya kak :) jangan 0");
            }
            catch (InputMismatchException e) {
                System.out.println("Tipe datanya dilihat lagi kak :)");
                scanner.nextLine();
                //break;
            }
            finally {
                System.out.println("Program akan diulang lagi");
            }
        }

//        scanner.close();
    }
}
