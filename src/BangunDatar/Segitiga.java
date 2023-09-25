package BangunDatar;

public class Segitiga extends BangunDatar {
    private int alas = 1;
    private int tinggi = 1;
    private int sisi = 1;

    Segitiga(int a, int t, int s) {
        this.alas = a;
        this.tinggi = t;
        this.sisi = s;
    }

    @Override
    Double CariLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    @Override
    Double CariKeliling() {
        return (double) (alas + (2 * sisi));
    }
}
