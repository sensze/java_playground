package DesignPattern.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        RoadLogistic roadLogistic = new RoadLogistic();
        Transport truck = roadLogistic.createTransport();
        truck.deliver();

        SeaLogistic seaLogistic = new SeaLogistic();
        Transport ship = seaLogistic.createTransport();
        ship.deliver();
    }
}