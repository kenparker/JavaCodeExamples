package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_5;

import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_5.CollectionUtilities.list;
import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_5.Fold.fold;
import static org.junit.Assert.assertEquals;

public class FoldTest {

        List<Integer> list = list(1, 2, 3, 4, 5);
    @Test
    public void testSum() {
        Integer result = fold(list, 0, x -> y -> x + y);
        Integer expected = 15;
        assertEquals(expected, result);
    }

    @Test
    public void testMult() {
        Integer result = fold(list, 1, x -> y -> x * y);
        Integer expected = 120;
        assertEquals(expected, result);
    }
}