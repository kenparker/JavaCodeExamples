package FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_1;

public class Add {

  static TailCall<Integer> add(int x, int y) {
    return y == 0
        ? new TailCall.Return<>(x)
        : new TailCall.Suspend<>(() -> add(x + 1, y - 1));
  }
}
