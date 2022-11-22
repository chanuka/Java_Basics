package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Printer<String> stringPrinter = new Printer<>("Chanuka");

        stringPrinter.printValue();

        Printer<Double> numberPrinter = new Printer<>(33.5);

        numberPrinter.printValue();

        PrinterAtMethod pm = new PrinterAtMethod();
        pm.printValue("Chanuu");
        pm.printValue(55.55);

        List<String> lst = new ArrayList<>();
        lst.add("Janaka-Hennadi");
        pm.printWildValue(lst);
        List<Integer> i = new ArrayList<>();
        i.add(65);
        pm.printWildValue(i);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(88.25));
        dogs.add(new Dog(33.25));
        pm.printWildBoundedValue(dogs);

        PrinterBounded<Dog> p = new PrinterBounded(new Dog(25.65));
        p.printValue();
    }
}
