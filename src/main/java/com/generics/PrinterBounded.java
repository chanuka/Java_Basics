package com.generics;

public class PrinterBounded<T extends Animal> {
    T t;

    public PrinterBounded(T t) {
        this.t = t;
    }

    public void printValue() {
        System.out.println("This is the value passed in :" + this.t);
    }

}
