package FunctionalProgrammingInJavaBook;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MyAddFunction {


    MyFunction<Integer, MyFunction<Integer,Integer>> add = x -> y -> x + y;

    @Test
    public void testSum() {

        Integer sum = add.apply(3).apply(5);
        assertThat(sum).isEqualTo(8);

    }
}
