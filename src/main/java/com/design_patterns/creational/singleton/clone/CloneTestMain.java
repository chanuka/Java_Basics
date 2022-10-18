package com.design_patterns.creational.singleton.clone;

public class CloneTestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneLazySingleton l1 = CloneLazySingleton.getInstance();
        System.out.println(l1.hashCode());

        CloneLazySingleton l2 = (CloneLazySingleton) l1.clone();
        System.out.println(l2.hashCode());

    }
}
