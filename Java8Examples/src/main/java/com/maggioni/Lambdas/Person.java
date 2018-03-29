package com.maggioni.Lambdas;

import java.util.Objects;
import java.util.Optional;

public class Person implements PersonInterface {

    private Optional<Integer> age;
    private Optional<String> name;
    private Optional<Gender> gender;

    protected Person(Builder<?,?> builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.gender = builder.gender;
    }

    public abstract static class Builder<T extends Person, B extends Builder<T,B>> {
        private Optional<Integer> age;
        private Optional<String> name;
        private Optional<Gender> gender;

        protected Builder() {
        }

        public B age(Integer age) {
            if (Objects.isNull(age) || age == 0)  throw new IllegalArgumentException("Age ist empty");
            this.age = Optional.of(age);
            return self();
        }


        public B name(String name) {
            this.name = Optional.of(name);
            return self();
        }

        public B gender(Gender gender) {
            this.gender = Optional.of(gender);
            return self();
        }

        protected abstract B self();
        public abstract T build();
    }

    public static class PersonBuilder extends Builder<Person, PersonBuilder>{

        @Override
        protected PersonBuilder self() {
            return this;
        }

        @Override
        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public Optional<Integer> getAge() {
        return this.age;
    }

    @Override
    public Optional<String> getName() {
        return this.name;
    }

    @Override
    public Optional<Gender> getGender() {
        return this.gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getAge(), person.getAge()) &&
                Objects.equals(getName(), person.getName()) &&
                getGender() == person.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), getGender());
    }
}
