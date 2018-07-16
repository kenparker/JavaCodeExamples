package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_7;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.*;
import static org.assertj.core.api.Assertions.*;

public class FoldLeftTest {


    private final List<Integer> list = list(3, 3, 2);
    private final int n = 0;
    private final Function<Integer, Function<Integer, Integer>> sum = x -> y -> x + y;

    @Test
    public void sumWithFoldLeft() {
        Integer integer = list.foldLeft(n, sum);
        assertThat(integer).isEqualTo(foldRight(list,n,sum));
    }

    @Test
    public void sumWithFoldRightViaFoldLeft() {
        Integer integer = foldRightViaFoldLeft(list, n, sum);
        System.out.println(integer);
        Integer integer1 = foldRight(list, n, sum);
        assertThat(integer).isEqualTo(integer1);

    }

    @Test
    public void sumWithFoldRightInstance() {
        Integer integer = list.foldRight(n, sum);
        System.out.println(integer);
        Integer integer1 = foldRight(list, n, sum);
        assertThat(integer).isEqualTo(integer1);
    }
}
