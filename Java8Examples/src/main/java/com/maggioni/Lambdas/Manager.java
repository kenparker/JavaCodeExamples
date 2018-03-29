package com.maggioni.Lambdas;

public class Manager extends Employee {

    private Manager(Builder<?,?> builder) {
        super(builder);
    }

    public abstract static class Builder<T extends Employee, B extends Builder<T,B>> extends Employee.Builder<T,B>{

        protected Builder() {
        }
    }

    public static class ManagerBuilder extends Builder<Manager,ManagerBuilder> {

        @Override
        protected ManagerBuilder self() {
            return this;
        }

        @Override
        public Manager build() {
            return new Manager(this);
        }
    }

}
