public class NomerClass {
    int nomor1, nomor2;

    // Penulisan method : <TipeData> <NamaMethod> (<TipeData Parameter> <NamaParameter (Opsional)){ <Statement> }
    int TambahkanNomor() {  // <--- Method dalam bentuk fungsi dan melakukan pengolahan data
        return nomor1 + nomor2;
    }

    void TampilkanNomor() { // <--- Method dalam bentuk prosedur tanpa melakukan pengolahan data
        System.out.printf("Nomer 1 : %d dan Nomer 2 : %d\n", nomor1, nomor2);
    }

}
