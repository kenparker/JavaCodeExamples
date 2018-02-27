package com.maggioni.StaticFactoryMethods.RandonGeneratorsEntities;

import com.maggioni.StaticFactoryMethods.RandonGeneratorsEntities.RandomGenerator;

public class RandomGenerators {
    private RandomGenerators() {
    }

    public static RandomGenerator<Integer> getIntGenerator() {
        return new RandomIntGenerator(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static RandomGenerator<Integer> getIntBetweenGenerator(Integer min, Integer max) {
        return RandomIntGenerator.between(min, max);
    }

    public  static RandomGenerator<Integer> getIntSmallerThanGenerator(Integer min) {
        return RandomIntGenerator.biggerThan(min);
    }

    public static RandomGenerator<String> getStringGenerator(){
        return new RandomStringGenerator("");
    }
}
