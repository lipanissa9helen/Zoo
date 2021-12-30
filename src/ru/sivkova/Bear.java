package ru.sivkova;

public class Bear extends ZooAnimal {
    public Bear (String name, double weight, double normalWeight) {
        super(name, weight, normalWeight);
        allowedFoods = new Food[5];
        allowedFoods[0] = new Food("milk", 0.5);
        allowedFoods[1] = new Food("grass", 0.2);
        allowedFoods[2] = new Food("sticks", 0.8);
        allowedFoods[3] = new Food("breed", 0.3);
        allowedFoods[4] = new Food("chicken", 1.0);
    }
}
