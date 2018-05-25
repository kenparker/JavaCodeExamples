package TryAnOptionalMonads.b_Builders;

import TryAnOptionalMonads.a_Entities.City;

public class CityBuilder {
    private String name;

    public CityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public City createCity() {
        return new City(name);
    }
}