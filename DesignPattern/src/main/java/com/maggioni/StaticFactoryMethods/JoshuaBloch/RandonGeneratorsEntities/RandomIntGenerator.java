package com.maggioni.StaticFactoryMethods.JoshuaBloch.RandonGeneratorsEntities;

import java.util.Optional;

class RandomIntGenerator implements RandomGenerator<Integer> {
    private final Integer min;
    private final Integer max;

    RandomIntGenerator(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public static RandomIntGenerator between(Integer min, Integer max) {
        return new RandomIntGenerator(min, max);
    }

    public static RandomIntGenerator biggerThan(Integer min) {
        return new RandomIntGenerator(min, Integer.MAX_VALUE);
    }

    public static RandomIntGenerator smallerThan(Integer max) {
        return new RandomIntGenerator(Integer.MIN_VALUE, max);
    }

    @Override
    public Optional<Integer> next() {
        return Optional.of(10);
    }
}
