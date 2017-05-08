package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.Car;
import com.maggioni.Optional.Demo1.Eintities.Soundcard;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

public class DefaultValuesAndActionsDemo1Test {

    DefaultValuesAndActionsDemo1 defaultValuesDemo = new DefaultValuesAndActionsDemo1();
    Soundcard defaultSoundcard = new Soundcard();
    Car defaultCar = new Car();

    @Before
    public void setupBefore() {
        defaultValuesDemo.setDefaultSoundcard(defaultSoundcard);
        defaultValuesDemo.setDefaultCar(defaultCar);
    }
    
    @Test
    public void testReturnedValuesWhenSoundcardIsNull() {
        Soundcard soundcard = null;
        assertReturnedValues(soundcard, defaultSoundcard);
    }

    @Test
    public void testReturnedValuesWhenSoundcardIsNotNull() {
        Soundcard soundcard = new Soundcard();
        assertReturnedValues(soundcard, soundcard);
    }
    
    private void assertReturnedValues(Soundcard soundcard, Soundcard soundcardExpected) {
        assertReturnedValuesFromJava8AndOldWaysAreEquals(soundcard);
        assertReturnedValuesAreEqualsToExpected(soundcard, soundcardExpected);
    }
    
    private void assertReturnedValuesFromJava8AndOldWaysAreEquals(Soundcard soundcard) {
        Soundcard checkAndReturnSoundcardJava8 = defaultValuesDemo.checkAndReturnSoundcardJava8(soundcard);
        Soundcard checkAndReturnSoundcardTheOldWay = defaultValuesDemo.checkAndReturnSoundcardTheOldWay(soundcard);
        assertEquals(checkAndReturnSoundcardJava8, checkAndReturnSoundcardTheOldWay);
    }

    private void assertReturnedValuesAreEqualsToExpected(Soundcard soundcard, Soundcard soundcardExpected) {
        Soundcard checkAndReturnSoundcardJava8 = defaultValuesDemo.checkAndReturnSoundcardJava8(soundcard);
        assertEquals(soundcardExpected, checkAndReturnSoundcardJava8);
    }
    

    @Test
    public void testValueReturnedWhenCarIsNotNull() {
        Car car = new Car();
        car.setValue("123");
        assertValuesforCar(car, car);
    }

    @Test
    public void testValueReturnedWhenCarNull() {     
        Car car = null;
        assertValuesforCar(car, defaultCar);
    }
    
    private void assertValuesforCar(Car car, Car carExpected) {
        Car checkAndReturnFromCarJava8 = defaultValuesDemo.checkAndReturnFromCarJava8(car);
        Car chechAndReturnFromCarOldWay = defaultValuesDemo.chechAndReturnFromCarOldWay(car);
        assertEquals(checkAndReturnFromCarJava8, chechAndReturnFromCarOldWay);
        assertEquals(carExpected, checkAndReturnFromCarJava8);
    }

}
