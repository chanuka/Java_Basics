package com.design_patterns.creational.singleton.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTestMain {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ReflectionLazySingleton l1 = ReflectionLazySingleton.getInstance();
        System.out.println(l1.hashCode());

        ReflectionLazySingleton l2 = null;
        Constructor[] constructors = ReflectionLazySingleton.class.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            l2 = (ReflectionLazySingleton)constructor.newInstance();
        }

        System.out.println(l2.hashCode());

    }
}
