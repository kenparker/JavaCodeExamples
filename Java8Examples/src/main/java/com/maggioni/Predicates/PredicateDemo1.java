package com.maggioni.Predicates;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateDemo1 {

    public Predicate<String> nonNull = Objects::nonNull;
    public Predicate<String> isNull = Objects::isNull;

    public Objects objects;
}
