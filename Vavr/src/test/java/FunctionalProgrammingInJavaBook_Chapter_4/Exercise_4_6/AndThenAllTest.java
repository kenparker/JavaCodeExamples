package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_6;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_6.AndThenAll.andThenAllViaFoldLeft;
import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_6.CollectionUtilities.list;
import static org.assertj.core.api.Assertions.assertThat;

public class AndThenAllTest {


    @Test
    public void testWithDifferentFunctions() {
        Function<String, String> f1 = x -> "(a" + x + ")";
        Function<String, String> f2 = x -> "(b" + x + ")";
        Function<String, String> f3 = x -> "(c" + x + ")";

        String stringLeft = andThenAllViaFoldLeft(list(f1, f2, f3)).apply("x");
        String stringRight = andThenAllViaFoldLeft(list(f1, f2, f3)).apply("x");

        System.out.println(stringLeft + " " + stringRight);
        assertThat(stringLeft).isEqualTo(stringRight);
    }
}