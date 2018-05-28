package TryAnOptionalMonads.c_Demos;

import TryAnOptionalMonads.a_Entities.Address;
import TryAnOptionalMonads.a_Entities.City;
import TryAnOptionalMonads.a_Entities.Person;
import TryAnOptionalMonads.b_Builders.AdressBuilder;
import TryAnOptionalMonads.b_Builders.CityBuilder;
import TryAnOptionalMonads.b_Builders.PersonBuilder;
import io.vavr.control.Option;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.function.BiConsumer;

import static org.assertj.core.api.Assertions.*;

public class OptionDemo1 {

    City cityMailand = new CityBuilder().setName("Mailand").createCity();

    Address addressMonte = new AdressBuilder().setStreet("Montenapoleone").setCity(null).createAdress();
    Address addressManzoni = new AdressBuilder().setStreet("Manzoni").setCity(cityMailand).createAdress();

    String nameMarco = "Marco";
    String namePaolo = "Paolo";
    String nameDaniela = "Daniela";
    Person person1 = new PersonBuilder().setName(nameMarco).setAddress(addressMonte).createPerson();
    Person person2 = new PersonBuilder().setName(namePaolo).setAddress(null).createPerson();
    Person person3 = new PersonBuilder().setName(nameDaniela).setAddress(addressManzoni).createPerson();

    HashMap<String, Person> personMap = new HashMap<>();
    HashMap<String, Option<Person>> personMapJava7 = new HashMap<>();
    Map<String, Person> personMapJava8 = new Map<>();

    public static class Map<T, U> extends HashMap<T, U> {

        public Option<U> find(T t) {
            return Option.of(super.get(t));
        }
    }

    BiConsumer<City, City> assertCity = (cityToTest, cityResult) -> assertThat(cityToTest).isEqualTo(cityResult);

    @Before
    public void setUp() {
        personMap.put(nameMarco, person1);
        personMap.put(namePaolo, person2);
        personMap.put(nameDaniela, person3);

        personMapJava7.put(nameMarco, Option.of(person1));
        personMapJava7.put(namePaolo, Option.of(person2));
        personMapJava7.put(nameDaniela, Option.of(person3));

        personMapJava8.put(nameMarco, person1);
        personMapJava8.put(namePaolo, person2);
        personMapJava8.put(nameDaniela, person3);
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
        for (String name : personMapJava7.keySet()) {
            Option<Person> person = personMapJava7.get(name);
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
        for (String name : personMapJava8.keySet()) {
            personMapJava8.find(name)
                    .flatMap(Person::getAdressOption)
                    .flatMap(Address::getCityOption)
                    .forEach((city) -> assertCity.accept(city, cityMailand));
        }
    }
}

