package TryAnOptionalMonads.b_Builders;

import TryAnOptionalMonads.a_Entities.Address;
import TryAnOptionalMonads.a_Entities.Person;

public class PersonBuilder {
    private Address address;
    private String name;

    public PersonBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Person createPerson() {
        return new Person(address, name);
    }
}