package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_2_bis;

import Entities.Cup;
import FunctionalProgrammingInJavaBook_Chapter_3.Effect;
import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Before;
import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_2_bis.Case.*;
import static org.assertj.core.api.Assertions.*;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CupValidation {

    Cup cup1;
    Cup cup2;
    Cup cup3;
    Cup cup4;
    Cup cup5;

    Consumer<Cup> cupNull = cup -> System.out.println("cup is null");
    Effect<Cup> effCupNullSuccess = cup -> System.out.println("cup is null");
    Effect<Cup> effCupNullFailure = cup -> System.out.println("something else");
    Effect<Cup> defaultCase = cup -> System.out.println("Default Case");
    Supplier<Effect<Cup>> ddd = () -> a -> defaultCase.apply(a);
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

    Function<Cup,
            Function<Supplier<Effect<Cup>>,
                    Function<Supplier<Effect<Cup>>,
                                        Effect<Cup>>>> cupValidationFunctional = cup -> success -> failure -> match(
                    macaseDefault(() -> defaultCase ),
                    mcase(() -> cup == null,success,failure)
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

    }

    @Test
    public void cupTestFunctional() {
        Effect<Cup> effect = cupValidationFunctional.apply(cup3).apply(effCupNullSuccess).apply(effCupNullFailure);
        effect.apply(cup3);
    }
}
