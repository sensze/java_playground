package DesignPattern.AbstractMethod.Factory;

import DesignPattern.AbstractMethod.Furniture.ArtDeco.ArtDecoChair;
import DesignPattern.AbstractMethod.Furniture.ArtDeco.ArtDecoCoffeeTable;
import DesignPattern.AbstractMethod.Furniture.ArtDeco.ArtDecoSofa;
import DesignPattern.AbstractMethod.Furniture.Chair;
import DesignPattern.AbstractMethod.Furniture.CoffeeTable;
import DesignPattern.AbstractMethod.Furniture.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
