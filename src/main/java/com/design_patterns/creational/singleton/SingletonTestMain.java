package com.design_patterns.creational.singleton;

public class SingletonTestMain {
    public static void main(String[] args) {
        EagerSingleton e1 = EagerSingleton.getInstance();
        System.out.println(e1.hashCode());
        EagerSingleton e2 = EagerSingleton.getInstance();
        System.out.println(e2.hashCode());

        LazySingleton l1 = LazySingleton.getInstance();
        System.out.println(l1.hashCode());
        LazySingleton l2 = LazySingleton.getInstance();
        System.out.println(l2.hashCode());


        DoubleCheckLazySingleton d1 = DoubleCheckLazySingleton.getInstance();
        System.out.println(d1.hashCode());
        DoubleCheckLazySingleton d2 = DoubleCheckLazySingleton.getInstance();
        System.out.println(d2.hashCode());

        InnerClassLazySingleton i1 = InnerClassLazySingleton.getInstance();
        System.out.println(i1.hashCode());
        InnerClassLazySingleton i2 = InnerClassLazySingleton.getInstance();
        System.out.println(i2.hashCode());

    }
}
