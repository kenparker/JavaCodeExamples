package TryAnOptionalMonads.a_Entities;

import io.vavr.control.Option;
import io.vavr.control.Try;

import java.util.Objects;

public class City {

    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Option<String> getNameOptional() {
        return Option.of(name);
    }

    public Try<String> getNameTry() {
        return Try.of(() -> name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return Objects.equals(getName(), city.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
