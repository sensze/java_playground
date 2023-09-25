package BangunDatar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, p, l, a, t, sm;

        System.out.println("Masukkan sisi bujur sangkar");
        s = input.nextInt();
        System.out.println("Masukkan panjang persegi panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar persegi panjang");
        l = input.nextInt();
        System.out.println("Masukkan alas segitiga");
        a = input.nextInt();
        System.out.println("Masukkan tinggi segitiga");
        t = input.nextInt();
        System.out.println("Masukkan sisi miring segitiga");
        sm = input.nextInt();
        System.out.println("===================================================================");

        BujurSangkar bs = new BujurSangkar(s);
        PersegiPanjang pp = new PersegiPanjang(p, l);
        Segitiga st = new Segitiga(a, t, sm);
        System.out.println("Luas bujur sangkar dengan s = " + s + " adalah = " + bs.CariLuas());
        System.out.println("Luas persegi panjang dengan p = " + p + " dan luas" + l + " adalah = " + pp.CariLuas());
        System.out.println("Luas segitiga dengan a = " + a + " dan tinggi" + t + " dan sisi miring" + sm + " adalah = " + st.CariLuas());
        System.out.println();
        System.out.println("Keliling bujur sangkar dengan s = " + s + " adalah = " + bs.CariKeliling());
        System.out.println("Keliling persegi panjang dengan p = " + p + " dan luas" + l + " adalah = " + pp.CariKeliling());
        System.out.println("Keliling segitiga dengan a = " + a + " dan tinggi" + t + " dan sisi miring" + sm + " adalah = " + st.CariKeliling());
    }
}
