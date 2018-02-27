package com.maggioni.StaticFactoryMethods.RandonGeneratorsEntities;

import com.maggioni.StaticFactoryMethods.RandonGeneratorsEntities.RandomGenerator;

class RandomStringGenerator implements RandomGenerator<String> {
    private final String prefix;

    RandomStringGenerator(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String next() {
        return null;
    }
}
