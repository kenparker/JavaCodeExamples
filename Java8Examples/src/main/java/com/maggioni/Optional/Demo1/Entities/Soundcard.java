package com.maggioni.Optional.Demo1.Entities;

import java.util.Optional;

public class Soundcard {

    private Optional<USB> usb;

    public Soundcard() {
        usb = Optional.empty();
    }
    
    public Soundcard(Optional<USB> usb) {
        this.usb = usb;
    }
    
    public Optional<USB> getUSB() {
        return usb;
    }
}
