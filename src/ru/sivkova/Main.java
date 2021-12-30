package ru.sivkova;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int a = 6;
        a = 5;
        a = 7;
        System.out.println(a);


        Deer deer = new Deer("Nika", 80.0, 100.0);
        Lion lion = new Lion("Lev", 100.0, 130.0);
        Bear bear = new Bear("Misha", 150.0, 200.0);

        Food[] foods = new Food[5];
        foods[0] = new Food("milk", 0.5);
        foods[1] = new Food("chicken", 1.0);
        foods[2] = new Food("grass", 0.2);
        foods[3] = new Food("breed", 0.3);
        foods[4] = new Food("sticks", 0.8);

        while (!lion.isFat()) {
            //Food food = foods[new Random().nextInt(5)];
            Random random = new Random();
            int randomInt = random.nextInt(5);
            Food food = foods[randomInt];
            System.out.println("Текущий вес: " + lion.getWeight());
            System.out.println("Продукт: "  + food.getName());
            lion.feed(food);
            System.out.println("Вес после кормления: " + lion.getWeight());
        }


        /*int[] digits = new int[] {1, 2, 3, 4};

        System.out.println(contains(digits, 5)); //false
        System.out.println(contains(digits, 1)); //true
        System.out.println(contains(digits, 6)); //false
        System.out.println(contains(digits, 3)); //true*/

    }

    public static boolean contains(int[] digits, int s) {
        for(int i = 0; i < digits.length; i++) {
            int a = digits[i]; // достает значение ячейки под индексом i
            if (a == s) {
                return true;
            }
        }
        return false;
    }

}

