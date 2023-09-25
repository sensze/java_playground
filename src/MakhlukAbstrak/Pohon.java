package MakhlukAbstrak;

public class Pohon extends MahlukHidup{
    private String akar;

    Pohon(String akar){
        this.akar = akar;
    }
    @Override
    public void Berdiri() {
        System.out.println("Tumbuhan berdiri menggunakan = " + this.akar);
    }
}
