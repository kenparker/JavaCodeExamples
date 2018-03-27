package com.maggioni.BuilderPatternInheritance.demo3;

public class ThaiPizza extends NyPizza {

    public static class  Builder extends NyPizza.Builder<Builder> {

        private String someFieldThai;

        public Builder setSomeFieldThai(String someFieldThai) {
            this.someFieldThai = someFieldThai;
            return self();
        }

        public ThaiPizza build() {
            return new ThaiPizza(this);
        }

        protected Builder self() {
            return this;
        }

    }
    private ThaiPizza(Builder builder) {
        super(builder);
    }
}
