package SuperClassMobil;

public class MobilMatic extends Mobil{
    public MobilMatic(String warna){
        super("Merah", "Hyundai");
    }

    @Override
    public void jalankan() {
        System.out.println("Gigi perseneleng berada di posisi N, tarik rem tangan");
    }
}
