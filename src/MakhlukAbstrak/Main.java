package MakhlukAbstrak;

public class Main {
    public void cekMahlukHidup(MahlukHidup mh){
        mh.Berdiri();
        mh.Oksigen();
    }
    public static void main(String[] args) {
        Main mmh = new Main();
        mmh.cekMahlukHidup(new Manusia("Dua Kaki"));
        System.out.println("===============================");
        mmh.cekMahlukHidup(new Binatang("Empat Kaki", "Dua Kaki"));
        System.out.println("===============================");
        mmh.cekMahlukHidup(new Pohon("Akar"));
        System.out.println("===============================");
    }
}
