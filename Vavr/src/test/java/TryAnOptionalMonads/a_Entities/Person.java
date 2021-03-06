package TryAnOptionalMonads.a_Entities;

import TryAnOptionalMonads.c_Demos.CommonConstants;
import io.vavr.control.Option;
import io.vavr.control.Try;

import java.util.Objects;

public class Person implements CommonConstants{

    private Address address;
    private String name;

    public Person(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public Option<Address> getAdressOption() {
        return Option.of(address);
    }

    public Try<Address> getAdressTry() {
        if (address == null) {
            return Try.failure(new IllegalStateException(PERSON_HAS_NO_ADRESS));
        } else
            return Try.success(address);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getAddress(), person.getAddress()) &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAddress(), getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", testRecursive='" + name + '\'' +
                '}';
    }
}
