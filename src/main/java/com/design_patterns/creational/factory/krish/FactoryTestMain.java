package com.design_patterns.creational.factory.krish;

public class FactoryTestMain {
    public static void main(String[] args) {
        Package p1 = PackageFactory.createPackage(PackageCode.BASIC);
        System.out.println(p1);

        Package p2 = PackageFactory.createPackage(PackageCode.GOLD);
        System.out.println(p2);
    }
}
