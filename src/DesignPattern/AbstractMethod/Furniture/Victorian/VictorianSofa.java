package DesignPattern.AbstractMethod.Furniture.Victorian;

import DesignPattern.AbstractMethod.Furniture.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("Victorian Sofa memiliki wooden legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("Duduk di Victorian Sofa.");
    }
}
