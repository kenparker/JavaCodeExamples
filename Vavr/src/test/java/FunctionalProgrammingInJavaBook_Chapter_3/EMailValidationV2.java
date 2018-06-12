package FunctionalProgrammingInJavaBook_Chapter_3;

import org.assertj.core.api.Condition;
import org.junit.Test;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class EMailValidationV2 {

    static Pattern emailPattern =
            Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

    static Function<String, Result> emailChecker = s -> {
        if (s == null) return new Result.Failure("eMail must not be null");
        else if (s.length() == 0) return new Result.Failure("eMail must not be empty");
        else if (emailPattern.matcher(s).matches()) return new Result.Success(s);
        else return new Result.Failure("email " + s + "  is invalid");
    };

    String eMail;
    private Result result;

    Supplier<Executable> executableSendVerification = () -> () -> sendVerificationMail(eMail);
    Supplier<Executable> executableLogError = () -> () -> logError(((Result.Failure) result).getMessage());

    public Executable validate(String s) {
        result = emailChecker.apply(eMail);
        return result instanceof Result.Success
                ? executableSendVerification.get()
                : executableLogError.get();
    }

    private static void logError(String s) {
        System.out.println("Error message logged: " + s);
    }

    private static void sendVerificationMail(String s) {
        System.out.println("Mail sent to : " + s);
    }

    @Test
    public void givenAInvalidMail_whenChecked_thenResultIsFailure() {
        eMail = "this.is@my.email";
        validate(eMail).exec();
    }

    @Test
    public void givenANull_whenChecked_thenResultIsFailure() {
        eMail = null;
        validate(eMail).exec();
    }

    @Test
    public void givenAEmpty_whenChecked_thenResultIsFailure() {
        eMail = "";
        validate(eMail).exec();
    }

    @Test
    public void givenACorrecteMail_whenChecked_thenResultIsSuccess() {
        eMail = "ken@parker.de";
        validate(eMail).exec();
    }
}
