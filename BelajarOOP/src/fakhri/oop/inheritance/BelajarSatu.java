package fakhri.oop.inheritance;

class Mahasiswa{
    String name;
    void hello(){
        System.out.println("Hello, my name is " + this.name);
    }
}

class dosen extends Mahasiswa{
    String nidn;
    void dosenMahasiswa(){
        System.out.println("Hello, my name is " + this.name + " and my NIDN is " + this.nidn);
    }
}
public class BelajarSatu {
    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.name = "Fakhri Alauddin";
        mahasiswa.hello();

        dosen dosen = new dosen();
        dosen.name = "Bu Vessa";
        dosen.nidn = "123456789";
        dosen.dosenMahasiswa();

    }
}
