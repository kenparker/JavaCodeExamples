import cyclops.data.Vector;
import cyclops.function.Monoid;
import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class VectorCycleMethodsTest {

    private static final String A = "a";
    private static final String B = "b";
    private static final String C = "c";
    private static final String D = "d";
    private static final String F = "f";

    @Test
    public void given_Vector_when_CycleXTimes_then_ElementsAreXTimesDuplicatedInNewVector() {
        Vector<String> vector = Vector.of(A, C, D, C, B);

        Vector<String> result = vector.cycle(3);

        Vector<String> expectedResult = Vector.of(A, C, D, C, B, A, C, D, C, B, A, C, D, C, B);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void given_Vector_and_MonoId_when_CycleMonoId_then_eachElementIsTransformedAndReducedXTimes() {
        Vector<String> vector = Vector.of(A, C, D, C, B);
        Function<String, Function<String, String>> concatenateUppercase = a -> b -> a + b.toUpperCase();
        Monoid<String> upperCaseMonoid = Monoid.of("", concatenateUppercase);

        int times = 2;
        Vector<String> result = vector.cycle(upperCaseMonoid, times);

        String expectedElement = A.concat(C).concat(D).concat(C).concat(B).toUpperCase();
        Vector<String> expectedResult = Vector.of(expectedElement, expectedElement);
        assertThat(result).isEqualTo(expectedResult).hasSize(times);
    }

    @Test
    public void given_VectorOfNumbers_when_CycleWhile_then_resultVectorWithElementsSatisfyingTheConditionIsCreated() {
        Vector<Integer> numbers = Vector.of(10, 11, 9, 5, 50, 55, 30, 19);
        Predicate<Integer> lessThen20 = integer -> integer < 20;

        Vector<Integer> result = numbers.cycleWhile(lessThen20);

        Vector<Integer> expected = Vector.of(10, 11, 9, 5);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void given_VectorOfNumbers_when_CycleUntil_then_resultVectorWithElementsNOTSatisfyingTheConditionIsCreated() {
        Vector<Integer> numbers = Vector.of(10, 11, 9, 5, 50, 55, 30, 19);
        Predicate<Integer> lessThen20 = integer -> integer < 20;

        Vector<Integer> result = numbers.cycleUntil(lessThen20);

        assertThat(result).isEqualTo(Vector.empty());
    }
}
