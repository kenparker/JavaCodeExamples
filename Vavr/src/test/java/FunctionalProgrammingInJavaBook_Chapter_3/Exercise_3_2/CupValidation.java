package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_2;

import Entities.Cup;
import FunctionalProgrammingInJavaBook_Chapter_3.Effect;
import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_3.Result;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_2.Case.*;

import java.util.function.Consumer;

public class CupValidation {

    Cup cup1;
    Cup cup2;
    Cup cup3;
    Cup cup4;
    Cup cup5;

    Consumer<Cup> cupNull = cup -> System.out.println("cup is null");
    Effect<Cup> effCupNull = cup -> System.out.println("cup is null");
    Consumer<Cup> cupEmpty = cup -> System.out.println("cup is empty");
    Consumer<Cup> cupIsOK = cup -> System.out.println("Cup " + cup + " is ok");
    Consumer<Cup> cupMario = cup -> System.out.println("cup mario");
    Consumer<Cup> cupAngelo = cup -> System.out.println("cup Angelo");
    Consumer<Cup> cupDefault = cup -> System.out.println("cup Default");

    Effect<Cup> cupImperativeEvaluation = cup -> {
        if (cup == null) {
                cupNull.accept(cup);
        } else {
            if (cup.field() == null || cup.field().isEmpty()) {
                cupEmpty.accept(cup);
            } else {
                cupIsOK.accept(cup);
                if (cup.field().equals("Mario")) {
                    cupMario.accept(cup);
                } else {
                    if (cup.field().equals("Angelo")) {
                        cupAngelo.accept(cup);
                    } else {
                        cupDefault.accept(cup);
                    }
                }
            }
        }

    };

    Function<Cup, Result<Cup>> cupValidationFunctional = cup -> match(
            null,
            mcase(() -> cup == null, () -> Result.success(cup))
    );

    @Before
    public void setUp() throws Exception {
        cup1 = Cup.builder()
                .field("Angelo")
                .build();
        cup2 = Cup.builder().build();
        cup3 = null;
        cup4 = Cup.builder()
                .field("Mario")
                .build();
        cup5 = Cup.builder()
                .field("Enrico")
                .build();
    }

    @Test
    public void cupTest() {
        cupImperativeEvaluation.apply(cup1);
        Result<Cup> result = cupValidationFunctional.apply(cup3);
        result.bind(effCupNull,null);
    }

    @Test
    public void cupTestFunctional() {

        Result<Cup> result = cupValidationFunctional.apply(cup3);
        result.bind(effCupNull,null);
    }
}
