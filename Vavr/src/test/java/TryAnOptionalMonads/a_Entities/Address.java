package TryAnOptionalMonads.a_Entities;

import TryAnOptionalMonads.c_Demos.CommonConstants;
import io.vavr.control.Option;
import io.vavr.control.Try;

import java.util.Objects;

public class Address implements CommonConstants {

    private String street;
    private City city;

    public Address(String street, City city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public City getCity() {
        return city;
    }

    public Option<City> getCityOption() {
        return Option.of(city);
    }

    public Try<City> getCityTry() {
        if (city == null) {
            return Try.failure(new IllegalStateException(ADDRESS_AS_NO_CITY));
        } else return Try.success(city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getStreet(), address.getStreet()) &&
                Objects.equals(getCity(), address.getCity());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getStreet(), getCity());
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city=" + city +
                '}';
    }
}
