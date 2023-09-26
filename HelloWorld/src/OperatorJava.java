public class OperatorJava {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.print("\n");

        int c = 20;
        c += 5;
        System.out.println(c);
        c -= 5;
        System.out.println(c);
        c *= 5;
        System.out.println(c);
        c /= 5;
        System.out.println(c);
        c %= 5;
        System.out.println(c);

        System.out.println();
        int d = 30;
        int e = 35;

        System.out.println(d > e);
        System.out.println(d < e);
        System.out.println(d >= e);
        System.out.println(d <= e);
        System.out.println(d == e);
        System.out.println(d != e);

        var nilaiUas = 4;
        var nilaiUts = 70;

        var lulusUas = nilaiUas >= 75;
        var lulusUts = nilaiUts >= 70;

        var lulus = lulusUas || lulusUts;

        if (lulus) {
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Maaf anda tidak lulus");
        }

        if(nilaiUas >= 80){
            System.out.println("Nilai anda A");
        }
        else if(nilaiUas >= 70){
            System.out.println("Nilai anda B");
        }
        else if(nilaiUas >= 60){
            System.out.println("Nilai anda C");
        }
        else if(nilaiUas >= 50){
            System.out.println("Nilai anda D");
        }
        else{
            System.out.println("Nilai anda E");
        }

        var nilai = "B";
        switch (nilai) {
            case "A":
                System.out.println("Nilai anda A");
                break;
            case "B":
                System.out.println("Nilai anda B");
                break;
            case "C":
                System.out.println("Nilai anda C");
                break;
            case "D":
                System.out.println("Nilai anda D");
                break;
            case "E":
                System.out.println("Nilai anda E");
                break;
            default:
                System.out.println("Nilai tidak valid");
        }

        // switch lambda
        switch(nilai) {
            case "A" -> System.out.println("Nilai anda A");
            case "B" -> System.out.println("Nilai anda B");
            case "C" -> System.out.println("Nilai anda C");
            case "D" -> System.out.println("Nilai anda D");
            case "E" -> System.out.println("Nilai anda E");
            default -> System.out.println("Nilai tidak valid");
        }

        String isLulus = nilaiUas >= 75 ? "Selamat anda lulus" : "Maaf anda tidak lulus";
        System.out.println(isLulus);

    }
}
