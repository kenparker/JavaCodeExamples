package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_2.TailCall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_2.TailCall.ret;
import static FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_2.TailCall.sus;

public class CollectionUtilities {

    public static <T> List<T> list() {
        return Collections.EMPTY_LIST;
    }

    public static <T> List<T> list(T t) {
        return Collections.singletonList(t);
    }

    public static <T> List<T> list(List<T> ts) {
        return Collections.unmodifiableList(new ArrayList<>(ts));
    }

    public static <T> List<T> list(T... t) {
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(t, t.length)));
    }

    private static <T> List<T> copy(List<T> ts) {
        return new ArrayList<>(ts);
    }

    public static <T> T head(List<T> list) {
        if (list.size() == 0) throw new IllegalStateException("head of empty list");
        return list.get(0);
    }

    public static <T> List<T> tail(List<T> list) {
        if (list.size() == 0) throw new IllegalStateException("tail of empty list");
        List<T> worklist = copy(list);
        worklist.remove(0);
        return Collections.unmodifiableList(worklist);
    }

    public static <T> List<T> append(List<T> list, T t) {
        List<T> result = copy(list);
        result.add(t);
        return Collections.unmodifiableList(result);
    }

    public static <T,U>  U foldLeftSafe(List<T> list, U identity, Function<U, Function<T, U>> f) {
        return foldLeftSafe_(list,identity,f).eval();
    }

    private static <T, U> TailCall<U> foldLeftSafe_(List<T> list, U identity, Function<U, Function<T, U>> f) {
        return list.isEmpty()
                ? ret(identity)
                : sus( () -> foldLeftSafe_(tail(list), f.apply(identity).apply(head(list)),f));
    }

    private static <T,U> TailCall<U> foldRight_(U acc, List<T> list, Function<T, Function<U, U>> f) {
        return list.isEmpty()
                ? ret(acc)
                : sus(() -> foldRight_(f.apply(head(list)).apply(acc),tail(list),f));
    }

    public static <T,U> U foldRightSafe(List<T> list, U identity, Function<T, Function<U, U>> f) {
        return foldRight_( identity, reverse(list), f).eval();
    }

    public static <T> List<T> prepend(T t, List<T> list) {
        return foldLeftSafe(list, list(t), a -> b -> append(a, b));
    }

    public static <T> List<T> reverse(List<T> list) {
        return foldLeftSafe(list, list(), a -> b -> prepend(b, a));
    }

    public static <T, U> List<U> mapWithFoldLeft(List<T> list, Function<T, U> f) {
        return foldLeftSafe(list, list(), x -> y -> append(x, f.apply(y)));
    }

    public static <T,U> List<U> mapWithFoldRight(List<T> list, Function<T,U> f) {
        return foldRightSafe(list,list(), x -> y -> prepend(f.apply(x),y));
    }

    public static <T> List<T> unfold(T seed,
                                     Function<T, T> f,
                                     Function<T, Boolean> p) {
        List<T> result = new ArrayList<>();
        T temp = seed;
        while (p.apply(temp)) {
            result = append(result, temp);
            temp = f.apply(temp);
        }
        return result;
    }


    public static List<Integer> range(int start, int end) {
        return unfold(start, x -> x + 1, x -> x < end);
    }

    public static <T> List<T> iterate(T seed, Function<T, T> f, int n) {
        List<T> result = new ArrayList<>();
        T temp = seed;
        for (int i = 0; i < n; i++) {
            result.add(temp);
            temp = f.apply(temp);
        }
        return result;
    }
}
