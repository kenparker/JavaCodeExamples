package com.maggioni.Lambdas;

import java.util.Optional;

public interface PersonInterface {

    public enum Gender{MALE, FEMALE};
    public Optional<Integer> getAge();
    public Optional<String> getName();
    public Optional<Gender> getGender();
}
