package FunctionalProgrammingInJavaBook_Chapter_6.exercise06_02;

import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class OptionGetOrElse0602Test {

    private static List<Integer> getDefault() {
        throw new RuntimeException();
    }

    @Test
    public void givenAOptionNone_whenGetOrElse_thenResultIsDefault() {
        Option<List<Integer>> none = Option.none();
        Throwable throwable = catchThrowable(() -> none.getOrElse(OptionGetOrElse0602Test::getDefault));
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }

    @Test
    public void givenAnOptionSome_whenGetOrElse_thenResultIsSome() {
        List<Integer> integerList = List.list(10, 9, 4);
        Option<List<Integer>> some = Option.some(integerList);
        List<Integer> orElse = some.getOrElse(OptionGetOrElse0602Test::getDefault);
        assertThat(orElse).isEqualTo(integerList);
    }
}