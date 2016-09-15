package com.example;

/**
 * Created by sthirumalai on 9/13/2016.
 */
public class Dog extends Animal{

    public Dog(String name, String color) {
        super(4, name, color, "dog", 0);
        setWeight(randomWeight(0.0, 26.0));
    }

    @Override
    public void grow() {
        setWeight(getWeight() * 1.5);
    }
}
