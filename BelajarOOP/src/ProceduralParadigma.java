public class ProceduralParadigma {
    public static void tampilData(String nama, int umur, String tanggalLahir, String alamat) {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Alamat: " + alamat);
    }
    public static void main(String[] args) {
        String nama = "Fakhri Alauddin";
        int umur = 22;

        String tanggalLahir = "31 Maret 2001";
        String alamat = "Jl Raya Benowo 06, Surabaya";
        tampilData(nama, umur, tanggalLahir, alamat);
    }
}
