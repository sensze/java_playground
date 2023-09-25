package BangunDatar;

public class PersegiPanjang extends BangunDatar {

    private int lebar = 1;
    private int panjang = 1;

    PersegiPanjang(int p, int l) {
        this.panjang = p;
        this.lebar = l;
    }

    @Override
    Double CariLuas() {
        return (double) this.panjang * this.lebar;
    }

    @Override
    Double CariKeliling() {
        return (double) (2 * panjang) + (2 * lebar);
    }
}
