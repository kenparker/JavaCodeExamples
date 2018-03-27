package com.maggioni.BuilderPatternInheritance.demo3;

public abstract class Pizza {

    abstract static class Builder<T extends Builder<T>> {
        public T returnThis() {
            return self();
        }
        abstract Pizza build();
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {

    }
}
