package fakhri.lifetime;

public class ObjectLife {
    private String data;

    // Metode untuk menjalankan tugas/operasi
    public void performTask() {
        if (data != null) {
            System.out.println("Melakukan tugas dengan data: " + data);
        } else {
            System.out.println("Data belum diinisialisasi.");
        }
    }
    public void initializeData() {
        data = "Nilai Awal";  // Inisialisasi data dengan nilai awal
        System.out.println("Data diinisialisasi: " + data);
    }

}
