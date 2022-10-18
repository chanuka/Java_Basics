package com.design_patterns.structural.adapter.bird_example;

public class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("Bird is Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
