public class LearnMethod {
    public static void main(String[] args) {
        // method without return
        sayHello("Fakhri");
        sayHello("Nira");
        umurNama("Fakhri", 22);
        umurNama("Nira", 20);

        // method with return
        int total = sum(10, 20);
        System.out.println(total);


        // method with many return
        int hasil = hitungOperation(10, "+", 20);
        System.out.println(hasil);
        int hasil2 = hitungOperation(10, "-", 20);
        System.out.println(hasil2);

        // method with variable arguments
        andaLulus("Fakhri", 80, 70, 60, 90);
        andaLulus("Nira", 80, 70, 60, 50, 40, 30, 20, 10);
    }

    // method without return
    static void sayHello(String name){
        System.out.println("Hello " + name);
        System.out.println("Good Morning");
    }
    static void umurNama(String name, int umur){
        System.out.println("Nama saya " + name);
        System.out.println("Umur saya " + umur);
    }
    // method with return
    static int sum(int a, int b){
        int total = a + b;
        return total;
    }

    // method with many return
    static int hitungOperation(int a, String operation, int b){
        switch (operation){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }

    // method with variable arguments
    static void andaLulus(String name, int... nilai){
        int total = 0;
        for(int value : nilai){
            total += value;
        }
        int finalValue = total / nilai.length;
        if(finalValue >= 75){
            System.out.println("Selamat " + name + " anda lulus");
        }
        else{
            System.out.println("Maaf " + name + " anda tidak lulus");
        }
    }
}
