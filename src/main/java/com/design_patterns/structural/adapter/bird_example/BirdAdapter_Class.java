package com.design_patterns.structural.adapter.bird_example;

public class BirdAdapter_Class extends Sparrow implements ToyDuck {
    @Override
    public void squeak() {
        super.makeSound();
    }
}
