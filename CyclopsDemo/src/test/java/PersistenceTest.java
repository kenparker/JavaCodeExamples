import cyclops.data.Vector;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PersistenceTest {

    private String a = "Angel";
    private String b = "Marc";
    private String c = "Lucy";
    private String d = "Bert";

    @Test
    public void givenACyclopsVector_whenVectorIsCreated_ThenVectorIsPersistent() {
        Vector<String> vector = Vector.of(a, b, c);
        vector.append(d);
        assertThat(vector).contains(a, b, c).doesNotContain(d);
    }

}