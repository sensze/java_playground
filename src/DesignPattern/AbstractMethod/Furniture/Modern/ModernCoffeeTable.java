package DesignPattern.AbstractMethod.Furniture.Modern;

import DesignPattern.AbstractMethod.Furniture.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("Meja kopi modern memiliki 4 kaki");
    }

    @Override
    public void placeCoffee() {
        System.out.println("Meletakkan kopi di atas meja kopi modern");
    }
}
