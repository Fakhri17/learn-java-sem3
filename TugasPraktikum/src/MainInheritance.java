import com.fakhri.praktikum.inheritance.Doctor;
import com.fakhri.praktikum.inheritance.FamilyDoctor;
import com.fakhri.praktikum.inheritance.Surgeon;

public class MainInheritance {
    public static void main(String[] args) {
        // Intansiasi kelas Doctor
        Doctor doctor = new Doctor(true);
        doctor.setWorksAtHospital(false);
        System.out.println("Doctor bekerja di rumah sakit? " + doctor.getWorksAtHospital());
        doctor.treatPatient();

        // Intansiasi kelas FamilyDoctor
        FamilyDoctor familyDoctor = new FamilyDoctor(true, false);
        familyDoctor.setWorksAtHospital(true);
        System.out.println("FamilyDoctor bekerja di rumah sakit? " + familyDoctor.getWorksAtHospital());
        System.out.println("FamilyDoctor membuat kunjungan rumah? " + familyDoctor.getMakeHouseCalls());

        // Instasisasi kelas surgeon
        Surgeon surgeon = new Surgeon(true);
        surgeon.treatPatient();
        surgeon.makeIncision();
    }
}
