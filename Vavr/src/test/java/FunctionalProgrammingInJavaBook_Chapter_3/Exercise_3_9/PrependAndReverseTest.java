package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_9;

import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_9.CollectionUtilities.*;
import static org.junit.Assert.*;

public class PrependAndReverseTest {

        List<Integer> list = list(1,5,3,7,9,12);
    @Test
    public void testPrepend1() {
        Integer number = 13;

        List<Integer> prepend = prepend(number, list);

        System.out.println(prepend);
    }

    @Test
    public void testReverse() {
        List<Integer> integerList = reverse(list);

        System.out.println(integerList);
    }
}