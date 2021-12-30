package ru.sivkova;

abstract class ZooAnimal {

    protected String name;
    protected double weight;
    protected double normalWeight;
    protected Food[] allowedFoods;


    public ZooAnimal(String name, double weight, double normalWeight) {
        this.name = name;
        this.weight = weight;
        this.normalWeight = normalWeight;
    }

    protected void feed(Food food) {
        weight = weight + food.getFoodWeight();
    }

    protected boolean isFoodAllowed(Food food) {
        for(int i = 0; i < allowedFoods.length; i++) {
            Food a = allowedFoods[i];
            if(food.getName().equals(a.getName())) {
                return true;
            }
        }
        return false;
    }

    protected boolean isFat() {
        return weight >= normalWeight;
    }


    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getNormalWeight() {
        return normalWeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setNormalWeight(double normalWeight) {
        this.normalWeight = normalWeight;
    }

}

