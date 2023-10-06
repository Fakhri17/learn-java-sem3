import java.util.Scanner;
import java.util.ArrayList;

public class Week2 {
    public static void main(String[] args) {
        int JumlahMahasiswa;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        JumlahMahasiswa = input.nextInt();

        ArrayList<mahasiswa> ArrayMahasiswa = new ArrayList<mahasiswa>();
        for (int i = 0; i < JumlahMahasiswa; i++) {
            mahasiswa mhs = new mahasiswa();
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + ": ");
            String nama = input.next();
            System.out.print("Masukkan NIM mahasiswa ke-" + (i+1) + ": ");
            int NIM = input.nextInt();
            System.out.print("Masukkan jurusan mahasiswa ke-" + (i+1) + ": ");
            String jurusan = input.next();
            mhs.setData(nama, NIM, jurusan);
            ArrayMahasiswa.add(mhs);
        }

        System.out.println("\n ===== Daftar mahasiswa: =====");
        for(mahasiswa mhs : ArrayMahasiswa){
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("NIM: " + mhs.getNIM());
            System.out.println("Jurusan: " + mhs.getJurusan());
            System.out.println();
        }
    }
}

class mahasiswa{
    private String nama;
    private int NIM;
    private String jurusan;
    public void setData(String nama, int NIM, String jurusan){
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }
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
