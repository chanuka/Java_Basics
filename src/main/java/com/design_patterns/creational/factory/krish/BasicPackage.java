package com.design_patterns.creational.factory.krish;

public class BasicPackage extends Package {
    @Override
    protected void createPackage() {
        decorations.add(new BridalDeco());
    }
}
