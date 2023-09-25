package DesignPattern.AbstractMethod.Furniture.Modern;

import DesignPattern.AbstractMethod.Furniture.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("Modern Sofa memiliki kaki elegan");
    }

    @Override
    public void sitOn() {
        System.out.println("Duduk di modern sofa");
    }
}
