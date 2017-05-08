package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.Car;
import com.maggioni.Optional.Demo1.Eintities.Soundcard;
import java.util.Optional;

public class DefaultValuesAndActionsDemo1 {

    private Soundcard defaultSoundcard;
    private Car defaultCar;

    public void setDefaultSoundcard(Soundcard defaultSoundcard) {
        this.defaultSoundcard = defaultSoundcard;
    }

    public void setDefaultCar(Car defaultCar) {
        this.defaultCar = defaultCar;
    }
    
    public Soundcard checkAndReturnSoundcardJava8(Soundcard soundcard) {
        Optional<Soundcard> soundcardOptional = Optional.ofNullable(soundcard);
        return soundcardOptional.orElse(defaultSoundcard);
    }

    public Soundcard checkAndReturnSoundcardTheOldWay(Soundcard soundcard) {
        return soundcard != null ? soundcard : defaultSoundcard;
    }

    public Car checkAndReturnFromCarJava8(Car car) {
        Optional<Car> carOptional = Optional.ofNullable(car);
        return carOptional.orElse(defaultCar);       
    }
    
    public Car chechAndReturnFromCarOldWay(Car car) {
        return car != null ? car : defaultCar;
    }
}
