package com.maggioni.Lambdas;

import java.util.Optional;
/*
https://stackoverflow.com/questions/17164375/subclassing-a-java-builder-class
https://metabroadcast.com/blog/builder-pattern-and-inheritance
 */
public class Employee extends Person {

    private Integer salary;

    public Employee(Builder<?,?> builder) {
        super(builder);
        this.salary = builder.salary;
    }

    public static Employee.Builder<Employee, EmployeeBuilder> builder() {
        return new EmployeeBuilder();
    }

    public abstract static class Builder<T extends Person, B extends Builder<T,B>> extends Person.Builder<T,B>{

        private Integer salary;

        protected Builder() {
        }

        public B salary(Integer salary){
            this.salary = salary;
            return self();
        }
    }

    public static class EmployeeBuilder extends Builder<Employee, EmployeeBuilder> {

        @Override
        protected EmployeeBuilder self() {
            return this;
        }

        @Override
        public Employee build() {
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
