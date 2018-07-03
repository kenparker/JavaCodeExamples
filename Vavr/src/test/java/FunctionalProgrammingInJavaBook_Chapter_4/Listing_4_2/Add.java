package FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_2;

import static FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_2.TailCall.ret;
import static FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_2.TailCall.sus;

public class Add {

  static TailCall<Integer> add(int x, int y) {
    return y == 0
        ? ret(x)
        : sus(() -> add(x + 1, y - 1));
  }
}
