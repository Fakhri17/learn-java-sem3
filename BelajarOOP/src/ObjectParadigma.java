class HumanClass{
    String nama;
    int umur;
    String tanggalLahir;
    String alamat;

    void tampilData(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Alamat: " + alamat);
    }

    public HumanClass(){
        System.out.println("Ini adalah constructor");
    }
}

public class ObjectParadigma {
    public static void main(String[] args) {
        HumanClass human1 = new HumanClass();
        human1.nama = "Fakhri Alauddin";
        human1.umur = 22;
        human1.tanggalLahir = "31 Maret 2001";
        human1.alamat = "Jl Raya Benowo 06, Surabaya";
        human1.tampilData();

    }

}
