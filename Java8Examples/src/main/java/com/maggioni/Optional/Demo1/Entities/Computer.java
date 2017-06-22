package com.maggioni.Optional.Demo1.Entities;

import java.util.Optional;

public class Computer {


    private Optional<Soundcard> soundcard;

    public Computer() {
        soundcard = Optional.empty();
    }

    public Computer(Optional<Soundcard> soundcard) {
        this.soundcard = soundcard;
    }
    
    public Optional<Soundcard> getSoundcard() {
        return soundcard;
    }
}
