package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_3_5_4;

import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.*;
import static org.assertj.core.api.Assertions.*;

public class ToStringTest {

    String a = "aaaa";
    String b = "bbbb";
    String c = "cccccc";
    List<String> listOfStrings = list(a,b,c);

    @Test
    public void givenAList_whenToString_thenOutputIs() {
        String s = listOfStrings.toString();
        assertThat(s).isEqualTo("[aaaa, bbbb, cccccc, NIL]");
    }

    @Test
    public void givenAnEmptyList_whenToString_thenOutputIsNIL() {
        String s = list().toString();
        assertThat(s).isEqualTo("[NIL]");
    }
}