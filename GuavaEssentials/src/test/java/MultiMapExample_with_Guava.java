
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maggioni
 */
public class MultiMapExample_with_Guava {

    @Test
    public void multipleMapExample_with_guava() {

        Multimap<String, String> outdoorElements = ArrayListMultimap.create();
        outdoorElements.put("fish", "walleye");
        outdoorElements.put("fish", "muskellunge");
        outdoorElements.put("fish", "bass");
        outdoorElements.put("insect", "ants");
        outdoorElements.put("insect", "water boatman");
        outdoorElements.put("insect", "Lord Howe Island stick insect");
        outdoorElements.put("tree", "oak");
        outdoorElements.put("tree", "birch");

        Collection<String> fishies = outdoorElements.get("fish");

        System.out.println(fishies);

        assertTrue(fishies.size() == 3);
    }
}
