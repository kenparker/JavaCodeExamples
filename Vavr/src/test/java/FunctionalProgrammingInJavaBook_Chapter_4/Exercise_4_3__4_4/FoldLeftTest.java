package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_3__4_4;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_3__4_4.CollectionUtilities.*;
import static org.assertj.core.api.Assertions.*;

public class FoldLeftTest {

    private static String assSI(String s, Integer integer) {
        return "(" + s + " + " + integer + ")";
    }

    Function<String, Function<Integer, String>> f = x -> y -> assSI(x,y);

    List<Integer> list = list(2,5,4,3);
    String identity = "0";

    @Test
    public void testFoldLeft() {
        String sFoldLeftOriginal = foldLeftImperative(list, identity, f);
        String sFoldLeftSafe = foldLeftSafe(list, identity, f);

        assertThat(sFoldLeftOriginal).isEqualTo(sFoldLeftSafe);
    }
}
