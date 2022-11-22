package com.generics;

import javax.swing.plaf.PanelUI;

public class Dog implements Animal {
    private double weight;

    public Dog(Double weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating ..!!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                '}';
    }
}
