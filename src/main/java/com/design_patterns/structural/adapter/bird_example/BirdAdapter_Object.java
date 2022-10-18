package com.design_patterns.structural.adapter.bird_example;

public class BirdAdapter_Object implements ToyDuck{

    Bird bird;

    public BirdAdapter_Object(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
