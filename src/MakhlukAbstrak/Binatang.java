package MakhlukAbstrak;

public class Binatang extends MahlukHidup{
    private String kakiEmpat, kakiDua;

    Binatang(String kakiEmpat, String kakiDua){
        this.kakiDua = kakiDua;
        this.kakiEmpat = kakiEmpat;
    }
    @Override
    public void Berdiri() {
        System.out.println("Kambing berdiri menggunakan = " + this.kakiEmpat);
        System.out.println("Ayam berdiri menggunakan = " + this.kakiDua);
    }
}
