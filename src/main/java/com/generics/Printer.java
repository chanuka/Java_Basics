package com.generics;

public class Printer<E> {
    E e;

    public Printer(E e) {
        this.e = e;
    }
    public void printValue(){
        System.out.println("This the value pass in : " + this.e);
    }
}
