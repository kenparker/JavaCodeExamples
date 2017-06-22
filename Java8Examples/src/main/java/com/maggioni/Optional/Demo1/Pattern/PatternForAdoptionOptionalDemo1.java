package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Entities.Computer;
import com.maggioni.Optional.Demo1.Entities.Soundcard;
import com.maggioni.Optional.Demo1.Entities.USB;
import java.util.Optional;

public class PatternForAdoptionOptionalDemo1 {

    
    public static void main(String[] args) {
        
    }
    
    public String getVersion(Computer computer) {
        
        Optional<Computer> computerOptional = Optional.ofNullable(computer);
        
        String name = computerOptional.flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUSB)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
        return name;
    }
    
}
