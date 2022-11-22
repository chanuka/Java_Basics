package com.generics;

import java.util.List;

public class PrinterAtMethod {

    public <T> void printValue(T t){
        System.out.println("This the value passed in at method level :" + t);
    }

    public void printWildValue(List<?> t){
        System.out.println("This the value passed in at method level :" + t);
    }

    public void printWildBoundedValue(List<? extends Animal> t){
        System.out.println("This the value passed in at method level :" + t);
    }
}
