package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_3__4_4;

import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_3__4_4.Range.*;
import static org.assertj.core.api.Assertions.*;

public class RangeTest {

    Integer start = 1;
    Integer end = 10;

    @Test
    public void testRangeBase() {

        List<Integer> range = range(start, end);
        List<Integer> rangeBase = rangeBase(start, end);
        List<Integer> rangeTail = rangeTail(start, end);
        List<Integer> rangeSafe = rangeSafe(start, end);

        assertThat(rangeBase).isEqualTo(range);
        assertThat(rangeTail).isEqualTo(range);
        assertThat(rangeSafe).isEqualTo(range);
    }
}