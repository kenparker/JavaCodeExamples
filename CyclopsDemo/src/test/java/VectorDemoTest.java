import cyclops.data.Vector;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class VectorDemoTest {

    private String a = "Angel";
    private String b = "Marc";
    private String c = "Lucy";
    private String d = "Bert";

    @Test
    public void givenSomeStrings_WhenVectorOf_ThenVectorIsCreated() {
        Vector<String> vector = Vector.of(a, b, c);
        System.out.println(vector);
        assertThat(vector).contains(a, b, c);
    }

    @Test
    public void givenAVector_WhenAStringIsAppended_ThenVectorIsImmutable() {
        Vector<String> vector = Vector.of(a,b);
        vector.append(c);
        assertThat(vector).doesNotContain(c);
    }

    @Test
    public void givenAJava8List_whenAStringIsAdded_ThenListIsMutable() {
        List<String> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        assertThat(list).contains(c);
    }

    @Test
    public void givenAStringAndAVectorWhenVectorAppendThenStringIsAddedToVectorAndNewVectorIsCreated() {
        Vector<String> vector = Vector.of(a, b, c);
        Vector<String> appendVector = vector.append(d);
        assertThat(appendVector).contains(a,b,c,d);
        assertThat(appendVector).isNotSameAs(vector);
    }
}