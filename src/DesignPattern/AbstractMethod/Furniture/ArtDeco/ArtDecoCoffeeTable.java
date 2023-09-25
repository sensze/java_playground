package DesignPattern.AbstractMethod.Furniture.ArtDeco;

import DesignPattern.AbstractMethod.Furniture.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("Art Deco Coffee Table memiliki 4 kaki");
    }

    @Override
    public void placeCoffee() {
        System.out.println("Meletakkan kopi di Art Deco Coffee Table");
    }
}
