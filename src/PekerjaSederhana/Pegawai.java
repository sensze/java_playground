package PekerjaSederhana;

public class Pegawai {
    protected String nama;
    protected int gaji;

    public Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji(){
        return this.gaji;
    }
}
