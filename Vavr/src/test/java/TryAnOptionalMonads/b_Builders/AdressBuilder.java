package TryAnOptionalMonads.b_Builders;

import TryAnOptionalMonads.a_Entities.Address;
import TryAnOptionalMonads.a_Entities.City;

public class AdressBuilder {
    private String street;
    private City city;

    public AdressBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public AdressBuilder setCity(City city) {
        this.city = city;
        return this;
    }

    public Address createAdress() {
        return new Address(street, city);
    }
}