public class Perulangan {
    public static void main(String[] args) {
        for(int counter = 1; counter <= 10; counter++){
            System.out.println("Perulangan ke-" + counter);
        }

        int whileCounter = 1;
        while(whileCounter <= 10){
            System.out.println("Perulangan while ke-" + whileCounter);
            whileCounter++;
        }

        int doWhileCounter = 1;
        do{
            System.out.println("Perulangan do-while ke-" + doWhileCounter);
            doWhileCounter++;
        }while(doWhileCounter <= 10);

        int breakCounter = 1;
        while(true){
            System.out.println("Perulangan break ke-" + breakCounter);
            breakCounter++;
            if(breakCounter > 10){
                break;
            }
        }

        for(int continueCounter = 1; continueCounter <= 10; continueCounter++){
            if(continueCounter % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Ganjil " + continueCounter);
        }

        String[] listNama = {"Fakhri", "Alauddin", "Nira", "Cantik"};
        for(String nama : listNama){
            System.out.println(nama);
        }
    }
}
