package fakhri.lifetime;

public class Person {
    private String name;

    public Person() {
        this.name = "Uknown";
    }

    public Person(String name) {
        this.name = name;
    }

    public void DisplayName() {
       try {
           System.out.println("Name: " + name);
       } catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
       }
    }
}
