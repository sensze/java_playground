package DesignPattern.AbstractMethod.Furniture.Victorian;

import DesignPattern.AbstractMethod.Furniture.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("Victorian Coffee Table punya 4 elegantly designed legs.");
    }

    @Override
    public void placeCoffee() {
        System.out.println("Meletakkan kopi cup di Victorian Coffee Table.");
    }
}
