import cyclops.data.Vector;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class VectorAddingMethodsTest {

    public static final String A = "a";
    public static final String B = "b";
    public static final String C = "c";
    public static final String D = "d";
    public static final Vector<String> VECTOR = Vector.of(A, D);
    public static final List<String> VALUES = List.of(B, C);

    @Test
    public void given_ASingleElement_When_Vector_Plus_isUsed_Then_ElementIsAdded_AFTER_TheExistingOnes() {

        Vector<String> resultVector = VECTOR.plus(B);
        assertThat(resultVector).hasSize(3)
                .containsExactly(A, D, B)
                .isEqualTo(VECTOR.insertAt(VECTOR.size(), B));
    }

    @Test
    public void given_SomeValues_When_Vector_PlusAll_isUsed_Then_TheValuesAreAdded_AFTER_TheExistingOnes() {

        Vector<String> objects = VECTOR.plusAll(VALUES);

        assertThat(objects).hasSize(4)
                .containsExactly(A, D, B, C)
                .isEqualTo(VECTOR.insertAt(VECTOR.size(), VALUES));
    }

    @Test
    public void given_SomeValues_And_aStartingPosition_When_Vector_PlusAll_isUsed_Then_TheValuesAreInsertedAtStartingPosition() {

        Vector<String> objects = VECTOR.plusAll(1, VALUES);

        assertThat(objects).hasSize(4)
                .containsExactly(A, B, C, D)
                .isEqualTo(VECTOR.insertAt(1, VALUES));
    }

    @Test
    public void given_ASingleElement_When_Vector_prepend_isUsed_Then_ElementIsAdded_BEFORE_theExistingOnes() {

        Vector<String> resultVector = VECTOR.prepend(A);

        assertThat(resultVector).hasSize(3)
                .containsExactly(A, A, D)
                .isEqualTo(VECTOR.insertAt(0, A));
    }

    @Test
    public void given_SomeValues_When_Vector_prependAll_isUsed_ThenValuesAreAdded_BEFORE_theExistingOnes() {
        Vector<String> strings = VECTOR.prependAll(VALUES);

        assertThat(strings).hasSize(4)
                .containsExactly(B, C, A, D)
                .isEqualTo(VECTOR.plusAll(0, VALUES));

    }

    @Test
    public void vectorPrependStream_when_Then() {
        Stream<? extends String> stream = Stream.of(A, B);
        Vector<String> strings1 = VECTOR.prependStream(stream);
        assertThat(strings1).hasSize(4)
                .containsExactly(A, B, A, D);

    }

}
