package DesignPattern.AbstractMethod.Furniture.Modern;

import DesignPattern.AbstractMethod.Furniture.Chair;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Modern Chair memiliki kaki besi.");
    }

    @Override
    public void sitOn() {
        System.out.println("Duduk di Modern Chair.");
    }
}
