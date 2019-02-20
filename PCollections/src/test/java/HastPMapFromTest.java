
import org.junit.Test;
import org.pcollections.HashPMap;
import org.pcollections.HashTreePMap;

import static org.assertj.core.api.Assertions.*;

public class HastPMapFromTest {

    @Test
    public void testFrom() {
        HashPMap<String,Double> mapA = HashTreePMap.empty();
        mapA = mapA.plus("A", 125.55);
        HashPMap<String,Double> mapB = HashTreePMap.from(mapA);

        System.out.println(" " + !(mapA != mapB));
        System.out.println(mapB);

        mapA = HashTreePMap.empty();
        System.out.println(mapB);

        assertThat(mapA).isNotSameAs(mapB);

    }
}
