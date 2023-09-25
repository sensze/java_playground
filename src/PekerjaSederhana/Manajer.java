package PekerjaSederhana;

public class Manajer extends Pegawai{
    private int tunjangan;
    public Manajer(String nama, int gaji, int tunjangan){
        super(nama, gaji); // --> Memasukkan value dari method ke constructor superclass (Pegawai)
        this.tunjangan = tunjangan;
    }
    public int getGaji(){
        return super.getGaji();
    }
    public int getTunjangan(){
        return this.tunjangan;
    }
}
