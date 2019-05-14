import cyclops.companion.Groups;
import cyclops.data.Vector;
import cyclops.function.Group;
import cyclops.function.Monoid;
import cyclops.function.Semigroup;
import org.junit.Test;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import static org.assertj.core.api.Assertions.assertThat;


public class MonoidTest {
        Function<Integer, Function<Integer, Integer>> f = a -> b -> a + b;
        Integer zero = 0;
        Monoid<Integer> s = Monoid.of(zero,f );

        // https://medium.com/@johnmcclean/monoids-for-java-developers-98e2ba94f708
        // https://dgronau.wordpress.com/2012/03/30/monoide-in-java/
    // https://sites.google.com/a/athaydes.com/renato-athaydes/posts/java8haskellfpandmonoids
    @Test
    public void name() {

        // https://dzone.com/articles/fist-full-monoids
        final Integer apply = s.apply(1, Monoid.of(zero,f).apply(5).apply(2));
        final Integer zeror = s.zero();
        System.out.println(apply + " " + zeror);

    }

    @Test
    public void name2() {
        Vector<Integer> vector = Vector.of(1,5,2);
        final Vector<Integer> cycle = vector.cycle(s, 1);
        System.out.println(cycle);

    }

    @Test
    public void name3() {
        UnaryOperator<Integer> x = num -> num * -1;
        Group<Integer> g = Group.of(x,s);

        final Integer invert = g.invert(g.apply(5,2));
        System.out.println(invert);

    }

    @Test
    public void name4() {
        final Group<Integer> intSum = Groups.intSum;
        final Integer invert = intSum.invert(intSum.apply(5, 2));
        System.out.println(invert);
    }
}