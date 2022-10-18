package com.design_patterns.creational.factory.krish;

public class PlatinumPackage extends Package {
    @Override
    protected void createPackage() {
        decorations.add(new BridalDeco());
        decorations.add(new BridesMaidDeco());
        decorations.add(new ParentDeco());
        decorations.add(new FlowerGirlDeco());
    }
}
