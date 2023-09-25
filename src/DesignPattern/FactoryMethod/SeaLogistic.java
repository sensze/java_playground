package DesignPattern.FactoryMethod;

public class SeaLogistic implements Logistic{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
