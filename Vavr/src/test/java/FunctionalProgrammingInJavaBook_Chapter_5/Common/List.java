package FunctionalProgrammingInJavaBook_Chapter_5.Common;


import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_2.TailCall;

import static FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_2.TailCall.*;

public abstract class List<A> {

    public abstract A head();
    public abstract List<A> tail();
    public abstract boolean isEmpty();
    public abstract List<A> setHead(A h);
    public List<A> cons(A a) {
        return new Cons<>(a, this);
    }
    public abstract String toString();
    public abstract List<A> drop(Integer n);
    public abstract List<A> dropWhile(Function<A, Boolean> function);

    @SuppressWarnings("rawtypes")
    public static final List NIL = new Nil();

    private List() {
    }

    private static class Nil<A> extends List<A> {

        private Nil() {
        }

        public A head() {
            throw new IllegalStateException("head called en empty list");
        }

        public List<A> tail() {
            throw new IllegalStateException("tail called en empty list");
        }

        public boolean isEmpty() {
            return true;
        }

        public List<A> setHead(A h) {
            throw new IllegalStateException("SetHead called on an empty list");
        }

        public String toString() {
            return "[NIL]";
        }

        public List<A> drop(Integer n) {
            return this;
        }

        public List<A> dropWhile(Function<A, Boolean> function) {return this;}
    }

    private static class Cons<A> extends List<A> {

        private final A head;
        private final List<A> tail;

        private Cons(A head, List<A> tail) {
            this.head = head;
            this.tail = tail;
        }

        public A head() {
            return head;
        }

        public List<A> tail() {
            return tail;
        }

        public boolean isEmpty() {
            return false;
        }

        public List<A> setHead(A h) {
            return new Cons<>(h, tail());
        }

        public String toString() {
            return String.format("[%sNIL]",toString(new StringBuilder(),this).eval());
        }

        public List<A> drop(Integer n) {
            return n <= 0
                    ? this
                    : drop_(this,n).eval();
        }

        private TailCall<List<A>> drop_(List<A> list, Integer n) {
            return n <= 0 || list.isEmpty()
                    ? ret(list)
                    : sus(() -> drop_(list.tail(), n - 1));
        }

        private TailCall<StringBuilder> toString(StringBuilder acc, List<A> list) {
            return list.isEmpty()
                    ? ret(acc)
                    : sus(() -> toString(acc.append(list.head()).append(", "),list.tail()));
        }

        public List<A> dropWhile(Function<A,Boolean> f) {
            return dropWhile_(this, f).eval();
        }

        private TailCall<List<A>> dropWhile_(List<A> list, Function<A, Boolean> f) {
            return !list.isEmpty() && f.apply(list.head())
                    ? sus(() -> dropWhile_(list.tail(),f))
                    : ret(list);
        }
    }

    public static <A> List<A> setHead(List<A> list, A h) {
        return list.setHead(h);
    }

    public static <A> List<A> drop(List<A> list, Integer n) {
        return list.drop(n);
    }

    @SuppressWarnings("unchecked")
    public static <A> List<A> list() {
        return NIL;
    }

    @SafeVarargs
    public static <A> List<A> list(A... a) {
        List<A> n = list();
        for (int i = a.length - 1; i >= 0; i--) {
            n = new Cons<>(a[i], n);
        }
        return n;
    }


}
