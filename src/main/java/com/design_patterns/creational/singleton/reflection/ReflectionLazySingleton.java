package com.design_patterns.creational.singleton.reflection;

public class ReflectionLazySingleton {

    private ReflectionLazySingleton() {
        if(instance != null){ // this is to avoid breaking singleton object.
            throw new IllegalStateException("Object can't be created using reflection");
        }
    }

    private static ReflectionLazySingleton instance;

    public static synchronized ReflectionLazySingleton getInstance() { //synchronized keyword use for avoid the raze condition
        if (instance == null) instance = new ReflectionLazySingleton();
        return instance;
    }
}
