package com.design_patterns.creational.singleton;

public class InnerClassLazySingleton {

    private InnerClassLazySingleton() {
    }

    private static class SingletonHelper {
        private static final InnerClassLazySingleton instance = new InnerClassLazySingleton();
    }

    public static InnerClassLazySingleton getInstance() {
        return SingletonHelper.instance;
    }
}
