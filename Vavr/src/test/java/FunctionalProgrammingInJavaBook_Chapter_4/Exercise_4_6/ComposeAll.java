package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_6;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Function.*;
import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_6.CollectionUtilities.*;

public class ComposeAll {

    static <T> Function<T,T> composeAll(List<Function<T,T>> list) {
        return foldRightSafe(list,identity(), x -> y -> x.compose(y));
    }

    static <T> Function<T,T> composeAllUnlimitedWithFoldLeft(List<Function<T,T>> list) {
        return  x -> foldLeftSafe(list,x, a -> b -> b.apply(a));
    }
    static <T> Function<T,T> composeAllUnlimitedWithFoldRight(List<Function<T,T>> list) {
        return x -> foldRightSafe(list,x, a -> b -> a.apply(b));
    }
}
