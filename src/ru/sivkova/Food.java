package ru.sivkova;

public class Food {
    private final String name;
    private final double foodWeight;

    public Food(String name, double foodWeight) {
        this.name = name;
        this.foodWeight = foodWeight;
    }

    public String getName() {
        return name;
    }

    public double getFoodWeight() {
        return foodWeight;
    }
}
