package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_2;

import FunctionalProgrammingInJavaBook_Chapter_3.Effect;
import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_3.Result;
import org.junit.Test;

import java.util.regex.Pattern;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_2.Case.match;
import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_2.Case.mcase;
import static FunctionalProgrammingInJavaBook_Chapter_3.Result.failure;
import static FunctionalProgrammingInJavaBook_Chapter_3.Result.success;

public class EMailValidation {

    static Pattern emailPattern =
            Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");


    Effect<String> logError = s -> System.out.println("Error message logged: " + s);;
    Effect<String> sendVerificationMail = s -> System.out.println("Mail sent to : " + s);

    @Test
    public void test() {
        emailChecker.apply("this.is@my.email").bind(sendVerificationMail,logError);
        emailChecker.apply(null).bind(sendVerificationMail,logError);
        emailChecker.apply("").bind(sendVerificationMail,logError);
        emailChecker.apply("hey@good.de").bind(sendVerificationMail,logError);
    }

    @Test
    public void testOneOneCase() {
        emailChecker.apply("this.is@my.email").bind(sendVerificationMail,logError);
    }

    static Function<String, Result<String>> emailChecker = s -> match(
            mcase(() -> success(s)),
            mcase(() -> s == null, () -> failure("email must not be null")),
            mcase(() -> s.length() == 0, () -> failure("email must not be empty")),
            mcase(() -> !emailPattern.matcher(s).matches(), () -> failure("email " + s + " is invalid"))
    );
}
