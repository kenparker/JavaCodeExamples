package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_8;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_5.CollectionUtilities.list;
import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_8.Fold.foldRight;
import static org.junit.Assert.*;

public class FoldTest {

    String identity = "0";
    private static String addIS( Integer i, String s) {
        return "(" + i + " + " + s + ")";
    }

    @Test
    public void testFoldRight() {

        List<Integer> list = list(1, 2, 3, 4, 5);
        Function<Integer, Function<String, String>> f = x -> y -> addIS(x, y);
        String result = foldRight(list, identity, f);
        String expected = "(1 + (2 + (3 + (4 + (5 + 0)))))";
        assertEquals(expected, result);
    }
}