package com.design_patterns.structural.adapter.bird_example;

public class PlasticToyDuck implements ToyDuck{
    @Override
    public void squeak() {
        System.out.println("Chirp Chirp");
    }
}
