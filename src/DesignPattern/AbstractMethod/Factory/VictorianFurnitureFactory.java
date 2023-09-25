package DesignPattern.AbstractMethod.Factory;

import DesignPattern.AbstractMethod.Furniture.Chair;
import DesignPattern.AbstractMethod.Furniture.CoffeeTable;
import DesignPattern.AbstractMethod.Furniture.Sofa;
import DesignPattern.AbstractMethod.Furniture.Victorian.VictorianChair;
import DesignPattern.AbstractMethod.Furniture.Victorian.VictorianCoffeeTable;
import DesignPattern.AbstractMethod.Furniture.Victorian.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
