package com.maggioni.StaticFactoryMethods.RandonGeneratorsEntities;

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
    public Integer next() {
        return null;
    }
}
