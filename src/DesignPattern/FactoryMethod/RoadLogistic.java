package DesignPattern.FactoryMethod;

public class RoadLogistic implements Logistic{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
