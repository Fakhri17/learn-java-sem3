package fakhri.lifetime;

public class MainLife {
    public static void main(String[] args) {
        ObjectLife myObject = new ObjectLife();
        myObject.performTask();
        myObject.initializeData();

        Person person = new Person();
        Person person1 = new Person("Fakhri");

        person1.DisplayName();

        person1 = null;
        person1.DisplayName();
        System.gc();


    }
}
