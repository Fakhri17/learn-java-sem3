public class Manusia{
    String warnaRambut, warnaKulit, nama; // <--- Atribut (berupa variabel)
    int Umur;

    int tampilUmur(){   // <--- Method dalam bentuk fungsi (dengan nilai kembalian)
        return Umur;
    }

    void tampilCiri(){ // <--- Method dalam bentuk prosedur (tanpa nilai kembalian)
        System.out.println("Nama : " + nama);
        System.out.println("Warna Kulit : " + warnaKulit);
        System.out.println("Warna Rambut : " + warnaRambut);
        System.out.println("Umur : " + tampilUmur());
    }

}