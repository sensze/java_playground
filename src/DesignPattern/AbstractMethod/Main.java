package DesignPattern.AbstractMethod;

import DesignPattern.AbstractMethod.Factory.FurnitureFactory;
import DesignPattern.AbstractMethod.Factory.ModernFurnitureFactory;
import DesignPattern.AbstractMethod.Factory.VictorianFurnitureFactory;
import DesignPattern.AbstractMethod.Furniture.Chair;
import DesignPattern.AbstractMethod.Furniture.Sofa;

public class Main {
    public static void main(String[] args) {
        /*Victorian Sofa*/
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Sofa victorianSofa = victorianFactory.createSofa();
        victorianSofa.hasLegs();
        victorianSofa.sitOn();

        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        modernChair.hasLegs();
        modernChair.sitOn();
    }
}
