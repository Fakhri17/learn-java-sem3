package com.quiz.fakhri;

public class MainAnimal {
    public static void main(String[] args) {
        // Menggunakan Upcasting
        Animal duck = new Duck(20, "Male", "Yellow");
        Animal fish = new Fish(21, "Female", 2, true);
        Animal zebra = new Zebra(22, "Male", true, true);

        System.out.println("Duck");
        // ambil data dari Upcasting
        System.out.println("Age: " + duck.age);
        System.out.println("Gender: " + duck.gender);
        // Downcasting
        Duck duck1 = (Duck) duck;
        System.out.println("Beak Color: " + duck1.beakColor);
        duck1.swim();
        // overloading dengan 1 parameter
        duck1.swim(10);
        duck1.quack();
        System.out.println("Is Mammal: " + duck.isMammal(true));
        duck.mate("Bebek Female");

        System.out.println("\nFish");
        // ambil data dari Upcasting
        System.out.println("Age: " + fish.age);
        System.out.println("Gender: " + fish.gender);
        // Downcasting
        Fish fish1 = (Fish) fish;
        System.out.println("Size in Ft: " + fish1.sizeInFt);
        System.out.println("Can Eat: " + fish1.canEat);
        fish1.swim();
        // overloading dengan 2 parameter
        fish1.swim(20, "Ikan Cupang");
        System.out.println("Is Mammal: " + fish.isMammal(false));
        fish1.mate("Ikan Male");

        System.out.println("\nZebra");
        // ambil data dari Upcasting
        System.out.println("Age: " + zebra.age);
        System.out.println("Gender: " + zebra.gender);
        // Downcasting
        Zebra zebra1 = (Zebra) zebra;
        System.out.println("Is Wild: " + zebra1.is_wild);
        zebra1.run();
        // overloading dengan 2 parameter
        zebra1.run(30, true);
        System.out.println("Is Mammal: " + zebra.isMammal(true));
        zebra1.mate("Zebra Female");

    }
}
