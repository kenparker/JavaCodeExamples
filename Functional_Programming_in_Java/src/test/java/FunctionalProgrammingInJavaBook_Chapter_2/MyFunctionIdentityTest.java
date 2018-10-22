package FunctionalProgrammingInJavaBook_Chapter_2;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;


public class MyFunctionIdentityTest {


    @Test
    public void givenAFunction_whenIdentity_thenResultIsFunction() {
        MyFunction<String, Integer> func = s -> 12;

        MyFunction<Integer, Integer> identity = MyFunction.identity();
        
        Integer a = 123;
        Integer b = identity.apply(a);

        assertThat(a).isEqualTo(b);

    }
}