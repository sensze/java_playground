package DesignPattern.FactoryMethod;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Mengirimkan menggunakan Kapal");
    }
}
