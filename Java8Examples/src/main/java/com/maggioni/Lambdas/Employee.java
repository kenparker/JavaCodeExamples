package com.maggioni.Lambdas;

import java.util.Optional;

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
