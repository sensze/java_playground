package DesignPattern.FactoryMethod;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Mengirimkan menggunakan Truk");
    }
}
