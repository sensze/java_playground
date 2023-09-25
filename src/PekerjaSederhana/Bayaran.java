package PekerjaSederhana;

public class Bayaran {
    public int hitungBayaran(Pegawai pegawai){ // --> Mengambil instance pegawai dari main
        int uang = pegawai.getGaji();
        if(pegawai instanceof Manajer){ // --> Mengecek apakah pegawai instance manajer atau programmer
            uang += ((Manajer) pegawai).getTunjangan();
        } else if(pegawai instanceof Programmer){
            uang += ((Programmer) pegawai).getBonus();
        }
        return uang;
    }
}
