package CetakLaporanInterface;

public class Laporan implements CetakLaporan{
    @Override
    public void CetakA4() {
        System.out.println("Cetak laporan format A4");
    }

    @Override
    public void CetakA5() {
        System.out.println("Cetak laporan format A5");
    }

    @Override
    public void CetakCustomSize() {
        System.out.println("Cetak laporan custom size");
    }
}
