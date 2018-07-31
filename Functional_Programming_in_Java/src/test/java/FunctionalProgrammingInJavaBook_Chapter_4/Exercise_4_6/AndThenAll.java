package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_6;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_6.CollectionUtilities.*;

public class AndThenAll {

    static <T> Function<T,T> andThenAllViaFoldLeft(List<Function<T,T>> list) {
        return x -> foldLeftSafe(list,x, a -> b -> b.apply(a));
    }

    static <T> Function<T,T> andThenAllViaFoldRight(List<Function<T,T>> list) {
        return x -> foldRightSafe(reverse(list),x, a -> b -> a.apply(b));
    }
}
