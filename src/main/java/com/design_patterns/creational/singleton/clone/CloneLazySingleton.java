package com.design_patterns.creational.singleton.clone;

public class CloneLazySingleton extends MyClone {
    private CloneLazySingleton() {
    }

    private static CloneLazySingleton instance;

    @Override
    protected Object clone() throws CloneNotSupportedException { // this is to avoid breaking singleton object.
        throw new CloneNotSupportedException();
    }

    public static synchronized CloneLazySingleton getInstance() { //synchronized keyword use for avoid the raze condition
        if (instance == null) instance = new CloneLazySingleton();
        return instance;
    }
}
