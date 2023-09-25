package BangunDatar;

public class BujurSangkar extends BangunDatar {

    private int sisi = 1;

    BujurSangkar(int s) {
        this.sisi = s;
    }

    @Override
    Double CariLuas() {
        return (double) (this.sisi * this.sisi);
    }

    @Override
    Double CariKeliling() {
        return (double) (4 * this.sisi);
    }
}
