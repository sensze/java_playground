package SuperClassMobil;

public class Mobil {
    private String warna, merk;

    public Mobil(String warna, String merk){
        this.warna = warna;
        this.merk = merk;
    }

    public Mobil(String merk){
        this(merk, "New Innova Reborn");
    }

    public void jalankan(){
        System.out.println("Masukkan gigi 1 dan injak kopling");
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getWarna(){
        return this.warna;
    }
}
