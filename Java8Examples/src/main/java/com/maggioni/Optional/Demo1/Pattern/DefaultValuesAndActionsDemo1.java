package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.Car;
import com.maggioni.Optional.Demo1.Eintities.Soundcard;
import java.util.Optional;

public class DefaultValuesAndActionsDemo1 {
    
    private Soundcard defaultSoundcard;

    public void setDefaultSoundcard(Soundcard defaultSoundcard) {
        this.defaultSoundcard = defaultSoundcard;
    }

    public Soundcard checkAndReturnSoundcard(Optional<Soundcard> soundcard) {
        return soundcard.orElse(defaultSoundcard);   
    }
    
    public Soundcard checkAndReturnSoundcardTheOldWay(Soundcard soundcard) {
       return soundcard != null ? soundcard : defaultSoundcard;
    }

    public String checkAndReturnFromCar(Car car) {
        Car defaultCar = new Car("999");
        Optional<Car> carOptional = Optional.ofNullable(car);
        Car orElse = carOptional.orElse(defaultCar);
        return orElse.getValue();
    }
}
