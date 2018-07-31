package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_1;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_3.Result;
import org.junit.Test;

import java.util.function.BiConsumer;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class EMailValidationV1 {

    static Pattern emailPattern =
            Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

    static Function<String, Result> emailChecker = s -> {
        if (s == null) return new Result.Failure("eMail must not be null");
        else if (s.length() == 0) return new Result.Failure("eMail must not be empty");
        else if (emailPattern.matcher(s).matches()) return new Result.Success(s);
        else return new Result.Failure("email " + s + "  is invalid");
    };

    String eMail;
    Result result;
    String containsError;
    BiConsumer<Result, String> assertEMailIsWrong = (result, containsError) -> {
        assertThat(result).isInstanceOf(Result.Failure.class);
        assertThat(((Result.Failure) result).getMessage()).containsIgnoringCase(containsError);
    };

    @Test
    public void givenAInvalidMail_whenChecked_thenResultIsFailure() {
        eMail = "this.is@my.email";
        result = emailChecker.apply(eMail);

        containsError = "invalid";
        assertEMailIsWrong.accept(result, containsError);
    }

    @Test
    public void givenANull_whenChecked_thenResultIsFailure() {
        eMail = null;
        result = emailChecker.apply(eMail);

        containsError = "not be null";
        assertEMailIsWrong.accept(result, containsError);
    }

    @Test
    public void givenAEmpty_whenChecked_thenResultIsFailure() {
        eMail = "";
        result = emailChecker.apply(eMail);

        containsError = "not be empty";
        assertEMailIsWrong.accept(result, containsError);
    }

    @Test
    public void givenACorrecteMail_whenChecked_thenResultIsSuccess() {
        eMail = "ken@parker.de";
        result = emailChecker.apply(eMail);

        assertThat(result).isInstanceOf(Result.Success.class);

    }
}
