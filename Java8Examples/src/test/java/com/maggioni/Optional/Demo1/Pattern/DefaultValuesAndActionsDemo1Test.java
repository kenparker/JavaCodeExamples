package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.Car;
import com.maggioni.Optional.Demo1.Eintities.Soundcard;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;

public class DefaultValuesAndActionsDemo1Test {

    DefaultValuesAndActionsDemo1 defaultValuesDemo = new DefaultValuesAndActionsDemo1();
    Soundcard defaultSoundcard = new Soundcard();

    @Test
    public void testCheckAndReturnDefaultUSB() {
        Optional<Soundcard> soundcardOptional = Optional.empty();
        defaultValuesDemo.setDefaultSoundcard(defaultSoundcard);
        Soundcard result = defaultValuesDemo.checkAndReturnSoundcard(soundcardOptional);
        assertEquals(defaultSoundcard, result);
    }

    @Test
    public void testCheckOldWay() {
        Soundcard soundcard = null;
        defaultValuesDemo.setDefaultSoundcard(defaultSoundcard);
        Soundcard result = defaultValuesDemo.checkAndReturnSoundcardTheOldWay(soundcard);
        assertEquals(defaultSoundcard, result);
    }

    @Test
    public void testValueReturnedFromCar() {
        String valueToTest = "125";
        Car car = new Car(valueToTest);
        String returnValue = defaultValuesDemo.checkAndReturnFromCar(car);
        assertEquals(valueToTest, returnValue);
    }

    @Test
    public void testValueWhenCarEmpty() {
        String valueToTest = "999";
        Car car = null;
        String returnValue = defaultValuesDemo.checkAndReturnFromCar(car);
        assertEquals(valueToTest, returnValue);
    }
}
