package SubclassingBuilder;

import com.maggioni.SubclassingBuilder.GMDFacts;
import org.junit.Test;

public class GMDFactsTest {

    @Test
    public void name() {

        new GMDFacts.Builder().GMO(true).calories(20).build();
        new GMDFacts.Builder().calories(20).GMO(true).build();
    }
}