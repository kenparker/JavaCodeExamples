package FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TailCallTest {

  @Test
  public void test() {
    assertEquals(Integer.valueOf(8), Add.add(3, 5).eval());
  }

}
