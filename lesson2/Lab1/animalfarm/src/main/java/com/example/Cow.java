package com.example;

/**
 * Created by sthirumalai on 9/13/2016.
 */
public class Cow extends Animal{

    public Cow(String name, String color) {
        super(4, name, color, "cow", 0);
        setWeight(randomWeight(100.0, 200.0));
    }

    @Override
    public void grow() {
        setWeight(getWeight() * 5);
    }
}
