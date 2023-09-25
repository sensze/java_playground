package DesignPattern.AbstractMethod.Furniture.ArtDeco;

import DesignPattern.AbstractMethod.Furniture.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Art Deco Chair memiliki elegant wooden legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("Duduk di Art Deco Chair with style.");
    }
}
