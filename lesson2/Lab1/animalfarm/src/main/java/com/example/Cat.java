package com.example;

/**
 * Created by sthirumalai on 9/13/2016.
 */
public class Cat extends Animal{

    public Cat(String name, String color) {
        super(4, name, color, "cat", 0);
        setWeight(randomWeight(0.0, 26.0));
    }

    @Override
    public void grow() {
        setWeight(getWeight() * 3);
    }
}
