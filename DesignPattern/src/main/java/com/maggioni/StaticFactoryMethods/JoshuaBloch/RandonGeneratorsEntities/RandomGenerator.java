package com.maggioni.StaticFactoryMethods.JoshuaBloch.RandonGeneratorsEntities;

import java.util.Optional;

public interface RandomGenerator<T> {
    Optional<T> next();
}
