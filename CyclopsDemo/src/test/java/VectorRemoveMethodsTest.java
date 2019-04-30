import cyclops.control.Option;
import cyclops.data.ImmutableList;
import cyclops.data.Vector;
import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class VectorRemoveMethodsTest {

    private static final String A = "a";
    private static final String B = "b";
    private static final String C = "c";
    private static final String D = "d";
    private static final String F = "f";
    private static final Vector<String> VECTOR = Vector.of(A, C, D, C, B);
    private static final List<String> VALUES = List.of(B, C);
    private static final String NOTHING = "nothing";
    private static final int expected = VECTOR.size()-1;


    @Test
    public void given_aElementInAVector_when_RemoveValueIsUsed_then_ANewVectorWithoutElementIsCreated() {

        Vector<String> resultVector = VECTOR.removeValue(D);
        assertThat(resultVector).hasSize(expected).doesNotContain(D).isNotSameAs(VECTOR);
    }

    @Test
    public void given_aVectorWithSameElements_when_RemoveValueIsUsed_then_ANewVectorWithoutTheFirstElementIsCreated() {
        final Vector<String> resultDouble = VECTOR.removeValue(C);
        assertThat(resultDouble).hasSize(expected).containsOnlyOnce(C).isEqualTo(VECTOR.removeFirst(s -> s.equals(C)));
    }

    @Test
    public void given_aElementAndAVectorTheElementIsNotInTheVector_when_RemoveValueIsUsed_then_ANewVectorIsCreated() {
        Vector<String> resultVector = VECTOR.removeValue(F);
        assertThat(resultVector).isEqualTo(VECTOR).isNotSameAs(VECTOR);
    }

    @Test
    public void given_ElementsInAVector_when_RemoveAllIsUsed_then_ANewVectorWithoutElementsIsCreated() {
        Vector<String> resultVector = VECTOR.removeAll(VALUES);
        assertThat(resultVector).hasSize(2).doesNotContainAnyElementsOf(VALUES);
    }

    @Test
    public void given_ElementsSomeInAVector_when_RemoveAllIsUsed_then_ANewVectorIsCreated() {
        Vector<String> someElements = Vector.of(A, D, F);
        Vector<String> resultVector = VECTOR.removeAll(someElements);
        assertThat(resultVector).hasSize(3).doesNotContainAnyElementsOf(someElements);
    }

    @Test
    public void given_aVectorAndExistingAPosition_when_RemoveAtIsUsed_then_ANewVectorWithoutTheElementAtThePositionIsCreated() {
        final int pos = 2;
        final String element = VECTOR.getOrElse(pos, NOTHING);
        Vector<String> resultVector = VECTOR.removeAt(pos);
        assertThat(resultVector).hasSize(expected).doesNotContain(element);
    }

    @Test
    public void given_aVectorAndAPositionOutsideTheRange_when_RemoveAtIsUsed_then_ANewVectorIsCreated() {
        final int pos = -1;
        final String element = VECTOR.getOrElse(pos, NOTHING);
        Vector<String> resultVector = VECTOR.removeAt(pos);
        assertThat(resultVector).isEqualTo(VECTOR).doesNotContain(element);
    }

    @Test
    public void given_aVectorAndAFilter_when_retailFirstIsUsed_then_ANewVectorWithoutFilteredElementsIsCreated() {

        Predicate<String> filter = s -> s.equals(C) ;
        final Vector<String> resultVector = VECTOR.removeFirst(filter);
        assertThat(resultVector).hasSize(expected).containsOnlyOnce(C).isEqualTo(VECTOR.removeValue(C));
    }


}
