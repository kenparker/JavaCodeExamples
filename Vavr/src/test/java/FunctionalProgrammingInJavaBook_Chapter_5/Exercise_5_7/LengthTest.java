package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_7;

import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LengthTest {

    private List<String> list = List.list("ZZ", "a", "f");

    @Test
    public void testLength() {
        Integer length = list.length();
        Integer lengthViaFoldLeft = List.lengthViaFoldLeft(list);
        assertThat(length).isEqualTo(3).isEqualTo(lengthViaFoldLeft);
    }
}
