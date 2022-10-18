package com.oop.inheritance.multiple;

public interface InterfaceA {
    public void doSomething();

    public default void doDefault(){
        doStatic();
    }
    public static void doStatic(){
        System.out.println("This is from doStatic method at interface level ");
    }
//    public default void doStatic(){
//        System.out.println("This is from doStatic method at interface level ");
//    }
}
