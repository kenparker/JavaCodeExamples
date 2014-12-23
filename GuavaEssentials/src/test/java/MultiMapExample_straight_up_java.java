
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maggioni
 */
public class MultiMapExample_straight_up_java {

    public MultiMapExample_straight_up_java() {
    }

    @Test
    public void multiMap_example_straight_up_java() {

        Map<String, List<String>> outdoorElements = new HashMap<String, List<String>>();
        putObjects(outdoorElements, "fish", "walleye");
        putObjects(outdoorElements, "fish", "muskellunge");
        putObjects(outdoorElements, "fish", "bass");
        putObjects(outdoorElements, "insect", "ants");
        putObjects(outdoorElements, "insect", "water boatman");
        putObjects(outdoorElements, "insect", "Lord Howe Island stick insect");
        putObjects(outdoorElements, "tree", "oak");
        putObjects(outdoorElements, "tree", "birch");

        Collection<String> fishies = outdoorElements.get("fish");

        System.out.println(fishies);;

        assertTrue(fishies.size() == 3);
    }

    private void putObjects(Map<String, List<String>> outdoorElements, String key, String value) {
        List<String> myClassList = outdoorElements.get(key);
        if (myClassList == null) {
            myClassList = new ArrayList<String>();
            outdoorElements.put(key, myClassList);
        }
        myClassList.add(value);

    }
}
