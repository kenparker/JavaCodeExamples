import org.junit.*;
import org.pcollections.HashPMap;
import org.pcollections.HashTreePMap;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class HashPMapTest {
    public static final String ADAM = "Adam";
    public static final String BONNIE = "Bonnie";
    public static final String EVE = "Eve";
    public static final String CLYDE = "Clyde";
    public static final String FRED = "Fred";
    public static final String GINGER = "Ginger";
    private HashPMap pMap;
    private Integer pMapSize;

    @Before
    public void setUp() throws Exception {
        pMap = HashTreePMap.empty();
        pMap = pMap.plus(ADAM,EVE);
        pMap = pMap.plus(BONNIE,CLYDE);
        pMapSize = pMap.size();
    }

    @Test
    public void givenNewElement_whenPlus_thenElementIsAdded() {
        HashPMap<String, String> plus = pMap.plus(FRED, GINGER);
        assertThat(plus.size()).isEqualTo(pMapSize + 1);
        assertThat(plus).isNotEqualTo(pMap);
    }

    @Test
    public void givenAExistingElement_whenPlus_thenOldElementIsReplaced() {
        final String eve = "EVE";
        HashPMap<String, String> plus = pMap.plus(ADAM, eve);
        assertThat(plus.get(ADAM)).isEqualTo(eve);
    }

    @Test
    public void givenAMap_whenPlusAll_thenMapElementsAreAdded() {
        Map<String, String> map = new HashMap<>();
        map.put("Romeo", "Juliet");
        map.put("Cesar", "Cleopatra");
        map.put("Harry", "Sally");

        HashPMap<String, String> plusAll = pMap.plusAll(map);
        assertThat(plusAll.size()).isEqualTo(pMapSize + map.size());
        assertThat(pMap.size()).isEqualTo(pMapSize);
        assertThat(plusAll.containsKey("Romeo")).isTrue();
    }

    @Test
    public void givenSomeElement_whenCheckExistence_thenResultIsTrueOrFalse() {
        boolean containsKeyFred = pMap.containsKey(FRED);
        boolean containsKeyAdam = pMap.containsKey(ADAM);

        assertThat(containsKeyAdam).isTrue();
        assertThat(containsKeyFred).isFalse();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void givenAPMap_whenClear_thenResultISUnsupportedOperationException() {
        pMap.clear();
    }

    @Test
    public void givenAMap_whenEntrySet_thenResultIsASetEntries() {
        Set<Map.Entry<String, String>> entries = pMap.entrySet();
        assertThat(entries.size()).isEqualTo(pMapSize);
    }

    @Test
    public void givenAPMap_whenForEach_thenIterateOverPMap() {
        pMap.forEach((o, o2) -> System.out.println(o + " " + o2));
    }

    @Test
    public void givenAnElement_whenMinus_thenResultIsAPMapWithoutElement() {
        HashPMap minus = pMap.minus(ADAM);
        assertThat(minus.containsKey(ADAM)).isFalse();
        assertThat(minus.size()).isEqualTo(pMapSize - 1);
    }

    @Test
    public void givenAList_whenMinusAll_thenResultIsPMapWithoutListElements() {
        System.out.println(pMap);
        List<String> listOfKeys = List.of(ADAM,FRED);
        HashPMap minusAll = pMap.minusAll(listOfKeys);
        System.out.println(minusAll);
    }
}
