package FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_2;

import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_9.CollectionUtilities.*;
import static FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_2.Sum.*;
import static org.assertj.core.api.Assertions.*;

public class SumTest {

    @Test
    public void testSumStack() {
        List<Integer> list = list(11, 3, 5);

        Integer sum = sum1(list);
        assertThat(sum).isEqualTo(19);

        sum = sum2(list);
        assertThat(sum).isEqualTo(19);
    }
}