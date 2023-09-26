class Human{
    int umur;
    String nama;
    String alamat;
}

class Sword{
    String name;
    String color;
    int damage;
}

class Math{
    int a, b;
    void display(int a, int b){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    int tambah(){
        return a + b;
    }

    int kurang(){
        return a - b;
    }
}

public class Coba {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Human hum = new Human();
        hum.umur = 22;
        hum.nama = "Fakhri";
        hum.alamat = "Jl. Benowo";
        System.out.println("Nama : " + hum.nama);
        System.out.println("Umur : " + hum.umur);
        System.out.println("Alamat : " + hum.alamat);

        Sword sword = new Sword();
        sword.name = "Excalibur";
        sword.color = "Gold";
        sword.damage = 100;
        System.out.println("Sword Name : " + sword.name);
        System.out.println("Sword Color : " + sword.color);
        System.out.println("Sword Damage : " + sword.damage);

        Math math = new Math();
        math.a = 10;
        math.b = 5;
        // method prosedur
        math.display(math.a, math.b);
        // method fungsi
        System.out.println("Hasil Penjumlahan : " + math.tambah());
        System.out.println("Hasil Pengurangan : " + math.kurang());

    }
}
