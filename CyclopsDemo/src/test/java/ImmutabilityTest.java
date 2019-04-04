import cyclops.data.ImmutableList;
import cyclops.data.Vector;
import org.assertj.core.api.ThrowableAssert;
import org.junit.Test;

import javax.naming.ldap.UnsolicitedNotification;
import java.lang.instrument.UnmodifiableClassException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.ThrowableAssert.*;


public class ImmutabilityTest {

    private String a = "Tom";
    private String b = "Marc";
    private String c = "Lucy";
    private String d = "Bert";

    @Test
    public void givenUsingJava8List_whenListIsCreated_thenListIsMutable() {
        List<String> java8MutableList = new ArrayList<>(Arrays.asList(a,b,c));
        java8MutableList.add(d);
        assertThat(java8MutableList).contains(d);
    }

    @Test
    public void givenUsingCyclopsVector_whenVectorIsCreated_thenVectorIsImmutable() {
        Vector<String> vector = Vector.of(a, b, c);
        vector.append(d);
        assertThat(vector).doesNotContain(d);
        assertThat(vector).isInstanceOf(ImmutableList.class);
    }

    @Test
    public void givenUsingJava8List_whenUnmodifiableListIsCreated_thenListIsImmutable() {
        List<String> java8List = new ArrayList<>(Arrays.asList(a,b,c));
        List<String> unmodifiableList = Collections.unmodifiableList(java8List);
        ThrowingCallable throwingCallable = () -> unmodifiableList.add(d);
        assertThatExceptionOfType(UnsupportedOperationException.class).isThrownBy(throwingCallable);
    }

    @Test
    public void givenUsingJava9List_whenListIsCreated_thenListIsImmutable() {
        List<String> java9List = List.of(a, b, c);
        ThrowingCallable throwingCallable = () -> java9List.add(d);
        assertThatExceptionOfType(UnsupportedOperationException.class).isThrownBy(throwingCallable);
    }
}