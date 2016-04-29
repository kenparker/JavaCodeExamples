package com.maggioni.MostMissed;

interface Eatable {
    int types = 20;
}

class Food implements Eatable {
    public static int types = 30;
}
public class AbstractClassDemo2 extends Food implements Eatable{

    public static void main(String[] args) {
       
        // types = 11111; // do not compile types is ambigous
        Food food = new Food();
        food.types = 22222;
        Food.types = 33333;
        // Eatable.types = 5555; // do not compile types is final
    }

}
