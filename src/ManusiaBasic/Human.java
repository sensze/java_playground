package ManusiaBasic;

public class Human {
    public String name;
    private String kelamin;
    private int umur;

    public void setNama(String n){
        name = n;
    }
    public String getNama(){
        return this.name;
    }

    public void setKelamin(String k){
        kelamin = k;
    }
    public String getKelamin(){
        return this.kelamin;
    }

    public void setUmur(int u){
        umur = u;
    }

    public int getUmur(){
        return this.umur;
    }

    public void printAll(){
        System.out.println("Hai nama saya " + name + "Saya berjenis kelamin " + kelamin + "dan Saya berumur " + umur);
    }
}
