package com.design_patterns.creational.singleton;

public class LazySingleton {
    private LazySingleton(){}

    private static LazySingleton instance;

    public static synchronized LazySingleton getInstance()  { //synchronized keyword use for avoid the raze condition
        if(instance ==null) instance =  new LazySingleton();
        return instance;
    }
}
