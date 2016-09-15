package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by sthirumalai on 9/14/2016.
 */
public class Farm{
    ArrayList Animals;

    public Farm() {
        this.Animals = new ArrayList();
    }

    public void addAnimal(Animal animal) {
        Animals.add(animal);
    }

    public Animal getAnimal(int index) {
        return (Animal) Animals.get(index);
    }

    public ArrayList<Animal> getHeaviestAnimals() {
        ArrayList<Animal> sortedAnimals = Animals;
        Collections.sort(sortedAnimals, new Comparator<Animal>() {
            @Override
            public int compare(Animal animal2, Animal animal1)
            {
                double weight1 = animal1.getWeight();
                double weight2 = animal2.getWeight();
                return (int) (weight1 - weight2);
            }
        });
        return sortedAnimals;
    }

}
