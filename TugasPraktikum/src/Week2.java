// memanggil module yang dibutuhkan
import java.util.Scanner;
import java.util.ArrayList;

// class utama
public class Week2 {
    // method utama
    public static void main(String[] args) {
        // deklarasi variabel jumlahMahasiswa
        // dan meminta input dari user untuk menentukan jumlah mahasiswa yang akan diinput
        int JumlahMahasiswa;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        JumlahMahasiswa = input.nextInt();
        // deklarasi list array object untuk menyimpan data mahasiswa
        ArrayList<mahasiswa> ArrayMahasiswa = new ArrayList<>();
        // perulangan untuk meminta input data mahasiswa sebanyak jumlah mahasiswa yang diinput
        for (int i = 0; i < JumlahMahasiswa; i++) {
            // deklarasi object mahasiswa
            mahasiswa mhs = new mahasiswa();
            // meminta input data mahasiswa berupa nama, NIM, dan jurusan
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + ": ");
            String nama = input.next();
            System.out.print("Masukkan NIM mahasiswa ke-" + (i+1) + ": ");
            int NIM = input.nextInt();
            System.out.print("Masukkan jurusan mahasiswa ke-" + (i+1) + ": ");
            String jurusan = input.next();
            // memasukkan data mahasiswa ke dalam object mahasiswa menggunakan method setData
            // dan memasukkan object mahasiswa ke dalam list array object menggunakan method add
            mhs.setData(nama, NIM, jurusan);
            ArrayMahasiswa.add(mhs);
        }

        // menampilkan data mahasiswa yang telah diinput
        System.out.println("\n ===== Daftar mahasiswa: =====");
        // perulangan untuk menampilkan data mahasiswa
        for(mahasiswa mhs : ArrayMahasiswa){
            // menampilkan data mahasiswa menggunakan method getter
            // yang telah dibuat pada class mahasiswa
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("NIM: " + mhs.getNIM());
            System.out.println("Jurusan: " + mhs.getJurusan());
            System.out.println();
        }
    }
}

// class mahasiswa
class mahasiswa{
    // deklarasi attribut nama, NIM, dan jurusan
    private String nama;
    private int NIM;
    private String jurusan;

    // membuat method setter untuk memasukkan data mahasiswa
    public void setData(String nama, int NIM, String jurusan){
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }
    // membuat method getter untuk setiap attribute untuk mengambil data mahasiswa
    public String getNama(){
        return this.nama;
    }
    public int getNIM(){
        return this.NIM;
    }
    public String getJurusan(){
        return this.jurusan;
    }
}
