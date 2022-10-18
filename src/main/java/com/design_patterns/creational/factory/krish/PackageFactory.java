package com.design_patterns.creational.factory.krish;

public class PackageFactory {

    public static Package createPackage(PackageCode packageCode) {

        switch (packageCode) {
            case BASIC: return new BasicPackage();
            case SILVER: return new SilverPackage();
            case GOLD: return new GoldPackage();
            case PLATINUM: return new PlatinumPackage();
            default: return null;
        }
    }
}
