package com.fakhri.praktikum.praktikum8;
import java.util.Scanner;

public class Product {
    private String productName;
    private int price;
    private int stock;

    //buat costructor Product
    // pakai scanner untuk input data produk dari pengguna
    public Product() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Produk: ");
        this.productName = scanner.nextLine();
        System.out.print("Harga Produk: ");
        this.price = scanner.nextInt();
        System.out.print("Stok Produk: ");
        this.stock = scanner.nextInt();
    }

    // buat Finalizer untuk menampilkan pesan saat produk dihapus
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Produk " + this.productName + " dihapus");
    }

    // buat method getter
    public String getProductName() {
        return productName;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }

}
