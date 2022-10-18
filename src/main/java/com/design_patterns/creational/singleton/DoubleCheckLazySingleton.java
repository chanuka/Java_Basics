package com.design_patterns.creational.singleton;

public class DoubleCheckLazySingleton {

    private DoubleCheckLazySingleton(){}

    private static DoubleCheckLazySingleton instance;

    public static DoubleCheckLazySingleton getInstance()  { //synchronized keyword use for avoid the raze condition
        if(instance ==null){
            synchronized (DoubleCheckLazySingleton.class){
                if(instance ==null){
                    instance =  new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
