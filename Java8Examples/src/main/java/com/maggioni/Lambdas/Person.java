package com.maggioni.Lambdas;

import java.util.Objects;

public class Person implements PersonInterface {

    private Integer age;
    private String name;
    private Gender gender;

    private Person(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.gender = builder.gender;
    }

    public static class Builder {
        private Integer age;
        private String name;
        private Gender gender;

        public Builder() {
        }

        public Builder age(Integer age) {
            if (Objects.isNull(age) || age == 0)  throw new IllegalArgumentException("Age ist empty");
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Gender getGender() {
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
