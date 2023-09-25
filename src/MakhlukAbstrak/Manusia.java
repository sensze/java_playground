package MakhlukAbstrak;

public class Manusia extends MahlukHidup{
    private String duaKaki;

    Manusia(String duaKaki){
        this.duaKaki = duaKaki;
    }
    @Override
    public void Berdiri() {
        System.out.println("Manusia berdiri menggunakan = " + this.duaKaki);
    }
}
