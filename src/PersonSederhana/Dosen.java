package PersonSederhana;

import java.util.Arrays;

public class Dosen {
    private String nidn;
    private String[] nimMahasiswa = new String[11];
    private int jumlahMahasiswa;

    /*Setter*/
    public void setNidn(String n){
        this.nidn = n;
    }
    public void setNimMahasiswa(String n){
        if (jumlahMahasiswa < nimMahasiswa.length) {
            this.nimMahasiswa[jumlahMahasiswa] = n;
            jumlahMahasiswa++;
        }
    }
    public void setJumlahMahasiswa(int j){
        this.jumlahMahasiswa = j;
    }

    /*Getter*/
    public String getNidn(){
        return this.nidn;
    }
    public String getNimMahasiswa(int i){
        return (nimMahasiswa[i]);
    }
    public int getJumlahMahasiswa(){
        return this.jumlahMahasiswa;
    }
}
