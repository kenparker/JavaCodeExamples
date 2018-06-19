package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_3__4_4;


import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_3__4_4.CollectionUtilities.*;
import static org.assertj.core.api.Assertions.*;

public class FoldRightTest {


    private static String assSI(Integer i1, String s2) {
        return "(" + i1 + " + " + s2 + ")";
    }

    Function<Integer, Function<String, String>> f = x -> y -> assSI(x, y);

    List<Integer> list = list(2, 5, 4, 3);
    String identity = "0";

    @Test
    public void testFoldRight() {

        String s = foldRight(list, identity, f);
        String sTail = foldRightTail("0", reverse(list), identity, f);

        assertThat(sTail).isEqualTo(s);
    }
}
