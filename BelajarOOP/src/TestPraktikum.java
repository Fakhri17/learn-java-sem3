

public class TestPraktikum {
    public static void main(String[] args) {
        NomerClass MantanTerindah = new NomerClass();
        MantanTerindah.nomor1 = 1;
        MantanTerindah.nomor2 = 2;


        int hasil = MantanTerindah.TambahkanNomor();
        System.out.printf("Hasil dari penjumlahan = %d\n", hasil);
        System.out.printf("Hasil dari penjumlahan = %d\n", MantanTerindah.TambahkanNomor());

        MantanTerindah.TampilkanNomor();

        Manusia mantanTerindah = new Manusia();
        Manusia bismillahJodoh = new Manusia();

        mantanTerindah.nama = "Fakhri";
        mantanTerindah.warnaKulit = "Sawo Matang";
        mantanTerindah.warnaRambut = "Hitam";
        mantanTerindah.Umur = 22;

        bismillahJodoh.nama = "Member JKT48";
        bismillahJodoh.warnaKulit = "Putih";
        bismillahJodoh.warnaRambut = "Coklat";
        bismillahJodoh.Umur = 17;

        mantanTerindah.tampilCiri();
        bismillahJodoh.tampilCiri();
    }
}