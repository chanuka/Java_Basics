package com.design_patterns.creational.factory.krish;

public class GoldPackage extends Package {
    @Override
    protected void createPackage() {
        decorations.add(new BridalDeco());
        decorations.add(new BridesMaidDeco());
        decorations.add(new ParentDeco());
    }
}
