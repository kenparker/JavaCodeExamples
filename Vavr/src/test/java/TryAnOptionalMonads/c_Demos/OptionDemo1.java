package TryAnOptionalMonads.c_Demos;

import TryAnOptionalMonads.a_Entities.Address;
import TryAnOptionalMonads.a_Entities.City;
import TryAnOptionalMonads.a_Entities.Person;
import io.vavr.control.Option;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.function.BiConsumer;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionDemo1 extends CommonItems {
    Map<String, Person> personMapFunctional = new Map<>();
    HashMap<String, Option<Person>> personMapWithOption = new HashMap<>();

    public static class Map<T, U> extends HashMap<T, U> {

        public Option<U> find(T t) {
            return Option.of(super.get(t));
        }
    }

    BiConsumer<City, City> assertCity = (cityToTest, cityResult) -> assertThat(cityToTest).isEqualTo(cityResult);

    @Override
    @Before
    public void setUp() {
        super.setUp();
        personMapFunctional.put(nameMarco, person1);
        personMapFunctional.put(namePaolo, person2);
        personMapFunctional.put(nameDaniela, person3);

        personMapWithOption.put(nameMarco, Option.of(person1));
        personMapWithOption.put(namePaolo, Option.of(person2));
        personMapWithOption.put(nameDaniela, Option.of(person3));
    }

    @Test
    public void givenAPersonMap_whenCheckNullObjectJava7_thenShouldCityMailand() {
        for (String name : personMap.keySet()) {
            Person person = personMap.get(name);
            if (person != null) {
                Address address = person.getAddress();
                if (address != null) {
                    City city = address.getCity();
                    if (city != null) {
                        assertCity.accept(city, cityMailand);
                    }
                }
            }
        }
    }

    @Test
    public void givenAPersonMap_whenCheckNullObjectWithOptionJava7Style_thenShouldCityMailand() {
        for (String name : personMapWithOption.keySet()) {
            Option<Person> person = personMapWithOption.get(name);
            if (person.isDefined()) {
                Option<Address> address = person.get().getAdressOption();
                if (address.isDefined()) {
                    Option<City> city = address.get().getCityOption();
                    if (city.isDefined()) {
                        assertCity.accept(city.get(), cityMailand);
                    }
                }
            }
        }
    }


    @Test
    public void givenAPersonMap_whenCheckNullObjectWithOptionJava8Style_thenShouldCityMailand() {
        for (String name : personMapFunctional.keySet()) {
            personMapFunctional.find(name)
                    .flatMap(Person::getAdressOption)
                    .flatMap(Address::getCityOption)
                    .forEach((city) -> assertCity.accept(city, cityMailand));
        }
    }
}

