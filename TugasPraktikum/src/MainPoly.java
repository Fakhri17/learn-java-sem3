import com.fakhri.praktikum.poly.BahasaC;
import com.fakhri.praktikum.poly.BahasaJava;
import com.fakhri.praktikum.poly.BahasaPemrograman;
import com.fakhri.praktikum.poly.BahasaPy;

public class MainPoly {
    public static void main(String[] args) {

        BahasaPemrograman bahasaPemrograman = new BahasaPemrograman();
        bahasaPemrograman.display();

        System.out.println();

        BahasaPemrograman bahasaC = new BahasaC();
        bahasaC.display();

        System.out.println();

        BahasaPemrograman bahasaJava = new BahasaJava();
        bahasaJava.display();

        System.out.println();

        BahasaPemrograman bahasaPy = new BahasaPy();
        bahasaPy.display();

        System.out.println("====================================");

        int banyakIndex = 4;
        BahasaPemrograman[] bahasaPemrogramans = new BahasaPemrograman[banyakIndex];
//      // same like = new Object()
        bahasaPemrogramans[0] = bahasaPemrograman;
        bahasaPemrogramans[1] = bahasaC;
        bahasaPemrogramans[2] = bahasaJava;
        bahasaPemrogramans[3] = bahasaPy;

        System.out.println();
        for (int i = 0; i < banyakIndex; i++) {
            bahasaPemrogramans[i].display();
            System.out.println();
        }
    }
}
