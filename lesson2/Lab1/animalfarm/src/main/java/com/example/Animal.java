package com.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sthirumalai on 9/12/2016.
 */
public abstract class Animal{
    private int legs;
    private String name;
    private String color;
    private String species;
    private double weight;

    public Animal (int myLegs, String myName, String myColor, String mySpecies, int myWeight) {
        legs = myLegs;
        name = myName;
        color = myColor;
        species = mySpecies;
        weight = myWeight;
    }

//    getter and setter methods

    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public double getWeight() {return weight;}
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //grow (multiply weight by a value defined in each subclass)
    public abstract void grow();
    //return random weight decimal between minimum and maximum value
    public double randomWeight(double min, double max) {
        Random rand = new Random();
        return rand.nextDouble() * (max - min) + min;
    }

    //test that all animals work properly
    public static void main(String[] args) {
        Cat c = new Cat("Meowth", "black");
        Dog d = new Dog("Puppy", "brown");
        Cow cow = new Cow("Mooer", "white");
        System.out.println("Test 1 Passed: " + (c.getWeight() >= 0 && c.getWeight() <= 25));
        System.out.println("Test 2 Passed: " + (d.getWeight() >= 0 && d.getWeight() <= 25));
        System.out.println("Test 3 Passed: " + (cow.getWeight() >= 100 && cow.getWeight() <= 200));

        double old_weight_cat = c.getWeight();
        double old_weight_dog = d.getWeight();
        double old_weight_cow = cow.getWeight();
        c.grow();
        d.grow();
        cow.grow();
        System.out.println("Test 4 Passed: " + (c.getWeight() / old_weight_cat == 3));
        System.out.println("Test 5 Passed: " +
                (Math.abs(d.getWeight() / old_weight_dog - 1.5) < 0.01));
        System.out.println("Test 6 Passed: " + (cow.getWeight() / old_weight_cow == 5));

        Farm farm = new Farm();
        farm.addAnimal(c);
        farm.addAnimal(d);
        farm.addAnimal(cow);

        ArrayList<Animal> sorted = farm.getHeaviestAnimals();
        for(int i = 0; i < sorted.size() - 1; i++) {
            System.out.println("Test " + (i + 7) + " Passed: " + (sorted.get(i).getWeight() > sorted.get(i + 1).getWeight()));
        }
        System.out.println("Test 9 Passed: " + (farm.getAnimal(0) == c));
        System.out.println("Test 10 Passed: " + (farm.getAnimal(1) == d));
        System.out.println("Test 11 Passed: " + (farm.getAnimal(2) == cow));

    }

}
