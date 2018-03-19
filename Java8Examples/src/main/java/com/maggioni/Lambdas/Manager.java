package com.maggioni.Lambdas;

public class Manager extends Employee {

    private Manager(Builder builder) {
        super(builder);
    }

    public static class Builder extends Employee.Builder{

        public Builder() {
        }

        public Manager build() {
            return new Manager(this);
        }
    }
}
