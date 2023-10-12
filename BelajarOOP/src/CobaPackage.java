
import fakhri.oop.polymorphisme.Employee;
import fakhri.oop.polymorphisme.Manager;
import fakhri.oop.polymorphisme.VicePresident;
public class CobaPackage {
    public static void main(String[] args) {
        Employee e = new Employee("Fakhri");
        e.sayHello("Budi");

        e = new Manager("Fakhri");
        e.sayHello("Budi");

        e = new VicePresident("Fakhri");
        e.sayHello("Budi");
    }
}
