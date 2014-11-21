package com.maggioni.comparator.Example4;

import java.util.Arrays;

public class SortFruitObject {

    public static void main(String args[]) {

        Fruit[] fruits = new Fruit[4];

        Fruit pineappale = new Fruit("Pineapple", "Pineapple description", 70);
        Fruit apple = new Fruit("Apple", "Apple description", 100);
        Fruit orange = new Fruit("Orange", "Orange description", 80);
        Fruit banana = new Fruit("Banana", "Banana description", 90);

        fruits[0] = pineappale;
        fruits[3] = banana;
        fruits[2] = orange;
        fruits[1] = apple;
        
        System.out.println("Array listed by Quantity :");
        Arrays.sort(fruits);
        print(fruits);
        System.out.println("Array listed by Name :");
        
        Arrays.sort(fruits, Fruit.FruitNameComparator);
        print(fruits);

    }

    private static void print(Fruit[] fruits) {
        int i = 0;
        for (Fruit temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp.getFruitName()
                    + ", Quantity : " + temp.getQuantity());
        }
    }
}
