package DesignPattern.AbstractMethod.Factory;

import DesignPattern.AbstractMethod.Furniture.Chair;
import DesignPattern.AbstractMethod.Furniture.CoffeeTable;
import DesignPattern.AbstractMethod.Furniture.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
