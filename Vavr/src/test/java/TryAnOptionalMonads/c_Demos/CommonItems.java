package TryAnOptionalMonads.c_Demos;

import TryAnOptionalMonads.a_Entities.Address;
import TryAnOptionalMonads.a_Entities.City;
import TryAnOptionalMonads.a_Entities.Person;
import TryAnOptionalMonads.b_Builders.AdressBuilder;
import TryAnOptionalMonads.b_Builders.CityBuilder;
import TryAnOptionalMonads.b_Builders.PersonBuilder;
import io.vavr.control.Option;
import org.junit.Before;

import java.util.HashMap;
import java.util.function.BiConsumer;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonItems {

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
}
