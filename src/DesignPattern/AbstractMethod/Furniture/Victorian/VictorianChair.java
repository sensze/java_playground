package DesignPattern.AbstractMethod.Furniture.Victorian;

import DesignPattern.AbstractMethod.Furniture.Chair;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Victorian Chair memiliki 4 kaki.");
    }

    @Override
    public void sitOn() {
        System.out.println("Duduk di Victorian Chair.");
    }
}
