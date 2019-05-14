import cyclops.data.Vector;
import cyclops.function.Monoid;
import org.junit.Test;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class VectorTraverseMethodsTest {

    private static final String A = "a";
    private static final String B = "b";
    private static final String C = "c";
    private static final String D = "d";
    private static final String F = "f";
    private static final Vector<String> VECTOR = Vector.of(A, C, D, C, B);

    @Test
    public void given_Vector_when_CycleXTimes_then_ElementsAreXTimesRepeated() {
        Vector<String> result = VECTOR.cycle(3);

        Vector<String> expectedResult = Vector.of(A, C, D, C, B, A, C, D, C, B, A, C, D, C, B);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void given_Vector_and_MonoId_when_CycleMonoId_then_eachElementIsTransformedAndReducedXTimes() {
        Function<String, Function<String,String>> concatenateUppercase = a -> b -> a + b.toUpperCase();
        Monoid<String> upperCase = Monoid.of("", concatenateUppercase);

        int times = 2;
        Vector<String> result = VECTOR.cycle(upperCase, times);

        String expectedElement = A.concat(C).concat(D).concat(C).concat(B).toUpperCase();
        Vector<String> expectedResult = Vector.of(expectedElement,expectedElement);
        assertThat(result).isEqualTo(expectedResult).hasSize(times);
    }

    @Test
    public void given_aVector_and_Predicate_when_CycleUntil_then_ElementsNotSatisfyingPredicateAreCopiedToResult() {
        Predicate<String> predicate = s -> s.equals(B);

        Vector<String> result = VECTOR.cycleUntil(predicate);

        Vector<String> expectedResult = Vector.of(A,C,D,C);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void given_Vector_and_Predicate_when_CycleWhile_then_ElementsSatisfyingPredicateAreCopiedToResult() {
        Predicate<String> predicate = s -> s.equals(B);

        Vector<String> result = VECTOR.cycleWhile(predicate);

        Vector<String> expectedResult = Vector.empty();
        assertThat(result).isEqualTo(expectedResult);
    }

}
