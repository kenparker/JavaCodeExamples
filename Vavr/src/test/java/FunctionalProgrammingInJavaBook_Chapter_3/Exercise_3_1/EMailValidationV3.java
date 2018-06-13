package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_1;

import FunctionalProgrammingInJavaBook_Chapter_3.Effect;
import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_3.Result;
import org.junit.Test;

import java.util.function.Supplier;
import java.util.regex.Pattern;

import static FunctionalProgrammingInJavaBook_Chapter_3.Result.failure;
import static FunctionalProgrammingInJavaBook_Chapter_3.Result.success;

public class EMailValidationV3 {

    static Pattern emailPattern =
            Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

    static Function<String, Result> emailChecker = s -> {
        return s == null
                ? failure("eMail must not be null")
                : s.length() == 0
                    ? failure("eMail must not be empty")
                    : emailPattern.matcher(s).matches()
                        ? success(s)
                        : failure("email " + s + "  is invalid");
    };

    Effect<String> logError = s -> System.out.println("Error message logged: " + s);;
    Effect<String> sendVerificationMail = s -> System.out.println("Mail sent to : " + s);

    @Test
    public void test() {
        emailChecker.apply("this.is@my.email").bind(sendVerificationMail,logError);
        emailChecker.apply(null).bind(sendVerificationMail,logError);
        emailChecker.apply("").bind(sendVerificationMail,logError);
        emailChecker.apply("hey@good.de").bind(sendVerificationMail,logError);
    }
}
