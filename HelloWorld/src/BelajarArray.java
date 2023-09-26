public class BelajarArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[2];
        arrayString[0] = "Fakhri";
        arrayString[1] = "Alauddin";

        int[] arrrayInt = new int[2];
        arrrayInt[0] = 10;
        arrrayInt[1] = 20;

        String[] arrayString2 = {"Nira", "Cantik"};
        int[] arrayInt2 = {50, 100};

        System.out.println("Panjang arrayString: " + arrayString.length);
        System.out.println("Panjang arrrayInt: " + arrrayInt.length);

        for (String i : arrayString) {
            System.out.println(i);
        }

        for (int i : arrrayInt) {
            System.out.println(i);
        }

        for (String i : arrayString2) {
            System.out.println(i);
        }

        for (int i : arrayInt2) {
            System.out.println(i);
        }

        String[][] multiArray = {
                {"Fakhri", "Alauddin"},
                {"Nira", "Cantik"}
        };

        System.out.println("Panjang multiArray: " + multiArray.length);
        System.out.println(multiArray[0][1]);
    }
}
