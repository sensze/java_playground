package ItemSederhana;

public class Main {
    public static void main(String[] args) {
        try{
            FungsiPros.isRunning = true;
            while (FungsiPros.isRunning){
                FungsiPros.showMenu();
            }
        } catch (Exception e){
            System.out.println("Terdapat kesalahan!" + e.getMessage());
        }
    }
}