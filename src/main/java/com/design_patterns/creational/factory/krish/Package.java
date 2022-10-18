package com.design_patterns.creational.factory.krish;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {

    protected List<Decoration> decorations = new ArrayList<>();

    public Package() {
        createPackage();
    }

    protected abstract void createPackage();

    @Override
    public String toString(){
        return "Package { Decorations = "+ decorations +" }";
    }
}
