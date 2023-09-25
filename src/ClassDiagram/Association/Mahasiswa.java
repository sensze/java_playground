package ClassDiagram.Association;

public class Mahasiswa {
    public String nrp;
    public String nama;
    public Jurusan jurusan;

    public void setJurusan(Jurusan jurusan){
        this.jurusan = jurusan;
    }
    public Jurusan getJurusan(){
        return this.jurusan;
    }
}
