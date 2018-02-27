package com.maggioni.StaticFactoryMethods.RandonGeneratorsEntities;

import java.util.Optional;

public interface RandomGenerator<T> {
    Optional<T> next();
}
