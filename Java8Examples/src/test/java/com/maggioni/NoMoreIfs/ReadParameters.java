package com.maggioni.NoMoreIfs;

import io.vavr.Function1;
import io.vavr.control.Option;
import org.junit.Test;

import java.util.*;
import java.util.function.BiConsumer;

import static org.assertj.core.api.Assertions.assertThat;

public class ReadParameters {

    Set<String> setOfStrings = new HashSet<>();
    Map<String, Set<String>> parameters = new HashMap<>();

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

    public Optional<Float> readFloatParametersUsingOptionals(String param, Map<String, Set<String>> parameters) {
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

        String param = "Hello";
        Float value = 125000.0f;

        setOfStrings.add(value.toString());

        parameters.put(param, setOfStrings);

        Optional<Float> optionalValue = readFloatParameterUsingIfs(param, parameters);
        assertThatOptional.accept(value, optionalValue);

        optionalValue = readFloatParametersUsingOptionals(param, parameters);
        assertThatOptional.accept(value, optionalValue);

        optionalValue = readFloatParametersUsingOptionVavr(param, parameters);
        assertThatOptional.accept(value, optionalValue);

    }

    @Test
    public void givenASetWithMoreValues_whenReadFloatParametersIsCalled_thenReturnOptionalIsEmpty() {
        String param = "PincoPallo";
        Float value1 = 125000.0f;
        Float value2 = 5000000.0f;

        setOfStrings.clear();
        setOfStrings.add(value1.toString());
        setOfStrings.add(value2.toString());

        parameters.put(param, setOfStrings);

        Optional<Float> optionalValue = readFloatParameterUsingIfs(param, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionals(param, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionVavr(param, parameters);
        assertThat(optionalValue)
                .isEmpty();
    }

    @Test
    public void givenAnEmpty_whenReadFloatParametersIsCalled_thenReturnOptionalIsEmpty() {
        String param = "PincoPallo";

        setOfStrings.clear();

        parameters.put(param, setOfStrings);

        Optional<Float> optionalValue = readFloatParameterUsingIfs(param, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionals(param, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionVavr(param, parameters);
        assertThat(optionalValue)
                .isEmpty();
    }

    @Test
    public void givenAnInvalidValue_whenReadFloatParametersIsCalled_thenReturnOptionalIsEmpty() {
        String param = "PincoPallo";


        setOfStrings.clear();
        setOfStrings.add("InvalidValue");

        parameters.put(param, setOfStrings);

        Optional<Float> optionalValue = readFloatParameterUsingIfs(param, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionals(param, parameters);
        assertThat(optionalValue)
                .isEmpty();

        optionalValue = readFloatParametersUsingOptionVavr(param, parameters);
        assertThat(optionalValue)
                .isEmpty();
    }
}
