package PersonSederhana;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();

        Mahasiswa risyad = new Mahasiswa();
        Mahasiswa aldi = new Mahasiswa();
        Dosen fahrul = new Dosen();

        risyad.setNim("312050001");
        risyad.setNama("Risyad");
        aldi.setNim("312050002");
        aldi.setNama("Aldi");

        mahasiswaList.add(risyad.getNama());
        mahasiswaList.add(aldi.getNama());

        fahrul.setNidn("312010001");
        fahrul.setNimMahasiswa(risyad.getNim()); // Panggil getNim milik Mahasiswa
        fahrul.setNimMahasiswa(aldi.getNim());
        System.out.println("NIDN dosen: " + fahrul.getNidn());
        System.out.println("Mengajar mahasiswa");
        int mhs = fahrul.getJumlahMahasiswa(); // Dapatkan jumlah mahasiswa
        for(int i = 0; i < mhs; i++){
            System.out.println("\t NIM: " + fahrul.getNimMahasiswa(i) + ", Nama: " + mahasiswaList.get(i));
        }

    }
}
