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
    public abstract List<A> reverse();
    public abstract List<A> init();
    public abstract Integer length();
    public abstract <B> B foldLeft(B identity, Function<B, Function<A,B>> f);

    public <B> B foldRight(B identity, Function<A, Function<B, B>> f) {
        return reverse().foldLeft(identity, x -> y -> f.apply(y).apply(x));
    }

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
        public List<A> reverse() {return this;}
        public List<A> init() {throw new IllegalStateException("Init called en empty list");}
        public Integer length() {throw new IllegalStateException("length called en empty list");}
        public <B> B foldLeft(B identity, Function<B, Function<A,B>> f) {
            return identity;
        }
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

        public List<A> reverse() {
            return reverse_(list(),this).eval();
        }

        public TailCall<List<A>> reverse_(List<A> acc, List<A> list) {
            return list.isEmpty()
                    ? ret(acc)
                    : sus(() -> reverse_(new Cons<>(list.head(),acc),list.tail()));
        }

        public List<A> init() {
            return this.reverse().tail().reverse();
        }

        private TailCall<List<A>> dropWhile_(List<A> list, Function<A, Boolean> f) {
            return !list.isEmpty() && f.apply(list.head())
                    ? sus(() -> dropWhile_(list.tail(),f))
                    : ret(list);
        }

        public Integer length() {
            return foldRight(this, 0 , x -> y -> y + 1);
        }

        public <B> B foldLeft(B identity, Function<B, Function<A, B>>f) {
            return foldLeft_(identity,this,f).eval();
        }

        private <B> TailCall<B> foldLeft_(B acc, List<A> list, Function<B, Function<A,B>> f) {
            return list.isEmpty()
                    ? ret(acc)
                    : sus(() -> foldLeft_(f.apply(acc).apply(list.head()),list.tail(), f));
        }
    }

    public static <A> List<A> setHead(List<A> list, A h) {
        return list.setHead(h);
    }

    public static <A> List<A> drop(List<A> list, Integer n) {
        return list.drop(n);
    }

    public static <A> List<A> reverse(List<A> list) {
        return list.reverse();
    }

    public static <A> List<A> init(List<A> list) {
        return list.init();
    }

    public static <A> List<A> concat(List<A> list1, List<A> list2) {
        return foldRightViaFoldLeft(list1,list2, x -> y -> new Cons<>(x,y));
    }

    public static <A,B> B foldRight(List<A> list, B n, Function<A, Function<B,B>> f) {
        return list.isEmpty()
                ? n
                : f.apply(list.head()).apply(foldRight(list.tail(),n, f));
    }

    public static <A,B> B foldRightViaFoldLeft(List<A> list, B n, Function<A, Function<B,B>> f) {
        return list.reverse()
                .foldLeft(n, x -> y -> f.apply(y).apply(x));
    }

    public static <A> List<A> flatten(List<List<A>> list) {
        return foldRightViaFoldLeft(list,List.<A>list(),x -> y -> concat(x,y));
    }

    public static Integer sumViaFoldLeft(List<Integer> list) {
        return list.foldLeft(0, x -> y -> x + y);
    }

    public static Double productViaFoldLeft(List<Double> list) {
        return list.foldLeft(1.0, x -> y -> x * y);
    }

    public static <A> Integer lengthViaFoldLeft(List<A> list) {
        return list.foldLeft(0, x -> ignore -> x + 1);
    }

    public static <A> List<A> reverseViaFoldLeft(List<A> list) {
        return list.foldLeft(list(), x -> a -> x.cons(a));
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
