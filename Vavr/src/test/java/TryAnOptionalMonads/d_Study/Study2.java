package TryAnOptionalMonads.d_Study;

import io.vavr.CheckedFunction1;
import io.vavr.CheckedFunction2;
import io.vavr.Function1;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Study2 {

    static Integer readFromFile(Integer integer)  {
        if (integer == 3) throw new IllegalStateException();
        return integer;
    }

    @Test
    public void name() {
        List<Integer> integers = Arrays.asList(33, 9, 3, 10);

        Function1<Integer,Integer> f1 = integer -> readFromFile(integer);
        CheckedFunction1<Integer, Integer> cf1 = integer -> readFromFile(integer);

        long count;
        count = integers.stream()
                .map(cf1.unchecked())
                .count();
        System.out.println(count);

        count = integers.stream()
                .map(f1)
                .count();
        System.out.println(count);
    }
}
