package com.maggioni.StaticFactoryMethods.RandonGeneratorsEntities;

import java.util.Optional;

class RandomStringGenerator implements RandomGenerator<String> {
    private final Optional<String> prefix;

    RandomStringGenerator(String prefix) {
        this.prefix = Optional.of(prefix);
    }

    @Override
    public Optional<String> next() {
        return Optional.of("String");
    }
}
