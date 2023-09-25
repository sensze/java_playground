package PersonSederhana;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;

    /*Setter*/
    public void setNim(String n){
        this.nim = n;
    }
    public void setNama(String n){
        this.nama = n;
    }
    public void setProdi(String p){
        this.prodi = p;
    }
    /*Getter*/
    public String getNim(){
        return this.nim;
    }
    public String getNama(){
        return this.nama;
    }
    public String getProdi(){
        return this.prodi;
    }
}
