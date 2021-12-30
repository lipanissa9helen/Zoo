package ru.sivkova;

public class Lion extends ZooAnimal {
    public Lion(String name, double weight, double normalWeight) {
        super(name, weight, normalWeight);
        allowedFoods = new Food[2];
        allowedFoods[0] = new Food("chicken", 1.0);
        allowedFoods[1] = new Food("milk", 0.5);

    }
}
