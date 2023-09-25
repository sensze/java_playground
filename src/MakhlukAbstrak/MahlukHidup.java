package MakhlukAbstrak;

public abstract class MahlukHidup {
    /*Abstract class dapat memiliki body. Interface tidak dapat diberikan body*/
    public abstract void Berdiri();

    public void Oksigen(){
        System.out.println(" - perlu makan");
        System.out.println(" - perlu oksigen");
        System.out.println(" - perlu air");
    }
}
