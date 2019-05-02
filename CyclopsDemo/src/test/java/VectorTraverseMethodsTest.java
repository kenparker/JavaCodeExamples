import cyclops.data.Vector;
import cyclops.function.Monoid;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class VectorTraverseMethodsTest {

    private static final String A = "a";
    private static final String B = "b";
    private static final String C = "c";
    private static final String D = "d";
    private static final String F = "f";
    private static final Vector<String> VECTOR = Vector.of(A, C, D, C, B);
    private static final List<String> VALUES = List.of(B, C);
    private static final String NOTHING = "nothing";
    private static final int expected = VECTOR.size() - 1;


    @Test
    public void given_aVector_when_CycleXTimes_then_VectorIsDuplicatedXTimesInAResultVector() {
        final Vector<String> resultCycle = VECTOR.cycle(3);
        final Vector<String> expectedResult = Vector.of(A, C, D, C, B, A, C, D, C, B, A, C, D, C, B);
        assertThat(resultCycle).isEqualTo(expectedResult);
    }

    @Test
    public void name() {
        Strea
        Monoid<String> a;
        long b;
        VECTOR.cycle(a,b);
    }
}
