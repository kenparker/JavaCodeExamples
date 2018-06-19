package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_3__4_4;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2.TailCall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2.TailCall.ret;
import static FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2.TailCall.sus;

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

    public static <T, U> U foldLeft(List<T> list, U identity, Function<U, Function<T, U>> f) {
        U result = identity;
        for (T i : list) {
            result = f.apply(result).apply(i);
        }
        return result;
    }

    public static <T,U>  U foldLeftSafe(List<T> list, U identity, Function<U, Function<T, U>> f) {
        return foldLeftSafe_(list,identity,f).eval();
    }

    private static <T, U> TailCall<U> foldLeftSafe_(List<T> list, U identity, Function<U, Function<T, U>> f) {
        return list.isEmpty()
                ? ret(identity)
                : sus( () -> foldLeftSafe_(tail(list), f.apply(identity).apply(head(list)),f));
    }

    public static <T, U> U foldRight(List<T> list, U identity, Function<T, Function<U, U>> f) {
        return list.isEmpty()
                ? identity
                : f.apply(head(list)).apply(foldRight(tail(list), identity, f));
    }

    public static <T,U> U foldRightTail(U acc, List<T> list, U identity, Function<T, Function<U, U>> f) {
        return list.isEmpty()
                ? acc
                : foldRightTail(f.apply(head(list)).apply(acc),tail(list),identity,f);
    }

    public static <T> List<T> prepend(T t, List<T> list) {
        return foldLeft(list, list(t), a -> b -> append(a, b));
    }

    public static <T> List<T> reverse(List<T> list) {
        return foldLeft(list, list(), a -> b -> prepend(b, a));
    }

    public static <T, U> List<U> mapWithFoldLeft(List<T> list, Function<T, U> f) {
        return foldLeft(list, list(), x -> y -> append(x, f.apply(y)));
    }

    public static <T,U> List<U> mapWithFoldRight(List<T> list, Function<T,U> f) {
        return foldRight(list,list(), x -> y -> prepend(f.apply(x),y));
    }

    public static <T, U> List<U> mapWithFoldLeft2(List<T> list, Function<T, U> f) {
        Function<Function<T, U>, Function<List<U>, Function<T, List<U>>>> function = f1 -> x -> y -> append(x, f1.apply(y));

        return foldLeft(list, list(), function.apply(f));
    }
}
