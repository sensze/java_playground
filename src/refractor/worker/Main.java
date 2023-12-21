package refractor.worker;

public class Main {
    public static void main(String[] args) {
        CTO cto = new CTO();
        cto.membuatLaporanHarian();

        COO coo = new COO();
        coo.membuatLaporanHarian();

        CMO cmo = new CMO();
        cmo.membuatLaporanHarian();
    }
}
