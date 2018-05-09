package com.maggioni.NoMoreIfs;

import io.vavr.Function1;
import io.vavr.control.Option;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.BiConsumer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.ThrowableAssert.*;

public class ReadParameters {

    Set<String> setOfStrings = new HashSet<>();
    Map<String, Set<String>> parameters = new HashMap<>();

    String param2 = "Hello";
    String param1 = "PincoPallo";
    Float value1 = 125000.0f;
    Float value2 = 5000000.0f;

    @Before
    public void setUp() throws Exception {
        setOfStrings.clear();
        parameters.clear();
    }

    public Optional<Float> readFloatParameterUsingIfs(String param, Map<String, Set<String>> parameters) {
        final Set<String> values = parameters.get(param);
        if (values == null | values.size() != 1) {
            return Optional.empty();
        }
        String valueAsString = values.iterator().next();
        Float valueAsFloat;

        try {
            valueAsFloat = Float.parseFloat(valueAsString);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
        return Optional.of(valueAsFloat);
    }

    public Optional<Float> readFloatParametersUsingOptionalsAndTryCatch(String param, Map<String, Set<String>> parameters) {
        return Optional.ofNullable(parameters.get(param))
                .filter(values -> values.size() == 1)
                .map(values -> values.iterator().next())
                .map(value -> {
                    try {
                        return Float.parseFloat(value);
                    } catch (NumberFormatException e) {
                        return null;
                    }
                });
    }

    public Optional<Float> readFloatParametersUsingOptionalsAndFlatMap(String param, Map<String, Set<String>> parameters) {
        return Optional.ofNullable(parameters.get(param))
                .filter(values -> values.size() == 1)
                .map(values -> values.iterator().next())
                .flatMap((value) -> Optional.of(Float.parseFloat(value)));
    }

    public Optional<Float> readFloatParametersUsingOptionVavr(String parm, Map<String, Set<String>> parameters) {
        return Option.of(parameters.get(parm))
                .filter(values -> values.size() == 1)
                .map(values -> values.iterator().next())
                .flatMap(Function1.lift(Float::parseFloat))
                .toJavaOptional();
    }

    @Test
    public void givenASetWithOneValue_whenReadFloatParametersIsCalled_thenReturnOptionalContainsValue() {
        BiConsumer<Float, Optional<Float>> assertThatOptional = (val, optionalValue) -> assertThat(optionalValue)
                .isPresent()
                .hasValue(val);

        setOfStrings.add(value1.toString());
        parameters.put(param2, setOfStrings);

        Optional<Float> optionalValue = readFloatParameterUsingIfs(param2, parameters);
        assertThatOptional.accept(value1, optionalValue);

        optionalValue = readFloatParametersUsingOptionalsAndTryCatch(param2, parameters);
        assertThatOptional.accept(value1, optionalValue);

        optionalValue = readFloatParametersUsingOptionVavr(param2, parameters);
        assertThatOptional.accept(value1, optionalValue);

    }

    @Test
    public void givenASetWithMoreValues_whenReadFloatParametersIsCalled_thenReturnOptionalIsEmpty() {
        setOfStrings.add(value1.toString());
        setOfStrings.add(value2.toString());

        parameters.put(param1, setOfStrings);

        Optional<Float> optionalValue = readFloatParameterUsingIfs(param1, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionalsAndTryCatch(param1, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionVavr(param1, parameters);
        assertThat(optionalValue)
                .isEmpty();
    }

    @Test
    public void givenAnEmpty_whenReadFloatParametersIsCalled_thenReturnOptionalIsEmpty() {
        parameters.put(param1, setOfStrings);

        Optional<Float> optionalValue = readFloatParameterUsingIfs(param1, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionalsAndTryCatch(param1, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionVavr(param1, parameters);
        assertThat(optionalValue)
                .isEmpty();
    }

    @Test
    public void givenAnInvalidValue_whenReadFloatParametersIsCalled_thenReturnOptionalIsEmpty() {
        setOfStrings.add("InvalidValue");

        parameters.put(param1, setOfStrings);

        Optional<Float> optionalValue = readFloatParameterUsingIfs(param1, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionalsAndTryCatch(param1, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionVavr(param1, parameters);
        assertThat(optionalValue)
                .isEmpty();
    }

    @Test
    public void givenAnInvalidValue_whenReadFloatParametersIsCalled_thenNumberformatException() {
        setOfStrings.add("InvalidValue");

        parameters.put(param1, setOfStrings);

        ThrowingCallable callable = () -> readFloatParametersUsingOptionalsAndFlatMap(param1, parameters);
        assertThatCode(callable)
                .isInstanceOf(NumberFormatException.class);
    }
}
