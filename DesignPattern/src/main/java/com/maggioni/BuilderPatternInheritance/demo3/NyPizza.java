package com.maggioni.BuilderPatternInheritance.demo3;

public class NyPizza extends Pizza {

    private String someFieldNyPizza;

    public static class Builder<T extends NyPizza.Builder<T>> extends Pizza.Builder<NyPizza.Builder<T>> {

        private String someFieldNyPizza;

        public T setSomeFieldNyPizza(String someFieldNyPizza) {
            this.someFieldNyPizza = someFieldNyPizza;
            return self();
        }

        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected T self() {
            return (T) this;
        }
    }

    protected NyPizza(Builder builder) {
        super(builder);
    }
}
