package com.design_patterns.creational.singleton.serializable;

import java.io.Serializable;

public class SerializableLazySingleton implements Serializable {
    private SerializableLazySingleton() {
    }

    private static SerializableLazySingleton instance;

    protected Object readResolve(){ // this is to avoid breaking singleton object.
        return instance;
    }

    public static synchronized SerializableLazySingleton getInstance() { //synchronized keyword use for avoid the raze condition
        if (instance == null) instance = new SerializableLazySingleton();
        return instance;
    }
}
