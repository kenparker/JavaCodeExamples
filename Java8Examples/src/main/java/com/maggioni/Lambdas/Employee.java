package com.maggioni.Lambdas;

import java.util.Optional;
/*
https://stackoverflow.com/questions/17164375/subclassing-a-java-builder-class
https://metabroadcast.com/blog/builder-pattern-and-inheritance
 */
public class Employee extends Person {

    private Integer salary;

    public Employee(Builder builder) {
        super(builder);
        this.salary = builder.salary;
    }

    public static class Builder extends Person.Builder<Builder>{

        private Integer salary;

        public Builder() {
        }

        public Builder salary(Integer salary){
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

}
