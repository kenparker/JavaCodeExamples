package FunctionalProgrammingInJavaBook_Chapter_6.exercise06_04;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class OptionFlatMapTest {

    Function<String, Option<String>> funOptionString = s -> Option.some(s + " String");

    @Test
    public void givenASome_thenFlatMap_thenResultIsOptionalSome() {

        Option<String> stringOption = Option.some("Home");

        Option<Option<String>> optionOption = stringOption.map(funOptionString);
        Option<String> optionOptionOrElse = optionOption.getOrElse(Option::none);

        Option<String> flatMap = stringOption.flatMap(funOptionString);

        assertThat(flatMap.toString()).isEqualTo(optionOptionOrElse.toString());
    }

    @Test
    public void givenANone_whenFlatMap_thenResultIsNone() {
        Option<String> stringNone = Option.none();

        Option<String> flatMap = stringNone.flatMap(funOptionString);
        assertThat(flatMap).isSameAs(Option.none());
    }
}