package DesignPattern.AbstractMethod.Factory;

import DesignPattern.AbstractMethod.Furniture.Chair;
import DesignPattern.AbstractMethod.Furniture.CoffeeTable;
import DesignPattern.AbstractMethod.Furniture.Modern.ModernChair;
import DesignPattern.AbstractMethod.Furniture.Modern.ModernCoffeeTable;
import DesignPattern.AbstractMethod.Furniture.Modern.ModernSofa;
import DesignPattern.AbstractMethod.Furniture.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
