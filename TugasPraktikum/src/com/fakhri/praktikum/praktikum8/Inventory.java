package com.fakhri.praktikum.praktikum8;
import java.util.Arrays;

public class Inventory {
    //buat array Product dan atribut size
     protected Product[] products;

    //buat constructor Inventory untuk set panjang kapasitas product
    // , dan set size = 0
    public Inventory(int capacity) {
        this.products = new Product[capacity];
    }
    //buat method void addProduct untuk menambahkan data ke array products,
    // dan buat percabangan untuk mengukur apabila kapasitas penuh maka tidak bisa menambahkan data lagi dan muncul kalimat
    // "Inventory is full. Cannot add more products."
    public void addProduct() {
        if (products.length == 0) {
            System.out.println("Inventory is full. Cannot add more products.");
        } else {
            for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                    products[i] = new Product();
                    break;
                }
            }
        }
    }

    //buat method displayProducts untuk menampilkan semua data product
    public void displayProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println("Nama Produk: " + products[i].getProductName());
                System.out.println("Harga Produk: " + products[i].getPrice());
                System.out.println("Stok Produk: " + products[i].getStock());
                System.out.println();
            }
        }
    }

    //buat method deleteProductByName untuk menghapus data
    public void deleteProductByName(String productName) {
        // Menghapus produk berdasarkan nama
        //set object menjadi null kemudian geser elemen-elemen produk setelah penghapusan object kemudian kurangi ukuran array object
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getProductName().equals(productName)) {
                    products[i] = null;
                    for (int j = i; j < products.length - 1; j++) {
                        products[j] = products[j + 1];
                    }
                    products[products.length - 1] = null;
                    break;
                }
            }
        }
    }

    // buat Finalizer untuk setiap produk yang tidak dihapus secara eksplisit
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Inventory dihapus");
    }

}
