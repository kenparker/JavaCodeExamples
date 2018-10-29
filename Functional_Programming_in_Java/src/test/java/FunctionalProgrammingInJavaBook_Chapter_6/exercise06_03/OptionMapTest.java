package FunctionalProgrammingInJavaBook_Chapter_6.exercise06_03;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class OptionMapTest {

    Function<Integer, Integer> fun = a -> a * 2;

    @Test
    public void givenANone_whenMap_thenResultIsNone() {
        Option<Integer> none = Option.none();

        Option<Integer> map = none.map(fun);
        assertThat(map).isInstanceOf(Option.none().getClass());
        assertThat(map).isNotInstanceOf(Integer.class);
    }

    @Test
    public void givenASome_whenMap_thenResultIsSome() {
        Option<Integer> integerOption = Option.some(25);

        Option<Integer> map = integerOption.map(fun);
        assertThat(map.getOrThrow()).isEqualTo(50);

    }
}