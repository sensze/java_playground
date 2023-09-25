package DesignPattern.AbstractMethod.Furniture.ArtDeco;

import DesignPattern.AbstractMethod.Furniture.Sofa;

public class ArtDecoSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("ArtDecoSofa memiliki 4 kaki");
    }

    @Override
    public void sitOn() {
        System.out.println("Duduk di ArtDecoSofa");
    }
}
